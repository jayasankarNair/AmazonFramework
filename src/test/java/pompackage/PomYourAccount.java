package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbasePackage.Amazonbaseclass;

public class PomYourAccount extends Amazonbaseclass {
	
	@FindBy(id="nav-link-accountList")
	WebElement a;
	
	public PomYourAccount() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void MouseHover()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();
	}
	
	public void message_read()
	{
		WebElement x=a;
		System.out.println(x.getText());
	}
	

}
