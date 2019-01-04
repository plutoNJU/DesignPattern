package cn.test;

import org.junit.Test;

import cn.factory.AbstractFactory;
import cn.factory.FatoryProducer;
import cn.imavei.color.Color;
import cn.imavei.shape.Shape;

public class DemoTest 
{

	@Test
	public void run1()
	{
		AbstractFactory factory1=FatoryProducer.getFactory("shape");
		
		Shape shape = factory1.getShape("circle");
		
		shape.draw();
		
		System.out.println(shape);
		
		
		AbstractFactory factory2=FatoryProducer.getFactory("color");
		
		Color color = factory2.getColor("red");
		
		color.fill();
		
		System.out.println(color);
		
		
		
	}
}
