package cn.factory;

import cn.imavei.color.Blue;
import cn.imavei.color.Color;
import cn.imavei.color.Green;
import cn.imavei.color.Red;
import cn.imavei.shape.Shape;

public class ColorFactory extends AbstractFactory
{
	@Override
	public Color getColor(String colorType)
	{
		
		if(colorType.equalsIgnoreCase("Blue"))
			return new Blue();
		if(colorType.equalsIgnoreCase("Red"))
			return new Red();
		if(colorType.equalsIgnoreCase("Green"))
			return new Green();
		
		return null;
		
	}

	@Override
	public String toString() 
	{
		return "ColorFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
