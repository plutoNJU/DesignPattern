package cn.imavei;

public class Circle implements Shape 
{

	@Override
	public void draw() 
	{
		System.out.println("Circle method...");

	}

	@Override
	public String toString() {
		return "Circle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
