package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import amazonbasePackage.Amazonbaseclass;

public class PomShoppingCart extends Amazonbaseclass {
	
	 @FindBy(id="twotabsearchtextbox")
	 WebElement searchbox;
	 @FindBy(id="nav-search-submit-button")
	 WebElement searchbutton;
	 @FindBy(linkText="Mens Base Plate Blended Long-Sleeve T-Shirt with Logo")
	 WebElement tshirt;
	 @FindBy(xpath="//span[contains(text(),'Mens Eversoft Cotton Short Sleeve Pocket T-Shirts,')]")
	 WebElement tshirt2;
	 @FindBy(id="add-to-cart-button")
	 WebElement addtocart;
	 @FindBy(css="#size_name_0 > span > input")
	 WebElement sizesmall;
	 @FindBy(css="#size_name_1 > span > input")
	 WebElement sizemedium;
	 @FindBy(css="#corePriceDisplay_desktop_feature_div > div.a-section.a-spacing-none.aok-align-center > span > span:nth-child(2) > span.a-price-whole")
	 WebElement price;
	 @FindBy(xpath="//span[@id='productTitle']")
	 WebElement productname;
	 @FindBy(css="#unrolledImgNo0 > div > img")
	 WebElement image;
	 @FindBy(xpath="//a[@id='nav-cart']")
	 WebElement cart;
	 
	 
	 
	 public PomShoppingCart()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void Add_one_item() throws InterruptedException
	 {
		 searchbox.sendKeys("t-shirt men");
		 searchbutton.click();
		 tshirt.click();
		 boolean a = price.isDisplayed();
		 System.out.println(a);
		 boolean b = productname.isDisplayed();
		 System.out.println(b);
		 boolean c = image.isDisplayed();
		 System.out.println(c);
		 Thread.sleep(2000);
		 addtocart.click();
		 WebElement e= driver.findElement(By.xpath("//span[contains(text(),'Added to Cart')]"));
		System.out.println(e.getText());		 
	 }
	 
	 public void Add_sameitem_multipletimes() throws InterruptedException
	 {
		 searchbox.sendKeys("t-shirt men");
		 searchbutton.click();
		 tshirt.click();
		 Select quantity = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
		 quantity.selectByIndex(2);
		 Thread.sleep(2000);
		 addtocart.click();
		 WebElement f= driver.findElement(By.xpath("//div[@id='sw-subtotal']"));
		System.out.println(f.getText());
		
     }
	 
	 public void increase_quantity_ofitems()
	 {
		 searchbox.sendKeys("t-shirt men");
		 searchbutton.click();
		 tshirt.click();
		 addtocart.click();
		 WebElement g= driver.findElement(By.cssSelector("#sw-subtotal > span:nth-child(2) > span > span:nth-child(2) > span.a-price-whole"));
			System.out.println(g.getText());
		 driver.navigate().back();
		 driver.navigate().back();
		 tshirt2.click();
		 addtocart.click();
		 WebElement h= driver.findElement(By.cssSelector("#sw-subtotal > span:nth-child(2) > span > span:nth-child(2) > span.a-price-whole"));
			System.out.println(h.getText());
		 
		 
		 
	 }
	 
	 public void multipleitems_differenttypes()
	 {
		 searchbox.sendKeys("t-shirt men");
		 searchbutton.click();
		 tshirt.click();
		 sizesmall.click();
		 addtocart.click();
		 WebElement i= driver.findElement(By.cssSelector("#sw-subtotal > span:nth-child(2) > span > span:nth-child(2) > span.a-price-whole"));
			System.out.println(i.getText());
			driver.navigate().back();
			sizemedium.click();
			addtocart.click();
			WebElement j= driver.findElement(By.cssSelector("#sw-subtotal > span:nth-child(2) > span > span:nth-child(2) > span.a-price-whole"));
			System.out.println(j.getText());
	 }
	 
	 public void remove_someitems_cart()
	 {
		 searchbox.sendKeys("t-shirt men");
		 searchbutton.click();
		 tshirt.click();
		 addtocart.click();
		 driver.navigate().back();
		 driver.navigate().back();
		 tshirt2.click();
		 addtocart.click();
		 cart.click();
		 driver.findElement(By.xpath("//input[@name='submit.delete.C15334cab-2eaf-4629-9ec0-a9c5623bfae3']")).click();
		 WebElement k= driver.findElement(By.cssSelector("#sc-active-C81cf905a-4d61-4040-9a90-73fce23987bf > div.sc-list-item-content > div > div:nth-child(3) > ul > div > p > span"));
			System.out.println(k.getText());
		 
	 }
	 public void removeallitems()
	 {
		 searchbox.sendKeys("t-shirt men");
		 searchbutton.click();
		 tshirt.click();
		 addtocart.click();
		 driver.navigate().back();
		 driver.navigate().back();
		 tshirt2.click();
		 addtocart.click();
		 cart.click();
		 driver.findElement(By.xpath("//input[@name='submit.delete.C15334cab-2eaf-4629-9ec0-a9c5623bfae3']")).click();
		 driver.findElement(By.xpath("//input[@name='submit.delete.C81cf905a-4d61-4040-9a90-73fce23987bf']")).click();
		 WebElement l= driver.findElement(By.xpath("//span[@id='sc-subtotal-label-activecart']"));
			System.out.println(l.getText());
	 }
	 
	 public void click_item_cart()
	 {
		 searchbox.sendKeys("t-shirt men");
		 searchbutton.click();
		 tshirt.click();
		 addtocart.click();
		 cart.click();
		 driver.findElement(By.linkText("Timberland PRO Men's Base Plate Blended Long-Sleeve T-Shirt with Logo, Dark Charcoal Heather, Small"));
		 
		 
	 }
	 public void additems_close_reopen() throws InterruptedException
	 {
		 searchbox.sendKeys("t-shirt men");
		 searchbutton.click();
		 tshirt.click();
		 addtocart.click();
		 driver.close();
		 Thread.sleep(5000);
		 driver.get("https://www.amazon.ca/?ref_=icp_country_from_ca");
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
			driver.findElement(By.cssSelector("#nav-flyout-ya-signin > a > span")).click();
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("jai555925@gmail.com");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("2ead4647");
			driver.findElement(By.id("signInSubmit")).click();
			Thread.sleep(5000);
			cart.click();
			 WebElement m= driver.findElement(By.xpath("//span[@id='sc-subtotal-label-buybox']"));
				System.out.println(m.getText());
	 }
	 
	 
	 
	 
	 
	 
	 

}
