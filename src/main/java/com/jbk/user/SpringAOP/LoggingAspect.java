package com.jbk.user.SpringAOP;

import java.sql.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	// target method getName()
	@Before("execution(public * com.jbk.user.model.*.get*())")
	public void logMessage(){
		Date date= new Date(System.currentTimeMillis());
		System.out.println("Get method()...."+date);
		
	}
	@After("execution(public * com.jbk.user.model.*.set*(..))")
	public void logMessageAfter(){
		Date date= new Date(System.currentTimeMillis());
		System.out.println("Set method():--"+date);
	}

}
