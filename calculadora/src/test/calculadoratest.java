package test;


import calcu.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;


public class calculadoratest {
    Calculator calculator = new Calculator();

    @Test
    public void sumaTest() {

        assertEquals(calculator.suma(1, 2), 3);
    }

    @Test
    public void restaTest() {

        assertEquals(calculator.resta(4, 1), 3);
    }

    @Test
    public void multiplicarTest() {

        assertEquals(calculator.multiplicar(1, 3), 3);
    }

    @Test
    public void divisionTets() {
        assertEquals(calculator.dividir(3, 1), 3);
    }

    @Test
    public void raizTest(){

        asserEquals(calculator.raiz(a 1, b 2, c 4), -2, 2);
    }
}
