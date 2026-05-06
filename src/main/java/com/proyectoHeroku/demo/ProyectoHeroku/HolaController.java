package com.proyectoHeroku.demo.ProyectoHeroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String saludo() {
        return "Hola, mi aplicacion ya esta en Internet";
    }
}