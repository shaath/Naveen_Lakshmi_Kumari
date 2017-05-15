package javaprogrammes;

import java.util.Scanner;

public class SwitchCaseEg {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String course=sc.next();
		
		switch (course) 
		{
		case "manual":
			System.out.println("You are selected Manual");
			break;
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "UFT":
			System.out.println("You are Selected UFT");
			break;

		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
