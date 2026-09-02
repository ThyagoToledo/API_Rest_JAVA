# Minhas Anotações de Estudo - Controllers e Endpoints

Resumo simples sobre como funcionam os Controllers e os Endpoints no Spring Boot.

## O que eu entendi sobre Controller e Endpoint

### Controller
* É a classe Java responsável por receber as chamadas de fora (navegador ou aplicativo) e devolver a resposta.
* No Spring Boot, eu uso a anotação `@RestController`.
* Analogia: É como o setor de atendimento de uma empresa.

### Endpoint
* É o endereço URL exato que a pessoa acessa junto com o método HTTP (como `GET`).
* No Spring Boot, eu crio um método com `@GetMapping("/nome-da-rota")`.
* Analogia: É o ramal específico do atendimento.

## Meu Exemplo Prático Comentado

```java
// Pacote onde o arquivo está salvo. A pasta no computador precisa ter esse mesmo caminho.
package com.nolte.javaapi.controllers;

// Importações necessárias para usar o Spring Web.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Avisa o Spring que esta classe é um Controller REST e vai devolver textos ou dados diretos.
@RestController

// Rota base do controller. Todas as URLs daqui começam com http://localhost:8081/produtos
@RequestMapping("/produtos")
public class ProdutoController {

    // Rota: GET http://localhost:8081/produtos/listar
    // Quando acesso essa URL, o método roda e entrega a lista em texto.
    @GetMapping("/listar")
    public String listarProdutos() {
        return "Lista de produtos cadastrados";
    }

    // Rota: GET http://localhost:8081/produtos/promocao
    // Quando acesso a rota de promoção, o método roda e mostra o desconto.
    @GetMapping("/promocao")
    public String produtoEmPromocao() {
        return "Notebook com 20% de desconto!";
    }
}
```

## Documentação

Documentações oficiais que usei de referência:

* [Spring Boot - Guia oficial REST](https://spring.io/guides/gs/rest-service/)
* [Spring Framework - Documentação de Controllers](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller.html)
* [Spring Framework - Documentação de RequestMapping](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-requestmapping.html)