package com.springapp.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibroControlador {

    @GetMapping("/libro.html")
    public String libros(){
        return "libro.html";
    }

    @GetMapping("/index.html")
    public String index(){
        return "index.html";
    }
}
