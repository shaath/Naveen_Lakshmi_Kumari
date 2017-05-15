package javaprogrammes;

public class PolindromeEg {

	public static void main(String[] args)
	{
		String s="  Malayalam  ";
		String c=s.trim();
		String r="";
		int len=c.length();
		
		for (int i = len-1; i >= 0; i--)
		{
			r=r+c.charAt(i);
			
		}
		System.out.println(r);
		if (c.equalsIgnoreCase(r))
		{
			System.out.println("The given string polindrome");
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}
	}

}
