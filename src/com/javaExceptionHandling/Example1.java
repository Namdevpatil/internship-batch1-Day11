package com.javaExceptionHandling;

public class Example1 
{

	////without exception handling
	public static void main(String[] args) {
		
		//statement-1
		System.out.println("start");
		
		//statement-2
		String text = null;
		System.out.println(text.charAt(0));
		
		//statement-3
		System.out.println("Hello");
		
		//statement-4
		System.out.println(20/0);
		
		//statement-5
		System.out.println("Bye");
		
	}
	
}
