package javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		Object[][] x=new Object[2][3]; 
		
		//Finding the length of the rows
		System.out.println(x.length);
		
		//Finding the number of columns 
		
		System.out.println(x[0].length);
		
		//Writing the data into array
		
		x[0][1]="UFT";
		x[1][2]="Selenium";
		
		
		//Reading the data from array
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}
		
			
	}

}
