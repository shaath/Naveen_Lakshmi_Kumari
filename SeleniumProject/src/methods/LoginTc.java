package methods;

public class LoginTc {

	public static void main(String[] args)
	{
		OrgMaster om=new OrgMaster();
		//Launch
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		//Login
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		//Logout
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		//Close
		om.org_Close();
		System.out.println("Application Closed Successfully");
		
		
	}

}
