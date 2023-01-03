package TestLayersearchfacility;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasePackage.Amazonbaseclass;
import pompackage.PomYourOrder;
import pompackage.Searchfacility;

public class SEARCHFACILITY extends Amazonbaseclass {
	Searchfacility a;
	public SEARCHFACILITY()
	{
		super();
	}
	
	@BeforeMethod
	public void initialSETUP()
	{
		initiate();
		a =new Searchfacility();
		driver.get("https://www.amazon.ca/?ref_=icp_country_from_ca");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		driver.findElement(By.cssSelector("#nav-flyout-ya-signin > a > span")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("jai555925@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("2ead4647");
		driver.findElement(By.id("signInSubmit")).click();
	}
	@Test
	public void Keyword()
	{
		a.search_on_keyword();
	}
	
	@Test
	public void description()
	{
		a.search_on_description();
	}
	@Test
	public void partialitemtext()
	{
		a.search_on_partialitemtext();
	}
	@Test
	public void itemnumber()
	{
		a.search_on_itemnumber();
	}
	@Test
	public void partialitemnumber()
	{
		a.search_on_partialitemnumber();
	}
	@Test
	public void categorykeyword()
	{
		a.search_on_categorykeyword();
	}
	@Test
	public void productinfo()
	{
		a.product_info();
	}
	@Test
	public void productperpage()
	{
		a.no_of_product_per_page();
	}
	
	
	
	@Test
	public void PAGINATION() throws InterruptedException
	{
		a.pagination();
	}
	@Test
	public void CUSTOMERRATING()
	{
		a.filtration_customerrating();
	}
	@Test
	public void BRAND()
	{
		a.filtration_Brand();
	}
	@Test
	public void PRICE()
	{
		a.filtration_price();
	}
	@Test
	public void AVAILABILITY()
	{
		a.filtration_availability();
	}
	@Test
	public void ARRIVAL()
	{
		a.sorting_Newest_Arrival();
	}
	@Test
	public void PRICE1()
	{
		a.sorting_Price1();
	}
	@Test
	public void PRICE2()
	{
		a.sorting_price2();
	}
	@Test
	public void RATING()
	{
		a.sorting_Rating();
	}
	@Test
	public void SORTINGANDFILTRATION() throws InterruptedException
	{
		a.Sorting_Filtration();
	}
	@Test
	public void SORTINGFILTRATIONANDPAGINATION() throws InterruptedException
	{
		a.sorting_filtration_pagination();
	}
	
	
	
	
	
	
	
	
	
	
	

}
