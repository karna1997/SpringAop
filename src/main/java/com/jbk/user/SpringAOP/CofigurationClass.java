package com.jbk.user.SpringAOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.jbk.user.model.Rectangle;
import com.jbk.user.model.Shape;
import com.jbk.user.model.Triangle;

@Configuration
@EnableAspectJAutoProxy
public class CofigurationClass {
 
	@Bean
	public Rectangle getRectangleBean(){
		return new Rectangle();
	}
	@Bean
	public Triangle getTriangleBean(){
		return new Triangle();
	}
	@Bean
	public Shape getShapeBean(){
		return  new Shape();
	}
	@Bean
	public LoggingAspect getLoggingBean(){
		return new LoggingAspect();
	}
}
