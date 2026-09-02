# JavaAPI com Spring Boot

Meu repositório de estudo para criação de APIs RESTful usando Java e Spring Boot.

## Meus Arquivos

* [JavaApiApplication.java](src/main/java/com/nolte/javaapi/JavaApiApplication.java) - Início da aplicação
* [MainController.java](src/main/java/com/nolte/javaapi/models/MainController.java) - Controller da API
* [application.properties](src/main/resources/application.properties) - Configurações da porta (8081)
* [pom.xml](pom.xml) - Dependências do Maven
* [controler_and_endpoints.md](Exeplos/controler_and_endpoints.md) - Exemplos de estudos

## Tecnologias

* Java 21
* Spring Boot 3.3.2
* Spring Web
* Maven

## Rota Ativa

Servidor rodando na porta 8081:

* `GET http://localhost:8081/api/status`

## Como Rodar

No terminal, execute:

```cmd
mvnw.cmd spring-boot:run
```

Depois acesse no navegador: `http://localhost:8081/api/status`

## Documentação

* [Spring Boot - Guia REST oficial](https://spring.io/guides/gs/rest-service/)
* [Spring Framework - Documentação de Controllers](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller.html)
