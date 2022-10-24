package Test;

import cuadratica.Cuadratica;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuadraticaTest{
    Cuadratica calculator = new Cuadratica();

    @Test

    public void raizTest() {
    
    
    
       assertEquals(calculator.raiz(1, 2, -8), -4,2 );
    
    
    
    }

    private void assertEquals(double raiz, int i, int j) {
    }
    
    
    
    }
