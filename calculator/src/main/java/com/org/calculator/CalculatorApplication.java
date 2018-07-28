package com.org.calculator;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorApplication {
	private static final Logger LOGGER = LogManager.getLogger(CalculatorApplication.class);
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		LOGGER.info("Arithmetic Calculator");

		while (scanner.hasNext()) {
			if (scanner.next() == "done")
				break;
			LOGGER.info(scanner.next());

		}

	}

}
