package cn.factory;

import cn.imavei.color.Color;
import cn.imavei.shape.Shape;

public abstract class AbstractFactory 
{
	public abstract Shape getShape(String shapeType);
	public abstract Color getColor(String colorType);
}
