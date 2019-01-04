package cn.imavei;

public class Rectangle implements Shape
{

	@Override
	public void draw() 
	{
		System.out.println("Rectangle.method...");

	}

	@Override
	public String toString() {
		return "Rectangle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
