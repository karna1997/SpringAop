package com.jbk.user.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.user.model.Rectangle;
import com.jbk.user.model.Shape;
import com.jbk.user.model.Triangle;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CofigurationClass.class);
		
		Triangle triangle = context.getBean(Triangle.class);
		triangle.setName("Triangle");
		Rectangle rectangle=context.getBean(Rectangle.class);
		rectangle.setName("Rectangle");
		Shape shape = context.getBean(Shape.class);
		shape.setTriangle(triangle);
		shape.setRectangle(rectangle);
		System.out.println(shape.getTriangle().getName());
		System.out.println(shape.getRectangle().getName());

	}
}
