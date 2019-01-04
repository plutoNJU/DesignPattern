package cn.factory;

import cn.imavei.color.Color;
import cn.imavei.shape.Circle;
import cn.imavei.shape.Rectangle;
import cn.imavei.shape.Shape;
import cn.imavei.shape.Square;

public class ShapeFactory extends AbstractFactory
{
	@Override
	public Shape getShape(String shapeType)
	{
		
		if(shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		if(shapeType.equalsIgnoreCase("square"))
			return new Square();
		
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
