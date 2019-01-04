package cn.imavei;



public class ShapeFactory 
{
	public Shape getShape(String shapeType)
	{
		if (shapeType.equalsIgnoreCase("RECTANGLE")) 
		{
			return new Rectangle();
		}
		if (shapeType.equalsIgnoreCase("SQUARE")) 
		{
			return new Square();
		}
		
		if (shapeType.equalsIgnoreCase("CIRCLE")) 
		{
			return new Circle();
		}
		
		return null;
	}

	@Override
	public String toString() {
		return "ShapeFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}