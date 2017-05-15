package javaprogrammes;

public class StringEg2 {

	public static void main(String[] args) 
	{
		String course="QEdge";//--> egdEQ
		//madam----> madam
		int len=course.length();
		
		for (int i = 0; i < len; i++) 
		{
			System.out.println(course.charAt(i));
		}
		
		System.out.println("***");
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.print(course.charAt(i));
			
		}

	}

}
