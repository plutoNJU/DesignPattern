package cn.imavei.color;

public class Blue implements Color
{

	@Override
	public void fill() 
	{
		System.out.println("Blue method...");

	}

	@Override
	public String toString() {
		return "Blue [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
