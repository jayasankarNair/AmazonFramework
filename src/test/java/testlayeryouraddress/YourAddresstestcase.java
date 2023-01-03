package testlayeryouraddress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasePackage.Amazonbaseclass;
import pompackage.PomYourAddress;
import pompackage.PomYourOrder;

public class YourAddresstestcase extends Amazonbaseclass {
	PomYourAddress set;
	 public YourAddresstestcase()
	 {
		 super();
	 }
	 
	 @BeforeMethod
	 public void setup()
	 {
		 initiate();
		 set=new PomYourAddress();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
	 public void ADDRESSMOD()
	 {
		 set.AddressModule();
	 }
	 
	 
	 @Test(priority=2)
	 public void ADDADDRESSMOD()
	 {
		 set.AddAddressModule();
	 }
	 @Test(priority=3)
	 public void COUNTRY()
	 {
		 set.country();
	 }
	 @Test(priority=4)
	 public void DEFAULT_ADDRESS ()
	 {
		 set.default_address();
	 }
	 @Test(priority=5)
	 public void ADDITIONALINFO ()
	 {
		 set.additional_delivary_info();
	 }
	 @Test(priority=6)
	 public void ADDRESSBUTTON ()
	 {
		 set.addaddress_button();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
