package com.javaInnerClasses;

public class Example2 {
	
	public static void main(String[] args) {
		
		int values[][] = {{20, 30}, {47, 37}, {29, 10}};//3x2
		
		
		//outer for loop
		for(int i = 0; i < 3; i++)//rows
		{
			//inner for loop		
			for(int j = 0; j < 2; j++)//columns
			{
				System.out.print(values[i][j]+"\t");
			}
			System.out.println("\n\n");
			
		}
		
	}

}
