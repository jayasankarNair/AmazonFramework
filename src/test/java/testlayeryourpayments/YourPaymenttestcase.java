package testlayeryourpayments;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasePackage.Amazonbaseclass;
import pompackage.PomYourPayments;

public class YourPaymenttestcase extends Amazonbaseclass {
      PomYourPayments q;
	public YourPaymenttestcase()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initiate();
		q= new PomYourPayments();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		driver.findElement(By.cssSelector("#nav-flyout-ya-signin > a > span")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("jai555925@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("2ead4647");
		driver.findElement(By.id("signInSubmit")).click();
	}
	@Test
	public void ADDPAYEMNTS() throws InterruptedException
	{
		q.addpayment();
	}
	
	@Test
	public void DEFAULTPAYMENT()
	{
		q.default_paymentmethod();
	}
}
