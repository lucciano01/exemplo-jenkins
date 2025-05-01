package br.edu.catolica.bcc.exemplo_jenkins.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void testValidName() {
        String name = "Lucas";
        Assertions.assertDoesNotThrow(() -> helloService.valid(name));
    }

    @Test
    public void invalidName() {
        String name = "";
        Assertions.assertDoesNotThrow(() -> helloService.valid(name));
    }

}
