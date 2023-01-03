package testlayerAccountmodule;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasePackage.Amazonbaseclass;
import pompackage.PomYourAccount;

public class AccountModuletestcases extends Amazonbaseclass {
	
	PomYourAccount abc;

	public AccountModuletestcases()
	{
		super();
	}
	
	@BeforeMethod
	public void accountmod()
	{
		initiate();
		abc=new PomYourAccount();
		driver.get("https://www.amazon.ca/?ref_=icp_country_from_ca");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		driver.findElement(By.cssSelector("#nav-flyout-ya-signin > a > span")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("jai555925@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("2ead4647");
		driver.findElement(By.id("signInSubmit")).click();
		
	}
	
	@Test(priority=1)
	public void Mouse_hover()
	{
		abc.MouseHover();
	}
	
	
	
	
	@Test(priority=2)
	public void messagedisplay()
	{
		abc.message_read();
	}
}
