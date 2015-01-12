package com.service.soapexample;

import javax.jws.WebService;

/**
 * 
 * @author arepaka
 * Web Service Endpoint Implementation
 * 
 */
@WebService
public class CalculatorImpl implements Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

}
