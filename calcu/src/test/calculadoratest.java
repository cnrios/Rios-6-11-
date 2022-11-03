package test;


import CALCU.calcu;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class calculadoratest {

    calcu calcu = new calcu();

    @Test
    public void sumaTest() {

        assertEquals(calcu.suma(1, 1), 2);
    }

    @Test
    public void restaTest() {

        assertEquals(calcu.resta(1, 1), 0);
    }

    @Test
    public void multiplicarTest() {

        assertEquals(calcu.multiplicar(1, 1), 1);
    }

    @Test
    public void divisionTets() {
        assertEquals(calcu.dividir(3, 1), 3);
    }


    //malir sal

    @Test
    public void sumarTestM() {
        assertNotEquals(calcu.suma(1, 1), 100);
    }

    @Test
    public void restarTestM() {
        assertNotEquals(calcu.resta(1, 1), 300);
    }

    @Test
    public void divTestM() {
        assertNotEquals(calcu.dividir(1,1 ), 1000);
    }

    @Test
    public void porTestM() {
        assertNotEquals(calcu.multiplicar(3, 1), 600);
    }
}
