package com.javaExceptionHandling;

public class Example2 
{

	//with exception handling
	public static void main(String[] args) {
		
		//statement-1
		System.out.println("start");
		
		//statement-2
		String text = null;
		try
		{
			System.out.println(text.charAt(0));//try block contains problematic part 
		}
		catch(Exception e)//handler for the problem which is occurred in try block
		{
			e.printStackTrace();
		}
		
		//statement-3
		System.out.println("Hello");
		
		//statement-4
		try
		{
			System.out.println(20/0);//try block contains problematic part 
		}
		catch(Exception e)//handler for the problem which is occurred in try block
		{
			e.printStackTrace();
		}
		
		//statement-5
		System.out.println("Bye");
		
	}
	
}
