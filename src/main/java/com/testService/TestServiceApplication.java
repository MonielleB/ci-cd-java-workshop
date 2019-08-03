package com.testService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Contém a documentação das classes da aplicação.
 * @author Monielle Berger
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration
public class TestServiceApplication {

/**
* Contém a documentação das classes da aplicação.
* @author Monielle Berger
* @param teste teste teste
*/
    public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
		System.exit(0);
	}

}
