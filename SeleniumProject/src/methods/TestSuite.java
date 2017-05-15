package methods;

public class TestSuite {

	public static void main(String[] args) 
	{
		OrgMaster om=new OrgMaster();
		//Login TC
		
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
		
		//Empreg TC
		
		 res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
			System.out.println("Application Launch "+res);
			//Login
			res=om.org_Login("Admin", "admin");
			System.out.println("Application Login "+res);
			//Empreg
			res=om.org_Empreg("Sandeep", "Kumar");
			System.out.println("Employee Registration "+res);
			//Logout
			res=om.org_Logout();
			System.out.println("Application Logout "+res);
			
			//Close
			om.org_Close();
			System.out.println("Application Closed Successfully");
		
			//Userreg Tc
			res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
			System.out.println("Application Launch "+res);
			//Login
			res=om.org_Login("Admin", "admin");
			System.out.println("Application Login "+res);
			//Userreg
			res=om.org_Userreg("Sandeep Kumar", "SandeepKumar123", "SandeepKumar123", "SandeepKumar123");
			System.out.println("User Registration "+res);
			//Logout
			res=om.org_Logout();
			System.out.println("Application Logout "+res);
			
			//Close
			om.org_Close();
			System.out.println("Application Closed Successfully");

			//UserLogin Tc
			
			res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
			System.out.println("Application Launch "+res);
			//Login
			res=om.org_Login("SandeepKumar123", "SandeepKumar123");
			System.out.println("Application Login "+res);
			//Logout
			res=om.org_Logout();
			System.out.println("Application Logout "+res);
			
			//Close
			om.org_Close();
			System.out.println("Application Closed Successfully");
	}

}
