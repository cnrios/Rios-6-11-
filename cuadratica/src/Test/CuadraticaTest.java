package Test;

import cuadratica.Cuadratica;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CuadraticaTest{
    Cuadratica calculator = new Cuadratica();

    @Test
        public void cuadriTest() {

        assertEquals(String.valueOf(new float[][]{calculator.cuadra(1, 2, 1)}), 1, 1);


    }

    @Test
    public void cuadritestmalo() {
        assertEquals(String.valueOf(new float[][]{calculator.cuadra(1, 2, 1)}), 10, 2);

    }
}

