package javaprogrammes;

public class DoWhileEg {

	public static void main(String[] args) 
	{
		int i=1;
		do
		{
			System.out.println(i);
			if (i==250) 
			{
				break;
			}
			i++;
		}
		while(i<=500);
	}

}