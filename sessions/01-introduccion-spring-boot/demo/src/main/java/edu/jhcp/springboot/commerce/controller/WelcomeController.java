package edu.jhcp.springboot.commerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// @RestController: indica que esta clase atenderá solicitudes web y devolverá datos.
@RestController
public class WelcomeController {

    // @GetMapping: relaciona una dirección HTTP GET con un método Java.
    @GetMapping("/api/welcome")
    public Map<String,String> welcome() {
        // Map<String, String>: representa los datos que Spring convertirá automáticamente en JSON
        // mediante su infraestructura web.
        System.out.println( "WelcomeController.welcome()");
        return Map.of("message", "Bienvenido a nuestra tienda",
            "application", "Commerce API",
            "status", "running");
    }
}
