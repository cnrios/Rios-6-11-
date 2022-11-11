package com.example.Calcu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rutasporelvideo {


    @GetMapping("/hola")
    String miprimeraRUtini(){

        return "Hola Mundo";
    }

}
