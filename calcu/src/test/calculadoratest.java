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

        assertEquals(calcu.resta(6, 1), 0);
    }

    @Test
    public void multiplicarTest() {

        assertEquals(calcu.multiplicar(1, 1), 1);
    }

    @Test
    public void divisionTest() {
        assertEquals(calcu.dividir(3, 0), 3);
    }

    @Test
    public void cuadradosTest(){
        assertEquals(calcu.cuadrados(3),9);
    }


    //malir sal

    @Test
    public void sumasTest() {
        assertNotEquals(calcu.suma(1, 1), 100);
    }

    @Test
    public void restaTestMAl() {
        assertNotEquals(calcu.resta(1, 1), 300);
    }
    @Test
    public void divTestmal() {
        assertNotEquals(calcu.dividir(1,1 ), 1000);
    }

    @Test
    public void MULTITestMAL() {
        assertNotEquals(calcu.multiplicar(3, 1), 600);
    }
}
