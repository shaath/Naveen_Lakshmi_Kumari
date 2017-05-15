package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import methods.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid 
{
	public static void main(String[] args) throws IOException
	{
		OrgMaster om=new OrgMaster();
		String res=null;
		DateFormat dateformate=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new Date();
		String a=dateformate.format(date);
		System.out.println(a);
		String b=((a.replace("/", "")).replace(" ", "")).replace(":", "");
		System.out.println(b);
		String xlpath="F:\\Lakshmi_Kumari_Suma_Naveen\\SeleniumProject\\src\\testdata\\Hybrid.xlsx";
		String xlout="F:\\Lakshmi_Kumari_Suma_Naveen\\SeleniumProject\\src\\results\\HybridRes"+b+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("Empreg");
		
		int tcRc=ws.getLastRowNum();
		int tstcRc=ws1.getLastRowNum();
		int emprc=ws2.getLastRowNum();
		for (int i = 1; i <= tcRc; i++) 
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tstcRc; j++)
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcId))
					{
						String keyword=ws1.getRow(j).getCell(3).getStringCellValue();
						System.out.println(keyword);
						
						switch (keyword)
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
							break;
						case "login":	
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= emprc; k++) 
							{
								String f=ws2.getRow(k).getCell(0).getStringCellValue();
								String l=ws2.getRow(k).getCell(1).getStringCellValue();
								res=om.org_Empreg(f, l);
								ws2.getRow(k).createCell(2).setCellValue(res);
							}
							
							break;
						case "Usereg":
							res=om.org_Userreg("Lakshmi V", "LakshmiV123456", "LakshmiV123456", "LakshmiV123456");
							break;
						case "Ulogin":	
							res=om.org_Login("LakshmiV123456", "LakshmiV123456");
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						//Writing the results in the test steps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						//Writing the result in the testcase sheet
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")) 
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
				
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
