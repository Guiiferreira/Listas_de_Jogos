# DSList

DSList é uma aplicação back-end desenvolvida em Java com o framework Spring Boot. O objetivo do projeto é gerenciar listas de jogos, permitindo que os usuários criem e organizem suas coleções de jogos favoritos.

## Funcionalidades

- Listar todos os jogos disponíveis.
- Visualizar detalhes de um jogo específico.
- Criar, atualizar e excluir jogos da lista.
- Organizar a posição dos jogos na lista.

## Tecnologias Utilizadas

- Java
- Spring Boot
- JPA/Hibernate
- Maven
- H2
- Postman
- Docker

## Modelo de domínio 

![Modelo de domínio DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

## Pré-requisitos

- Java 17 ou superior instalado
- Maven 3.8.1 ou superior instalado
- Banco de dados configurado 

## Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Guiiferreira/dslist.git
   cd dslist
Configure o banco de dados:

2. Atualize o arquivo src/main/resources/application.properties com as configurações do seu banco de dados.

3. Compile e execute a aplicação:
   ./mvnw spring-boot:run
   
"A aplicação estará disponível em http://localhost:8080."

## Endpoints Principais

GET /games: Retorna a lista de todos os jogos.

GET /games/{id}: Retorna os detalhes de um jogo específico.

POST /games: Adiciona um novo jogo à lista.

PUT /games/{id}: Atualiza as informações de um jogo existente.

DELETE /games/{id}: Remove um jogo da lista.
