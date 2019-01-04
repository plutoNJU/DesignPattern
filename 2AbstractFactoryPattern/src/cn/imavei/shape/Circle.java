package cn.imavei.shape;

public class Circle implements Shape
{

	@Override
	public void draw() 
	{
		System.out.println("circle method...");

	}

	@Override
	public String toString() 
	{
		return "Circle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
