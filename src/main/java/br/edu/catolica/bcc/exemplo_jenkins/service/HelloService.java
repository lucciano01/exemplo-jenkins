package br.edu.catolica.bcc.exemplo_jenkins.service;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void valid(String name) {
        if (Strings.isBlank(name)) {
            throw new IllegalArgumentException("O nome não pode ser vazio ou nulo");
        }
    }
}
