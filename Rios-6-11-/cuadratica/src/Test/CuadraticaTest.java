package Test;

import cuadratica.Cuadratica;

import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CuadraticaTest {
    Cuadratica calculator = new Cuadratica();


    @Test
    public void suma() {
        assertEquals(calculator.suma(1, 2), 3);
    }
    @Test
            public void sum(){
        assertNotEquals(calculator.suma(1,2),5);
    }

    @Test
    public void resta() {
        assertEquals(calculator.resta(2, 1), 1);
    }
    @Test
            public void res(){
        assertNotEquals(calculator.resta(2,1),10);
    }
    @Test
    public void multi() {
        assertEquals(calculator.multi(1, 2), 2);

    }
    @Test
    public void multi2(){
        assertNotEquals(calculator.multi(1,2),5);
    }




    @Test
    public void DivisionTest(){
        assertNotEquals(calculator.div(5, 0), 1);
    }

    @Test
    public void DivisionTest2(){
        assertEquals(calculator.div(20, 10), 2);
    }

    @Test
    public void DivisionTest3() {
        assertEquals(calculator.div(0, 10), 0);
    }
    @Test
    public void cuadraTest() {
        float[] lista = {-1, 0};
        assertEquals(calculator.cuadra(1, 2, 1), lista);
    }

    @Test
    public void cuadreTest() {

        double result[] = {1, -5};

        assertArrayEquals(calculator.cuadra(1, 4, (-5)), result, 0);
    }
}