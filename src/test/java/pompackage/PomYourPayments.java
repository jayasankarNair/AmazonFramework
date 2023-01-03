 package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import amazonbasePackage.Amazonbaseclass;

public class PomYourPayments extends Amazonbaseclass
{
   
	@FindBy(linkText="Add a payment method")//add payment method
	WebElement a;
	@FindBy(xpath="//*[@id=\"pp-DMpKWx-35\"]/span/input")//add credit or debit
	WebElement b;
	@FindBy(id="pp-NbJuoq-16")//name on the card
	WebElement e;
	@FindBy(id="pp-NbJuoq-18")//name on the card
	WebElement f;
	@FindBy(css="#pp-VITlp1-22 > span > span")//expiration day
	WebElement g;
	@FindBy(css="//*[@id=\"pp-T9osnh-23\"]/span/span/span")//expiration year
	WebElement h;
	@FindBy(css="#pp-hGRXSZ-25 > span > input")//add your card
	WebElement z;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/ul/div/li[4]/span/a")//settings
	WebElement c;
	@FindBy(xpath="//*[@id=\"cpefront-view-one-click-widget\"]/div[1]/div/div[1]/a")//change preference
	WebElement d;
	@FindBy(xpath="//*[@id=\"cpefront-mpo-widget\"]/div/div[3]/form[1]/div/div[2]/div/div/div[2]/div[1]/span[2]/input")
	WebElement k;
	
	public PomYourPayments()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void  addpayment() throws InterruptedException
	{
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/h2")).click();
		a.click();
		Thread.sleep(2000);
		b.click();
		Thread.sleep(2000);
		e.sendKeys("5123456789012346");
		f.sendKeys("jayasankar");
		Select obj3=new Select(driver.findElement(By.xpath("//*[@id=\"pp-rrUprj-22\"]/span/span/span")));
		obj3.selectByVisibleText("01");
		Select obj4=new Select(driver.findElement(By.xpath("//*[@id=\"pp-rrUprj-23\"]/span/span/span")));
		obj4.selectByVisibleText("2022");
		z.click();
		
		
	}
	public void default_paymentmethod()
	{
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/h2")).click();
		c.click();
		d.click();
		k.click();
		WebElement q=driver.findElement(By.cssSelector("#pp-CKdkTF-73 > h1"));
		System.out.println(q.getText());
		
	}
	
}
