package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    private final SaludoService saludoService;

    public HolaController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/hola")
    public String saludar() {
        return saludoService.saludar();
    }
    @GetMapping("/mierror")
    public String error() {
        throw new RuntimeException("Este recurso no existe");
    }
}