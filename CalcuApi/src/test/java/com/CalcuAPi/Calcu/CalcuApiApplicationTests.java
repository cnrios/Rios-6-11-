package com.CalcuAPi.Calcu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalcuApiApplicationTests {

	Calcu calc = new Calcu();


	@Test
	void contextLoads() {
	}

	@Test
	void miSuma() {
		assertEquals(calc.miSuma(1,2) ,3);
		assertNotEquals(calc.miSuma(1,2) ,4);
	}

	@Test
	void miResta(){
		assertEquals(calc.miResta(2,1),1);
		// assertNotEquals(calc.miResta(1,2),9);
	}

	@Test
	void miMulti(){
		assertEquals(calc.miMulti(2,1),2);
		assertNotEquals(calc.miMulti(2,1),5);
	}
	@Test
	void midiv(){
		assertEquals(calc.miDiv(2,2),1);
		assertNotEquals(calc.miDiv(2,2),5);
	}

	@Test
	void micua(){
		double result[] = {1,4};

		assertArrayEquals(calc.miCua(1,2,(-5)),result,0);
		assertArrayEquals(calc.miCua(1,2,(-5)),result,1);

	}





}

