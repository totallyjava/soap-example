package com.service.soapexample;

import javax.jws.WebService;

/**
 * 
 * @author arepaka
 * Web Service Endpoint Interface
 * 
 */
@WebService
public interface Calculator {
	
	public int sum(int a, int b);

	public int subtract(int a, int b);
	
}
