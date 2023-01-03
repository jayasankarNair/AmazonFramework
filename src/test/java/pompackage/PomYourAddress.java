package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import amazonbasePackage.Amazonbaseclass;

public class PomYourAddress extends Amazonbaseclass {
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/div/span")
	WebElement a;//Address module
	@FindBy(xpath="//*[@id=\"ya-myab-address-add-link\"]/div/div")
	WebElement b;// add address module
	@FindBy(css="#address-ui-widgets-countryCode > span > span")
	WebElement c;//change country
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement d;//name
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement e;//number
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement f;//address
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement g;//city
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span")
	WebElement h;//province
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement i;//postalcode
	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement j;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[4]/a/span/span")
	WebElement k;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")
	WebElement l;
	
	public PomYourAddress()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void AddressModule()
	{
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		a.click();
		System.out.println(b.getText());
		
	}
	public void AddAddressModule()
	{
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		a.click();
		b.click();
		WebElement x = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/h2"));
		System.out.println(x.getText());
	}
	public void country()
	{
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		a.click();
		b.click();
		Select obj1= new Select(c);
		obj1.selectByVisibleText("Canada");
	}
	public void default_address() {
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		a.click();
		b.click();
		Select obj1= new Select(c);
		obj1.selectByVisibleText("Canada");
		d.sendKeys("jayasankar");
		e.sendKeys("6138700214");
		f.sendKeys("1506 frances ann");
		g.sendKeys("Cornwall");
		Select obj2=new Select(h);
		obj2.selectByVisibleText("Ontario");
		i.sendKeys("k6h2l2");
		j.isSelected();
	}
	
	public void additional_delivary_info()
	{
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		a.click();
		b.click();
		Select obj1= new Select(c);
		obj1.selectByVisibleText("Canada");
		d.sendKeys("jayasankar");
		e.sendKeys("6138700214");
		f.sendKeys("1506 frances ann");
		g.sendKeys("Cornwall");
		Select obj2=new Select(h);
		obj2.selectByVisibleText("Ontario");
		i.sendKeys("k6h2l2");
		j.isSelected();
		k.click();
	}
	public void addaddress_button()
	{

		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		a.click();
		b.click();
		Select obj1= new Select(c);
		obj1.selectByVisibleText("Canada");
		d.sendKeys("jayasankar");
		e.sendKeys("6138700214");
		f.sendKeys("1506 frances ann");
		g.sendKeys("Cornwall");
		Select obj2=new Select(h);
		obj2.selectByVisibleText("Ontario");
		i.sendKeys("k6h2l2");
		j.isSelected();
		k.click();
		l.click();
	}
		
		
		
		
	
	
	

}
