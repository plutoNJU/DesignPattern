package cn.imavei;

import org.junit.Test;

public class DemoTest 
{
	
	@Test
	public void run1()
	{
		Singleton1 singleton11=Singleton1.getInstance();
		Singleton1 singleton12=Singleton1.getInstance();
		
		System.out.println(singleton11);
		System.out.println(singleton12);
		
		
		Singleton2 singleton21=Singleton2.getInstance();
		Singleton2 singleton22=Singleton2.getInstance();
		
		System.out.println(singleton21);
		System.out.println(singleton22);
		
		Singleton3 singleton31=Singleton3.getInstance();
		Singleton3 singleton32=Singleton3.getInstance();
		
		System.out.println(singleton31);
		System.out.println(singleton32);
		
		Singleton4 singleton41=Singleton4.getSingleton();
		Singleton4 singleton42=Singleton4.getSingleton();
		
		System.out.println(singleton41);
		System.out.println(singleton42);
		
		
		
	}

}
