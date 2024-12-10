![](giga.png)

# Domain-specific Languages e SQL

[**Cleuton Sampaio**](https://linkedin.com/in/cleutonsampaio) - Me siga 

[**Rusting Crab**](https://rustingcrab.com) - Veja nosso repo de tecnologia **Rust**

[**Canal**](https://www.youtube.com/@CleutonSampaio) - Se inscreva no meu canal


**DSL** (Linguagens específicas de domínio - [*Wikipedia*](https://pt.wikipedia.org/wiki/Linguagem_de_dom%C3%ADnio_espec%C3%ADfico)) servem a um propósito especifico dentro de uma aplicação, sendo utilizadas para configurar ou obter dados e interagir com ela. Não servem para criar código geral. 

Elas fascinam os desenvolvedores há anos, afinal de contas, `devs` têm dois sonhos na vida: *Criar um compilador* e/ou *criar um sistema operacional*.

Aqui, na [**Giga Software**](https://cleutonsampaio.com), uma área específica da minha empresa, trabalhamos com projetos de clientes envolvendo a criação e uso de **DSLs**. É claro que é um problema difícil e complexo de resolver, gerando mais uma fonte de problemas e mudanças no sistema, mas aumentam muito a flexibilidade da aplicação e maximiza o retorno do investimento para o Cliente. 

## O problema de criar uma DSL

Criar uma linguagem ou mesmo usar um **subset** de uma linguagem existente, pode ser uma grande dor de cabeça. Além da sintaxe, é preciso delimitar o escopo do modelo de objetos com os quais a linguagem devem interagir. E é preciso ensinar o cliente a utilizá-la. 

Usar **SQL** como uma **DSL** em vez de criar uma linguagem própria traz diversas vantagens significativas, especialmente para projetos que envolvem manipulação e consulta de dados. Aqui estão os principais benefícios:

### 1. Maturidade e Padrão Amplamente Aceito

- **Estabilidade:** SQL é uma linguagem consolidada, com décadas de uso e refinamento. Ela passou por múltiplas versões e padrões (como SQL-92, SQL-99, SQL:2016), garantindo estabilidade e confiabilidade.
- **Compatibilidade:** A maioria dos bancos de dados relacionais suporta SQL, o que facilita a integração com diferentes sistemas e plataformas.

### 2. Conhecimento e Familiaridade

- **Adoção Generalizada:** Desenvolvedores, analistas de dados e profissionais de TI estão amplamente familiarizados com SQL. Isso reduz a curva de aprendizado e facilita a contratação e a colaboração.
- **Documentação e Recursos:** Existe uma vasta quantidade de documentação, tutoriais, cursos e comunidades ativas que suportam o aprendizado e a resolução de problemas relacionados ao SQL.

### 3. Ferramentas e Ecossistema Rico

- **Ferramentas de Desenvolvimento:** Existem inúmeras ferramentas de IDE, editores, e ferramentas de visualização de dados que suportam SQL, melhorando a produtividade e a eficiência no desenvolvimento.
- **Integração com BI e Análise de Dados:** Ferramentas de Business Intelligence (como Tableau, Power BI) e frameworks de análise de dados (como Apache Spark) integram-se facilmente com SQL, facilitando a geração de relatórios e insights.

### 4. Otimização e Performance

- **Motores de Consulta Otimizados:** Bancos de dados relacionais possuem otimizadores de consulta avançados que melhoram a performance das consultas SQL, garantindo eficiência na manipulação de grandes volumes de dados.
- **Execução Paralela e Distribuída:** Muitos sistemas de gerenciamento de banco de dados (SGBDs) suportam execução paralela e distribuída de consultas SQL, escalando conforme a necessidade.

### 5. Menor Esforço de Desenvolvimento

- **Evita Reinvenção da Roda:** Criar uma linguagem própria requer um investimento considerável em design, implementação, teste e manutenção. Utilizar SQL aproveita uma linguagem já estabelecida, economizando tempo e recursos.
- **Manutenção Simplificada:** Atualizações e melhorias na linguagem SQL são gerenciadas pela comunidade e pelos fornecedores de SGBDs, aliviando a responsabilidade de manutenção da sua própria linguagem.

### 6. Segurança e Controle de Acesso

- **Gerenciamento de Permissões:** SQL permite um controle granular de acesso a dados através de permissões e roles, facilitando a implementação de políticas de segurança robustas.
- **Prevenção de Injeção de SQL:** Utilizar frameworks que suportam SQL como DSL, como o Apache Calcite, pode ajudar a mitigar riscos de segurança associados à manipulação de consultas dinâmicas.

### 7. Portabilidade e Interoperabilidade

- **Transferência Fácil de Conhecimento:** Consultas SQL podem ser facilmente transferidas ou adaptadas entre diferentes sistemas e aplicações, promovendo a interoperabilidade.
- **Compatibilidade com Diversas Fontes de Dados:** SQL pode ser utilizado para consultar dados de diferentes fontes, como bancos de dados relacionais, arquivos CSV, JSON, APIs, entre outros, especialmente quando usado com frameworks como Apache Calcite.

### 8. Extensibilidade e Personalização

- **Funções e Procedimentos Armazenados:** SQL permite a criação de funções definidas pelo usuário (UDFs) e procedimentos armazenados, que podem ser personalizados para atender a necessidades específicas do domínio.
- **Plugins e Extensões:** Muitos SGBDs suportam extensões e plugins que permitem estender a funcionalidade padrão do SQL, adaptando-o melhor ao contexto da aplicação.

### 9. Facilidade de Depuração e Testes

- **Ferramentas de Debugging:** Existem ferramentas robustas para depurar e testar consultas SQL, facilitando a identificação e correção de erros.
- **Testes Automatizados:** Frameworks de teste podem integrar facilmente consultas SQL, permitindo a automatização de testes e garantindo a qualidade das consultas.

### 10. Escalabilidade e Evolução Contínua

- **Evolução Constante:** SQL continua evoluindo com novas funcionalidades e melhorias, adaptando-se às necessidades modernas de dados e processamento.
- **Escalabilidade:** Bancos de dados que suportam SQL estão preparados para escalar horizontal e verticalmente, acomodando o crescimento das aplicações sem grandes reestruturações.

Embora criar uma linguagem própria possa oferecer uma personalização extrema e atender a necessidades muito específicas, os benefícios de usar SQL como DSL frequentemente superam as vantagens de uma linguagem customizada. SQL oferece uma combinação de robustez, eficiência, e flexibilidade que é difícil de replicar do zero, além de aproveitar um vasto ecossistema de ferramentas, conhecimento e suporte comunitário.

Optar por SQL como DSL permite focar mais na lógica de negócio e na implementação das funcionalidades essenciais da aplicação, enquanto se beneficia de uma linguagem poderosa e bem suportada para manipulação de dados.

## Apache Calcite

![](calcite.png)

**Apache Calcite** é um framework open-source poderoso que permite incorporar consultas SQL em aplicações de forma flexível e eficiente. Ele não é um banco de dados completo, mas fornece as ferramentas necessárias para analisar, otimizar e executar consultas SQL sobre diversas fontes de dados.

### **Por Que Usar Apache Calcite como SQL DSL**

1. **Flexibilidade de Integração**:
   - **Múltiplas Fontes de Dados**: Permite consultar dados de diferentes fontes, como bancos de dados relacionais, arquivos JSON/CSV, APIs e sistemas NoSQL, tudo usando SQL.
   - **Adaptadores Personalizáveis**: Facilita a criação de conectores para fontes de dados específicas, adaptando-se às necessidades do seu projeto.

2. **Otimização Avançada de Consultas**:
   - **Performance Melhorada**: Utiliza um otimizador de consultas robusto que reescreve e otimiza SQL para execução eficiente.
   - **Execução Eficiente**: Garante que as consultas sejam executadas da maneira mais rápida possível, aproveitando ao máximo os recursos disponíveis.

3. **Suporte Completo a SQL**:
   - **Compatibilidade com Padrões**: Suporta uma ampla gama de funcionalidades SQL, incluindo joins, agregações, subconsultas e funções definidas pelo usuário.
   - **Extensibilidade**: Permite adicionar funções e tipos de dados personalizados, adaptando SQL ao domínio específico da aplicação.

4. **Independência de Banco de Dados**:
   - **Sem Dependência de SGBD**: Não requer um sistema de gerenciamento de banco de dados específico, proporcionando maior liberdade na escolha das fontes de dados.
   - **Portabilidade**: As consultas SQL podem ser facilmente migradas ou adaptadas para diferentes ambientes e sistemas.

5. **Facilidade de Uso e Desenvolvimento**:
   - **Curva de Aprendizado Suave**: Aproveita a familiaridade que muitos desenvolvedores já têm com SQL, reduzindo a necessidade de aprender uma nova linguagem.
   - **Comunidade Ativa e Suporte**: Conta com uma comunidade robusta e documentação extensa, facilitando a resolução de problemas e a implementação de funcionalidades.

**Apache Calcite** é uma excelente escolha para utilizar SQL como uma DSL devido à sua flexibilidade, capacidade de integração com múltiplas fontes de dados, otimização avançada de consultas e suporte completo ao padrão SQL. Ele permite que desenvolvedores aproveitem a potência e a familiaridade do SQL sem as limitações de um banco de dados tradicional, facilitando a criação de aplicações robustas e eficientes.

Nós usamos várias plataformas para criar **DSLs**, incluindo: **C++**, **Golang** e **Rust**. Mas na maioria dos casos, **Apache Calcite** resolve o problema com menos complexidade. É claro que você pode optar por implementar sua **DSL** utilizando um formato **JSON**, por exemplo. Em vez de comandos, o cliente precisa aprender a criar objetos e propriedades JSON, mas, dependendo da experiência e conhecimento do cliente, **SQL** é mais fácil. 

## Demonstração

No repositório temos um exemplo em [**Java** com **Apache Calcite**](./src/main/java/org/example/Main.java). 

### Explicação do Código Java com Apache Calcite

Este código Java demonstra como utilizar o **Apache Calcite** para executar consultas SQL sobre estruturas de dados em memória. A seguir, vamos detalhar a estrutura do código, como o esquema é criado e como a consulta SQL é executada.

#### 1. Estrutura Geral do Código

O código está organizado na classe principal `Main` dentro do pacote `org.example`. Além disso, existem duas classes internas:

- **`LojaSchema`**: Representa o esquema de dados chamado "loja".
- **`Produto`**: Representa a tabela "produtos" dentro do esquema "loja".

A estrutura geral do código segue os seguintes passos:

1. **Configuração da Conexão com Calcite**: Define propriedades e estabelece uma conexão JDBC com o Calcite.
2. **Criação e Registro do Esquema**: Adiciona o esquema "loja" ao Calcite, que contém a tabela "produtos".
3. **Verificação das Tabelas e Colunas**: Lista as tabelas e colunas registradas no esquema para fins de depuração.
4. **Execução da Consulta SQL**: Executa uma consulta SQL para selecionar produtos com preço maior que 100.
5. **Iteração e Exibição dos Resultados**: Percorre os resultados da consulta e imprime os detalhes dos produtos.
6. **Encerramento dos Recursos**: Fecha o `ResultSet`, o `Statement` e a `Connection`.

#### 2. Criação do Esquema

##### 2.1. Classe `LojaSchema`

```java
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
```

- **Descrição**: A classe `LojaSchema` define o esquema "loja". Dentro dela, há um array de objetos `Produto` que representa a tabela "produtos".
- **Estrutura da Tabela**: Cada objeto `Produto` possui três campos: `id` (inteiro), `nome` (string) e `preco` (double).

##### 2.2. Classe `Produto`

```java
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
```

- **Descrição**: Representa uma linha da tabela "produtos". Cada instância contém os atributos `id`, `nome` e `preco`.

##### 2.3. Registro do Esquema no Calcite

```java
// Adicionando o esquema "loja"
SchemaPlus rootSchema = calciteConnection.getRootSchema();
rootSchema.add("loja", new ReflectiveSchema(new LojaSchema()));
```

- **Passo a Passo**:
  1. **Obtenção do Schema Raiz**: `calciteConnection.getRootSchema()` retorna o esquema raiz onde outros esquemas podem ser adicionados.
  2. **Adição do Esquema "loja"**: `rootSchema.add("loja", new ReflectiveSchema(new LojaSchema()))` registra o esquema "loja" no Calcite usando `ReflectiveSchema`.
  
- **`ReflectiveSchema`**: É uma classe do Calcite que mapeia objetos Java para tabelas SQL de forma reflexiva. Ele analisa as propriedades públicas do objeto fornecido (`LojaSchema`) para definir as tabelas e colunas.

#### 3. Configuração da Conexão com Calcite

```java
// 1. Configurando as propriedades da conexão Calcite
Properties properties = new Properties();
properties.setProperty("caseSensitive", "false"); // Sensibilidade a caso desativada

Connection connection = DriverManager.getConnection("jdbc:calcite:", properties);
CalciteConnection calciteConnection = connection.unwrap(CalciteConnection.class);
```

- **Propriedades da Conexão**:
  - **`caseSensitive`**: Definido como `"false"`, isso faz com que os nomes de tabelas e colunas sejam insensíveis a maiúsculas/minúsculas.
  
- **Estabelecimento da Conexão**:
  - **JDBC URL**: `"jdbc:calcite:"` indica que estamos usando o driver JDBC do Calcite.
  - **Unwrapping**: `connection.unwrap(CalciteConnection.class)` converte a `Connection` genérica para uma `CalciteConnection`, que fornece métodos específicos do Calcite.

#### 4. Verificação das Tabelas e Colunas Registradas (Depuração)

```java
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
```

- **Objetivo**: Listar todas as tabelas e suas respectivas colunas no esquema "loja" para confirmar que o Calcite está reconhecendo corretamente a estrutura de dados.
- **Passos**:
  1. **Obtenção do Subschema**: `rootSchema.getSubSchema("loja")` obtém o esquema "loja" registrado anteriormente.
  2. **Verificação de Existência**: Se `lojaSchema` for `null`, significa que o esquema não foi encontrado.
  3. **Listagem de Tabelas e Colunas**:
     - Itera sobre todas as tabelas no esquema "loja" (`lojaSchema.getTableNames()`).
     - Para cada tabela, obtém sua definição (`lojaSchema.getTable(tableName)`).
     - Obtém o tipo de dados das linhas da tabela (`table.getRowType(...)`).
     - Itera sobre cada campo (coluna) e imprime seu nome.

#### 5. Execução da Consulta SQL

```java
// 4. Executando a consulta SQL
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(
        "SELECT P.id, P.nome, P.preco FROM loja.produtos P WHERE P.preco > 100");
```

- **Criação do Statement**: `connection.createStatement()` cria um objeto `Statement` para executar a consulta SQL.
- **Execução da Consulta**:
  - **Query**: `"SELECT P.id, P.nome, P.preco FROM loja.produtos P WHERE P.preco > 100"`
  - **Descrição**: Seleciona os campos `id`, `nome` e `preco` da tabela `produtos` no esquema `loja`, filtrando apenas os produtos com preço maior que 100.
  
#### 6. Iteração e Exibição dos Resultados

```java
// 5. Iterando pelos resultados
while (resultSet.next()) {
    System.out.println("ID: " + resultSet.getInt("id") +
            ", Nome: " + resultSet.getString("nome") +
            ", Preço: " + resultSet.getDouble("preco"));
}
```

- **Iteração sobre o `ResultSet`**: O laço `while` percorre cada linha retornada pela consulta.
- **Exibição dos Dados**: Para cada produto que atende à condição (`preco > 100`), imprime o `id`, `nome` e `preco`.

#### **7. Encerramento dos Recursos**

```java
// 6. Fechando recursos
resultSet.close();
statement.close();
connection.close();
```

- **Importância**: Fecha o `ResultSet`, o `Statement` e a `Connection` para liberar recursos e evitar vazamentos de memória.

### **Resumo Passo a Passo**

1. **Configuração da Conexão**:
   - Define propriedades da conexão (insensibilidade a maiúsculas/minúsculas).
   - Estabelece a conexão JDBC com o Calcite.

2. **Criação e Registro do Esquema**:
   - Define o esquema "loja" usando `ReflectiveSchema` e a classe `LojaSchema`.
   - Registra o esquema no Calcite.

3. **Verificação do Esquema**:
   - Lista todas as tabelas e colunas no esquema "loja" para garantir que estão corretamente registradas.

4. **Execução da Consulta**:
   - Cria um `Statement` e executa uma consulta SQL para selecionar produtos com preço maior que 100.

5. **Processamento dos Resultados**:
   - Itera sobre os resultados e imprime os detalhes dos produtos selecionados.

6. **Encerramento**:
   - Fecha o `ResultSet`, o `Statement` e a `Connection`.

## Concluindo

Este exemplo ilustra como o Apache Calcite pode ser utilizado para tratar estruturas de dados Java como fontes de dados consultáveis por SQL. **Principais Benefícios Demonstrados**:

- **Integração Fácil**: Permite mapear objetos Java diretamente para tabelas SQL sem a necessidade de um banco de dados externo.
- **Flexibilidade**: Suporta diferentes tipos de fontes de dados e pode ser estendido conforme necessário.
- **Familiaridade com SQL**: Aproveita a linguagem SQL já conhecida por muitos desenvolvedores para consultas de dados.

Ao entender essa estrutura básica, você pode expandir a funcionalidade do Calcite para incluir fontes de dados mais complexas, otimizar consultas ou integrar com outros sistemas de dados conforme as necessidades do seu projeto.






