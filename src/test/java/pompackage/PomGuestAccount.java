package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbasePackage.Amazonbaseclass;

public class PomGuestAccount extends Amazonbaseclass {
 
	
	 @FindBy(id="twotabsearchtextbox")
	 WebElement searchbox;//searchbox
	 @FindBy(id="nav-search-submit-button")
	 WebElement searchbutton;
	 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div[3]/div[2]/h2/a/span")
	 WebElement product;//tshirt
	 @FindBy(css="#size_name_0 > span > input")
	 WebElement small;//size
	 @FindBy(id="buy-now-button")
	 WebElement buynow; 
	 
	 public PomGuestAccount()
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	 public void navigate()
	 {
		 searchbox.sendKeys("tshirt");
		 searchbutton.click();
	 }
	 
	 public void buy_as_a_guest()
	 {

		 searchbox.sendKeys("tshirt");
		 searchbutton.click();
		 product.click();
		 small.click();
		 buynow.click();
	 }
	 
}
