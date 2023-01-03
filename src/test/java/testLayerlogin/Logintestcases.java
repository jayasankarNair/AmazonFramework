package testLayerlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasePackage.Amazonbaseclass;
import pompackage.PomLogin;

public class Logintestcases extends Amazonbaseclass {
	
	PomLogin Log;
	
	public Logintestcases()
	{
		super();
		
	}
	
	@BeforeMethod
	public void initsetup()
	{
		initiate();
	    Log= new PomLogin();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		driver.findElement(By.cssSelector("#nav-flyout-ya-signin > a > span")).click();
		
		
	}
	@Test(priority=1)
	public void invalid_email_id() throws InterruptedException
	{
		
		Log.typeemailid(prop.getProperty("email"));
		Thread.sleep(2000);
		Log.click_Continue_button();
		Thread.sleep(2000);
		WebElement e= driver.findElement(By.cssSelector("#auth-error-message-box > div > h4"));
		System.out.println(e.getText());
		
		
		
	}
	@Test(priority=2)
	public void valid_email_id() throws InterruptedException
	{
		
		Log.typeemailid(prop.getProperty("email"));
		Thread.sleep(2000);
		Log.click_Continue_button();
		Thread.sleep(2000);
		
		
	}
	@Test(priority=3)
	public void blank_email_id() throws InterruptedException
	{
		
		Log.typeemailid(prop.getProperty("email"));
		Thread.sleep(2000);
		Log.click_Continue_button();
		Thread.sleep(2000);
		WebElement e= driver.findElement(By.cssSelector("#auth-email-missing-alert > div > div"));
		System.out.println(e.getText());
		
		
	}
	
	@Test(priority=4)
	public void continuebutton() throws InterruptedException
	{
		Log.typeemailid(prop.getProperty("email"));
		Thread.sleep(2000);
		Log.click_Continue_button();
		Thread.sleep(2000);
		WebElement e= driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/div/form/div/div[1]/div[1]/div[1]/label"));
		System.out.println(e.getText());
		
		
	}

	@Test(priority=5)
	public void invalid_password() throws InterruptedException
	{
		Log.typeemailid(prop.getProperty("email"));
		Thread.sleep(2000);
		Log.click_Continue_button();
		Thread.sleep(2000);
		Log.type_password(prop.getProperty("password"));
		Thread.sleep(2000);
		Log.Click_Signin_button();
		WebElement e= driver.findElement(By.cssSelector("#auth-error-message-box > div > h4"));
		System.out.println(e.getText());
		
		
	}
	@Test(priority=6)
	public void empty_password_field() throws InterruptedException
	{
		Log.typeemailid(prop.getProperty("email"));
		Thread.sleep(2000);
		Log.click_Continue_button();
		Thread.sleep(2000);
		Log.type_password(prop.getProperty("password"));
		Thread.sleep(2000);
		Log.Click_Signin_button();
		WebElement e= driver.findElement(By.xpath("//*[@id=\"auth-password-missing-alert\"]/div/div"));
		System.out.println(e.getText());
	}

@Test(priority=7)
public void K_field() throws InterruptedException
{
	Log.typeemailid(prop.getProperty("email"));
	Thread.sleep(2000);
	Log.click_Continue_button();
	Thread.sleep(2000);
	Log.type_password(prop.getProperty("password"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/div/form/div/div[2]/div/div/label/div/label/input")).isSelected();
	Thread.sleep(2000);
	Log.Click_Signin_button();
}
		
		
	
	
	
	@AfterMethod()
	
		public void close() {
			
			driver.close();
		}
	}


