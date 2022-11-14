package com.CalcuAPi.Calcu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Calcu {


    @GetMapping("/hola")
    String miHOLA(){
        return "HOLA MUNDO";
    }

    @GetMapping("/Suma/{Num1}/{Num2}")
    float miSuma(@PathVariable float Num1, @PathVariable float Num2){
        return  Num1 + Num2;
    }

    @GetMapping("/Resta/{Num1}/{Num2}")
    float miResta(@PathVariable float Num1, @PathVariable float Num2){
        return Num1 - Num2;
    }

    @GetMapping("/Multi/{Num1}/{Num2}")
    float miMulti(@PathVariable float Num1, @PathVariable float Num2){
        return Num1 * Num2;
    }

    @GetMapping("/Div/{Num1}/{Num2}")
    float miDiv(@PathVariable float Num1, @PathVariable float Num2){
        return Num1 / Num2;
    }

    @GetMapping("/cua/{a}/{b}/{c}")
    static double[] miCua(@PathVariable double a, @PathVariable double b, @PathVariable double c){
        double b2 = b * b;
        double cuentaI= b2 - (4*a*c);
        double raiz = (double) Math.sqrt(cuentaI);

        double SP = ((-b + raiz) / 2*a);
        double RP = ((-b - raiz) / 2*a);

        double result[]= {SP, RP};
        return result;
    }



}

