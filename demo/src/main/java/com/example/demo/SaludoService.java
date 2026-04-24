package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    public String saludar() {
        return "Hola Jennifer, usando Dependency Injection ";
    }
}
