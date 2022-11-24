package Test;

import cuadratica.Cuadratica;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CuadraticaTest {
    Cuadratica calculator = new Cuadratica();


    @Test
    public void suma() {
        assertEquals(calculator.suma(1, 2), 3);
    }

    @Test
    public void sum() {
        assertNotEquals(calculator.suma(1, 2), 5);
    }


    @Test
    public void resta() {
        assertEquals(calculator.resta(2, 1), 1);
    }

    @Test
    public void res() {
        assertNotEquals(calculator.resta(2, 1), 10);
    }


    @Test
    public void multi() {
        assertEquals(calculator.multi(1, 2), 2);

    }

    @Test
    public void multi2() {
        assertNotEquals(calculator.multi(1, 2), 5);
    }


    @Test
    public void DivisionTest() {
        assertNotEquals(calculator.div(5, 0), 1);
    }

    @Test
    public void DivisionTest2() {
        assertEquals(calculator.div(20, 10), 2);
    }

    @Test
    public void DivisionTest3() {
        assertEquals(calculator.div(0, 10), 0);
    }

    @Test
    public void cuadreTest() {

        double result[] = {1, -5};

        assertArrayEquals(calculator.cuadra(1, 4, (-5)), result, 0);
    }

    @Test
    public void cuadreTest1() {

        double result[] = {123, -5};

        assertArrayEquals(calculator.cuadra(1, 4, (-5)), result, 321);
    }
}


  //  @Test
  //public void cuadreTest2() {
  //    double result[] = {145, -5}; // si delta (tolerancia) > 0 es lo mismo que un assertNotArraysEquals
        //(calculadora.FuncionCuadratica(1,2,1),result);
//    assertArrayEquals(calculator.cuadra(1, 4, (-5)), result, 9999); // delta = el numero? de decimales que aproxima

    //  }


    //@Test
    //public void cuadreTest3() {
    //  double result[] = {145, -5}; // si delta (tolerancia) > 0 es lo mismo que un assertNotArraysEquals
        //(calculadora.FuncionCuadratica(1,2,1),result);
//  assertArrayEquals(calculator.cuadra(1, 4, (-5)), result, 9999); // delta = el numero? de decimales que aproxima

    //  }

    //@Test
    //public void cuadreTest4() {
    //  double datos[] = calculator.cuadra(1, 2, 1);
    //  double result[] = {-1.0, 1.0};  //Si la tolerancia (delta) es muy alta el error pasa (Gran descubrimiento hecho por Barbieri)
//  assertFalse(Arrays.equals(datos, result)); // delta = el numero? de decimales que aproxima
//    }


