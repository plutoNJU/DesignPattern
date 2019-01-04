package cn.imavei;

public class Square implements Shape 
{

	@Override
	public void draw()
	{
		System.out.println("Square method...");

	}

	@Override
	public String toString() {
		return "Square [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
