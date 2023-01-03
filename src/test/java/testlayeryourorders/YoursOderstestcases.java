package testlayeryourorders;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasePackage.Amazonbaseclass;
import pompackage.PomYourOrder;

public class YoursOderstestcases extends Amazonbaseclass{
	
	PomYourOrder xyz;
	public YoursOderstestcases()
	{
		super();
	}
	@BeforeMethod
	public void initialsetup()
	{
		initiate();
		xyz=new PomYourOrder();
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
	public void navigate()
	{
		xyz.Navigate_to_orderhistorypage();
	}
	@Test(priority=2)
	public void past3months()
	{
		xyz.orders_past3months();
	}
	
	

	@Test(priority=4)
	public void Orders2021()
	{
		xyz.orders_2021();
	}

	@Test(priority=5)
	public void Orders2020()
	{
		xyz.orders_2020();
	}

	@Test(priority=6)
	public void buyagain()
	{
		xyz.BUYAGAIN();
	}
	@Test(priority=6)
	public void notyetshipped()
	{
		xyz.NOTYETSHIPPED();
	}
	@Test(priority=7)
	public void CANCELLEDORDERS()
	{
		xyz.CANCELLEDORDER();
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	

}
