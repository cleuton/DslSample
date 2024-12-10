package org.example;

import org.apache.calcite.adapter.java.ReflectiveSchema;
import org.apache.calcite.jdbc.CalciteConnection;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeFactory;
import org.apache.calcite.schema.Table;
import org.apache.calcite.schema.SchemaPlus;

import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {
        // 1. Configurando as propriedades da conexão Calcite
        Properties properties = new Properties();
        properties.setProperty("caseSensitive", "false"); // Sensibilidade a caso desativada

        Connection connection = DriverManager.getConnection("jdbc:calcite:", properties);
        CalciteConnection calciteConnection = connection.unwrap(CalciteConnection.class);

        // 2. Adicionando o esquema "loja"
        SchemaPlus rootSchema = calciteConnection.getRootSchema();
        rootSchema.add("loja", new ReflectiveSchema(new LojaSchema()));

        // 3. Verificando as tabelas e colunas registradas (para debug)
        SchemaPlus lojaSchema = rootSchema.getSubSchema("loja");
        if (lojaSchema == null) {
            System.out.println("Schema 'loja' não encontrado.");
            return;
        }

        for (String tableName : lojaSchema.getTableNames()) {
            System.out.println("Tabela: " + tableName);
            Table table = lojaSchema.getTable(tableName);
            RelDataType rowType = table.getRowType(calciteConnection.getTypeFactory());
            for (org.apache.calcite.rel.type.RelDataTypeField field : rowType.getFieldList()) {
                System.out.println("  Coluna: " + field.getName());
            }
        }

        // 4. Executando a consulta SQL
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
                "SELECT P.id, P.nome, P.preco FROM loja.produtos P WHERE P.preco > 100");

        // 5. Iterando pelos resultados
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id") +
                    ", Nome: " + resultSet.getString("nome") +
                    ", Preço: " + resultSet.getDouble("preco"));
        }

        // 6. Fechando recursos
        resultSet.close();
        statement.close();
        connection.close();
    }

    // Classe representando o esquema "Loja"
    public static class LojaSchema {
        public final Produto[] produtos;

        public LojaSchema() {
            produtos = new Produto[] {
                    new Produto(1, "Notebook", 3500.0),
                    new Produto(2, "Mouse", 50.0),
                    new Produto(3, "Teclado", 150.0),
                    new Produto(4, "Monitor", 700.0)
            };
        }
    }

    // Classe representando a tabela "produtos"
    public static class Produto {
        public final int id;
        public final String nome;
        public final double preco;

        public Produto(int id, String nome, double preco) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
        }
    }
}
