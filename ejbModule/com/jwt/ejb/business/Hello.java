package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface Hello {
	public String sayHello();
}
