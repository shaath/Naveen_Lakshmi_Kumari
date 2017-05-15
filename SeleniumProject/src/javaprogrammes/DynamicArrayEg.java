package javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] s=new Object[5];
		//Finding the length of the array
		System.out.println(s.length);
		//Write the data into array
		
		s[2]="Selenium";
		s[0]="UFT";
		s[2]=40000;
		
		//Reading the data from an array
		
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}

}
