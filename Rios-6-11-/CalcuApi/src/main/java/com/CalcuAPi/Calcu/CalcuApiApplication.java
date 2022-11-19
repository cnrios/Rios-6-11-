package com.CalcuAPi.Calcu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcuApiApplication {

	private static Logger logger = LoggerFactory.getLogger(CalcuApiApplication.class);

	public static void main(String[] args){

		SpringApplication.run(CalcuApiApplication.class , args);

		logger.debug("MI MENSAJE DEBUg");

	}


}
