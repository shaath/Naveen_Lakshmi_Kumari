package javaprogrammes;

public class StaticArrayEg1 {

	public static void main(String[] args) 
	{
		int[] salary={40000,50000,60000,40000,70000};
		
		
		//Finding the length of the array
		
		System.out.println(salary.length);
		
		//Reading the data from array
		
//		System.out.println(salary[2]);
		
//		for (int i = 0; i < salary.length; i++)
//		{
//			System.out.println(salary[i]);
//		}
		
		for (int data : salary) 
		{
			System.out.println(data);
		}
	}

}
