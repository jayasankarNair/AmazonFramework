package testlayershoppingcart;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasePackage.Amazonbaseclass;
import pompackage.PomShoppingCart;

public class Shoppingcarttestcases extends Amazonbaseclass {
	
	PomShoppingCart q;
	public Shoppingcarttestcases()
	{
		super();
	}
	
	@BeforeMethod
	public void SETUP()
	{
		initiate();
		q=new PomShoppingCart();
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
	public void ADDONEITEM() throws InterruptedException
	{
		q.Add_one_item();
	}
	@Test(priority=2)
	public void ADDSAMEITEMMULTIPLE() throws InterruptedException
	{
		q.Add_sameitem_multipletimes();
	}
	@Test(priority=3)
	public void INCREASEQUANTITY() throws InterruptedException
	{
		q.increase_quantity_ofitems();
	}
	@Test(priority=4)
	public void MULTIPLEITEMS_DIFFERENTTYPES() throws InterruptedException
	{
		q.multipleitems_differenttypes();
	}
	@Test(priority=5)
	public void REMOVESOMEITEMS() throws InterruptedException
	{
		q.remove_someitems_cart();
	}
	@Test(priority=6)
	public void REMOVEALLITEMS() throws InterruptedException
	{
		q.removeallitems();
	}
	@Test(priority=7)
	public void CLICKITEM_CART() throws InterruptedException
	{
		q.click_item_cart();
	}
	
	@Test(priority=8)
	public void ADDITEMS_CLOSE_REOPEN() throws InterruptedException
	{
		q.additems_close_reopen();
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	
	


	

}
