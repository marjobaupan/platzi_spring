package com.spring_platzi.platzi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {
    @GetMapping("/hola")
    public String saludar(){
        return "no pares de aprender";
    }
}
