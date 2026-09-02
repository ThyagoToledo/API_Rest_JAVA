// Pacote onde esta classe está salva. O Java exige que o caminho de pastas seja exatamente igual a essa declaração.
package com.nolte.javaapi.models;

// Importações do Spring Web necessárias para usar anotações como @RestController, @RequestMapping e @GetMapping.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Avisa o Spring Boot que esta classe é um Controlador REST. Ela vai receber requisições de fora e devolver dados (como texto ou JSON).
@RestController

// Define a rota base do controller. Qualquer chamada para as rotas desta classe vai começar com "http://localhost:8081/api".
@RequestMapping("/api")
public class MainController {

    // Rota Completa: GET http://localhost:8081/api/status
    // Esta anotação mapeia o método HTTP GET na sub-rota "/status".
    // Quando alguém acessa essa URL no navegador, o Spring executa a função getStatus() e devolve o texto informando que a API está funcionando.
    @GetMapping("/status")
    public String getStatus() {
        return "API funcionando na porta 8081!";
    }
}