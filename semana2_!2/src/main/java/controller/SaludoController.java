package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController{
    @GetMapping("/Saludo")
    public String  Saludo(){
        return "Hola desde pull Request";
    }
}