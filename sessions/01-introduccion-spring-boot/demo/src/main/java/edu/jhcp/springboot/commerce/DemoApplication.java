package edu.jhcp.springboot.commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// @SpringBootApplication — Configuración de la aplicación
// Es la anotación que identifica la clase principal de nuestra aplicación Spring Boot.
// Al utilizarla, Spring Boot habilita tres capacidades fundamentales:
//   @SpringBootConfiguration	Identifica la clase como una fuente de configuración de Spring.
//   @EnableAutoConfiguration	Permite que Spring Boot configure automáticamente componentes según las dependencias disponibles.
//   @ComponentScan	Busca componentes administrados por Spring en el paquete de la clase principal y sus subpaquetes.
@SpringBootApplication
public class DemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        // SpringApplication.run() — Arranque de Spring Boot
        SpringApplication.run(DemoApplication.class, args);
        logger.info("Bienvenido a Spring Boot!");
        System.out.println( "Bienvenido a Spring Boot!");
    }

}
