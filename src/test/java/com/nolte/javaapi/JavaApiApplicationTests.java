// Pacote da classe de testes. Precisa bater com a estrutura de pastas "src/test/java/com/nolte/javaapi/".
package com.nolte.javaapi;

// Importações do JUnit 5 e do Spring Boot Test para execução de testes automatizados.
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Anotação que avisa o Spring para carregar o contexto da aplicação para testes automatizados.
@SpringBootTest
class JavaApiApplicationTests {

    // Teste padrão que verifica se o contexto do Spring Boot consegue subir sem
    // erros.
    @Test
    void contextLoads() {
    }

}
