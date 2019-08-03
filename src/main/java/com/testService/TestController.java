package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Contém a documentação das classes da aplicação.
 * @author Monielle Berger
 */
@RestController
@CrossOrigin

/**
 * Contém a documentação das classes da aplicação.
 * @author Monielle Berger
 */
public class TestController {

    /**
     * Contém a documentação das classes da aplicação.
     * @author Monielle Berger
     * @return teste
     */

    @GetMapping("/home")
    /**
     * Contém a documentação das classes da aplicação.
     * @author Monielle Berger
     * @return teste
     */
    public String homeRequest() {
           return "Hello World!";
    }
}
