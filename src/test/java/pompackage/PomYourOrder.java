package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import amazonbasePackage.Amazonbaseclass;

public class PomYourOrder extends Amazonbaseclass {

	@FindBy(id="orderFilter_0")//the past 30 days
	WebElement a;
	@FindBy(id="orderFilter_1")//the past 3 months
	WebElement b;

	@FindBy(css="#\\a \\9 \\@FindBy\\(id\\=")//2022
	WebElement c;

	@FindBy(id="orderFilter_3")//2021
	WebElement d;

	@FindBy(id="orderFilter_4")//2020
	WebElement e;

	@FindBy(css="#orderTypeMenuContainer > ul > li.selected > span > span")//orders
	WebElement f;
	@FindBy(css="#orderTypeMenuContainer > ul > li:nth-child(3) > span > a")//Buy again
	WebElement g;
	@FindBy(css="#orderTypeMenuContainer > ul > li:nth-child(4) > span > a")//not yet shipped
	WebElement h;
	@FindBy(css="#orderTypeMenuContainer > ul > li:nth-child(5) > span > a")//Cancelled order
	WebElement i;
	
	public PomYourOrder() {
		
		PageFactory.initElements(driver,this);
	}
	
	public void Navigate_to_orderhistorypage()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.cssSelector("#nav_prefetch_yourorders > span")).click();
	}
	
	public void orders_past3months()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.cssSelector("#nav_prefetch_yourorders > span")).click();
		Select obj=new Select(driver.findElement(By.name("orderFilter")));
		obj.selectByVisibleText("past 3 months");
	}
	
	
	public void orders_2021()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.cssSelector("#nav_prefetch_yourorders > span")).click();
		Select obj=new Select(driver.findElement(By.name("orderFilter")));
		obj.selectByVisibleText("2021");
	}
	public void orders_2020()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.cssSelector("#nav_prefetch_yourorders > span")).click();
		Select obj=new Select(driver.findElement(By.name("orderFilter")));
		obj.selectByVisibleText("2020");
	}
	
	public void BUYAGAIN()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.linkText("Buy Again")).click();
		g.click();
	}
	
	public void NOTYETSHIPPED()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Not Yet Shipped')]")).click();
		h.click();
	}
	
	public void CANCELLEDORDER()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.linkText("Cancelled Orders")).click();
		i.click();
	}
	
	
	
	
	
	
	
	
}
