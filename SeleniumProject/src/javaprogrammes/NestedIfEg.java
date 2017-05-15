package javaprogrammes;

import java.util.Scanner;

public class NestedIfEg {

	public static void main(String[] args) 
	{
		Scanner data=new Scanner(System.in);
		
		int a=data.nextInt();
		int b=data.nextInt();
		int c=data.nextInt();
		
		if(a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if (b > a & b > c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
