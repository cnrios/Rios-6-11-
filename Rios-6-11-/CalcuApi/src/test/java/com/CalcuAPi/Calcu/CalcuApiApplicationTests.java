package com.CalcuAPi.Calcu;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalcuApiApplicationTests {

	Calcu calc = new Calcu();


	@Test
	void miSuma() {
		assertEquals(calc.miSuma(1, 2), 3);
	}
	@Test
	void miSuma2() {
		assertEquals(calc.miSuma(-1, -2), -3);
	}
	@Test
	void miSuma3() {
		assertNotEquals(calc.miSuma(1, 2), 4);
	}

	@Test
			void miSuma4(){
		assertNotEquals(calc.miSuma(-1,-2),3);
	}




	@Test
	void miResta(){
		assertEquals(calc.miResta(2,1),1);
	}
	@Test
	void miResta2() {
		assertEquals(calc.miResta(-2, -2), 0);
	}
	@Test
	void miResta3() {
		assertNotEquals(calc.miResta(2, 1), 9);
	}
	@Test
	void miResta4(){
		assertNotEquals(calc.miResta(-2,-2),-9);

	}





	@Test
	void miMulti(){
		assertEquals(calc.miMulti(2,1),2);}
	@Test
	void miMulti2() {
		assertEquals(calc.miMulti(-2, -1), 2);
	}
	@Test
	void miMulti3() {
		assertNotEquals(calc.miMulti(2, 1), 5);
	}
	@Test
	void miMulti4(){
		assertNotEquals(calc.miMulti(-2,-1),-5);


	}




	@Test
	void midiv() {
		assertEquals(calc.miDiv(2, 2), 1);
	}
	@Test
	void midiv2() {
		assertEquals(calc.miDiv(-2, -1), 2);
	}
	@Test
	void midiv3() {
		assertNotEquals(calc.miDiv(2, 2), 5);
	}


	void micua2(){
		double result[] = {1,4};
	assertArrayEquals(calc.miCua(1,2,(-5)),result,1);}

	@Test
	public void Cuadratica(){
		double result1[] = {-1 , -1};

		assertArrayEquals(Calcu.miCua(1,2,1),result1,0);
	}


	@Test
	public void Cuadratica2(){
		double result2[] = { 1 , -5};

		assertArrayEquals(Calcu.miCua(1,4,(-5)),result2,0);
	}

	@Test
	public void Cuadratica3(){
		assertThrows(ArithmeticException.class,() -> {Calcu.miCua(0,10,30);});
	}


	@Test
	public void Cuadratica4(){
		assertThrows(ArithmeticException.class,() -> {Calcu.miCua(0,1,1);});
	}

}


