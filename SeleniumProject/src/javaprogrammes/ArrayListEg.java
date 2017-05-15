package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		x.add("Selenium");
		x.add("UFT");
		x.add("Manual");
		x.add(50000);
		x.add(true);
		x.add("Selenium");
		x.add(2, "Apple");
		
		//Length of the arrallist
		
		System.out.println(x.size());
		
		//Reading the data from arraylist
		
//		System.out.println(x.get(2));
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}
	}

}
