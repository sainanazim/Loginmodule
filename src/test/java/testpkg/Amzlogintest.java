package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Amzloginpg;
import utilities.Excelutils;

public class Amzlogintest extends Baseclass{

	@Test(priority = 1)
	public void signin()
	{
		Amzloginpg ob = new Amzloginpg(driver);
		ob.signin();
	}
	
	@Test(priority = 2)
	public void login() throws IOException
	{

        Amzloginpg ob = new Amzloginpg(driver);
        String xl = "C:\\Users\\User\\Desktop\\Amzn.xlsx";
        String Sheet = "Sheet1";
        int rowcount = Excelutils.getRowCount(xl, Sheet);
        for (int i=1;i<=rowcount;i++)
        {

            String Password = Excelutils.getCellValue(xl, Sheet, i, 0);
            System.out.println("password: "+Password);
            ob.setvalues(Password);
            ob.login();  
            
                    
        }
        
        
	}
	
     
	
	
	

}	
	
	
