package cn.factory;

public class FatoryProducer 
{
	public static AbstractFactory getFactory(String factoryType)
	{
		if(factoryType.equalsIgnoreCase("color"))
			return new ColorFactory();
		
		if(factoryType.equalsIgnoreCase("shape"))
			return new ShapeFactory();

		return null;
	}

}
