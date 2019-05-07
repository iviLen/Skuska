package com.jwt.ejb.businesslogic;

import javax.ejb.Stateless;
import com.jwt.ejb.business.Hello;

@Stateless
public class HelloBean implements Hello {
	public HelloBean() {
		
	}
	
	public String sayHello() {
		return "Hello Boss Welcome to EJB";
	}
}
