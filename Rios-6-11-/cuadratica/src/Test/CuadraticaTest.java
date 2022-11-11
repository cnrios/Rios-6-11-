package Test;

import cuadratica.Cuadratica;

import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CuadraticaTest{
    Cuadratica calculator = new Cuadratica();


    @Test
            public void cuadraTest(){
        float [] lista  = {-1,0};
        assertEquals( calculator.cuadra(1,2,1),lista);
    }

    @Test
    public void cuadreTest(){

        double result[] = {1, -5 };

        assertArrayEquals(calculator.cuadra(1, 4, (-5)),result, 0);
    }
}



    //malir sal



