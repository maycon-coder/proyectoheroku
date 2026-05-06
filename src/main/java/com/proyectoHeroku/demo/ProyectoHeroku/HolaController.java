package com.proyectoHeroku.demo.ProyectoHeroku; // ← asegúrate que coincida con tu paquete

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String saludo() {
        return "Hola, mi aplicación ya está en Internet 🌐";
    }
}cd C:\Users\ACER\Downloads\demo.ProyectoHeroku\demo.ProyectoHeroku