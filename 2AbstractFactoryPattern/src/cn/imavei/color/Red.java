package cn.imavei.color;

public class Red implements Color 
{

	@Override
	public void fill() 
	{
		System.out.println("Red method...");

	}

	@Override
	public String toString() 
	{
		return "Red [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
