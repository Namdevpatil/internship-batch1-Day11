package com.javaInnerClasses;

public class Example1 {

	public static void main(String[] args) {
		
		
		int a = 10, b = 20;
		
		//outer if
		if(a > 0 && b > 0)
		{
			//inner if
			if(a < b)
			{
				System.out.println("yes");
			}
		}

	}

}
