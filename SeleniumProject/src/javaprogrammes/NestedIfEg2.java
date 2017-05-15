package javaprogrammes;

public class NestedIfEg2 {

	public static void main(String[] args) 
	{
		String course="Selenium";
		
		if(course.equalsIgnoreCase("selenium"))
		{
			System.out.println("You are selected Selenium");
		}
		else if (course.equals("Manual")) 
		{
			System.out.println("You are selected Manual");
		}
		else if (course.equals("UFT"))
		{
			System.out.println("You are selected UFT");
		}
		else
		{
			System.out.println("Select a proper course");
		}

	}

}
