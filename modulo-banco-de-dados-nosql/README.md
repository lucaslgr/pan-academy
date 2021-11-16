# Módulo - Banco de Dados NO SQL


## NoSQL
### É um banco e dados não relacional que possui as características.
- Diferentes tipos de armazenamento: chave-valor, colunas, documentos e grafos.
- Dados não estruturados e imprevisíveis.
- Não usa SQL.
- Alto desempenho, disponibilidade e escalabilidade.

### NoSQL Key-Value (REDIS)
Muito simular a um dicionário, sua base consiste em uma modelagem que indexa os dados a uma chave.
- Livre de Schemas.
- Valores independentes e isolados.
- Alto desempenho, disponibilidade e escalabilidade.
- Usado em sistemas de análise de câmbio, IoT apps, gestão de conteúdo, etc.

### NoSQL Colunas (CASSANDRA)
Uma grande tabela contendo uma família de colunas.
- Consiste em linha, coluna, timestamp (versão de dados).
- Semelhante ao modelo chave-valor.
- Indicados para mídias sociais.
- E problemas que envolvem consultas complexas.

### NoSQL Graph (Neo4j)
Aqui os dados são dispostos no formato de arcos conectados por arestas. Podemos definir como um conjunto de linhas conectadas por vértices também.
- Estruturado em grafos (dados), arestas (ligações) e atributos.
- Alta performance.
- Usado em cenário com pesquisas complexas.
- E que exigem muita relação entre os dados.

### NoSQL Documents (MongoDB)
Estrutura baseada em uma coleção de documentos, sendo um documento um objeto que contém um código único.
- Semelhante ao modelo chave-valor porém com um ID.
- Tipos textos, aninhados e ainda listas.
- Convenção para estrutura JSON.
- Cenário que necessita de estrutura dinâmica de dados.

### SQL ou NoSQL?
- SQL:
    - Consistência das informações - ACID.
    - Baixo custo em armazenamento.
    - Consultas flexíveis.
    - Baixo recurso de escalabilidade.
- NoSQL:
    - Modelo de dados flexível.
    - Convenção para estrutura JSON.
    - Alto desempenho e disponibilidade.
    - Interpretação vaga ao ACID.
    
## MongoDB
- É um banco de dados de código aberto, gratuito, de alta performance, sem esquemas e orientado à documentos, lançado em fevereiro de 2009 pela empresa 10gen.
- Características:
    - Orientado a documentos.
    - Fácil modelagem das informações.
    - Convenção nativa para estrutura JSON.
    - Cenário que necessita de estrutura dinâmica de dados.

## Persistência Poliglota
- É quando uma aplicação se comunica com vários bancos de dados diferentes para persistir informação.