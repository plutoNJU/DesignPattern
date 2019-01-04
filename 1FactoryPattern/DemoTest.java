package cn.imavei;

import org.junit.Test;

public class DemoTest 
{
	
	@Test
	public void run1()
	{
		ShapeFactory shapeFactory=new ShapeFactory();
		
		Shape shape1=shapeFactory.getShape("rectangle");
		
		System.out.println(shape1);
		
		Shape shape2=shapeFactory.getShape("square");
		
		System.out.println(shape2);
		
		Shape shape3=shapeFactory.getShape("circle");
		
		System.out.println(shape3);
		
	}
}
