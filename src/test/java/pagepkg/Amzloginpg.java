package pagepkg;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amzloginpg {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement hellosigin;
	
	@FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement signin;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[1]/input[1]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement continuee;
	
	@FindBy(name = "password")
	WebElement pswd;
	
	@FindBy(id = "signInSubmit")
	WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"ap_change_login_claim\"]")
	WebElement change;
	
	
	public Amzloginpg(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
		
		
	}
	
	public void signin()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Actions act = new Actions(driver);
		act.moveToElement(hellosigin).perform();;
		hellosigin.click();
		email.sendKeys("sainanazim36@gmail.com");
		continuee.click();
		
	}
	
	public void setvalues(String password)
	{
	  
	   pswd.clear();
	   pswd.sendKeys(password);  
	}
	
	public void login()
	{
		submit.click();
		
		
	}
}
