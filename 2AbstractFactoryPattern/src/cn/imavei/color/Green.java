package cn.imavei.color;

public class Green implements Color 
{

	@Override
	public void fill() 
	{
		System.out.println("Green method...");

	}

	@Override
	public String toString() 
	{
		return "Green [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
