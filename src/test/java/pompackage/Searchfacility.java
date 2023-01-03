package pompackage;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import amazonbasePackage.Amazonbaseclass;

public class Searchfacility extends Amazonbaseclass{
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;//searchbox
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;//searchbutton
	@FindBy(xpath="//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")
	WebElement productsperpage;
	@FindBy(className="a-size-base-plus a-color-base a-text-normal")
	WebElement product;
	@FindBy(id="litb-canvas-click-wrapper")
	WebElement image;
	@FindBy(id="productTitle")
	WebElement name;
	@FindBy(className="a-size-base a-color-price a-color-price")
	WebElement price;
	@FindBy(xpath="//*[@id=\"acrPopover\"]/span[1]/a/i[1]")
	WebElement customerrating;
	@FindBy(id="acrCustomerReviewText")
	WebElement no_of_reviews;
	@FindBy(className="s-pagination-item s-pagination-next s-pagination-button s-pagination-separator")
	WebElement nextpage;
	
	public Searchfacility()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void search_on_keyword()
	{
		searchbox.sendKeys("t-shirt");
		searchbutton.click();
	}
	
	public void search_on_description()
	{
		searchbox.sendKeys("t-shirt for men"); 
		searchbutton.click();
	}
	public void search_on_partialitemtext()
	{
		searchbox.sendKeys("t-sh"); 
		searchbutton.click();
	}
	public void search_on_itemnumber()
	{
		searchbox.sendKeys("B00005N5PF"); 
		searchbutton.click();
	}
	public void search_on_partialitemnumber()
	{
		searchbox.sendKeys("5N5PF"); 
		searchbutton.click();
	}
	public void search_on_categorykeyword()
	{
		searchbox.sendKeys("books"); 
		searchbutton.click();
	}
	
	public void product_info()
	{
		searchbox.sendKeys("midnight children salman rushdie"); 
		searchbutton.click();
		product.click();
		
		boolean x= image.isDisplayed();
		System.out.println(x);
		boolean y= name.isDisplayed();
		System.out.println(y);
		boolean z= price.isDisplayed();
		System.out.println(z);
		boolean u= customerrating.isDisplayed();
		System.out.println(u);
		boolean v= no_of_reviews.isDisplayed();
		System.out.println(v);
		
	}
	public void no_of_product_per_page()
	{
		searchbox.sendKeys("midnight children salman rushdie"); 
		searchbutton.click();
		WebElement e= productsperpage;
		System.out.println(e.getText());
	}
	
	public void pagination() throws InterruptedException
	{
		searchbox.sendKeys("midnight children salman rushdie"); 
		searchbutton.click();
		String displayedCount =productsperpage.getText().split(" ")[2]; 
		WebElement nextbutton=nextpage;
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000);");
		List<WebElement>prod=driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));
		List<String> productNames= new ArrayList();
		for(WebElement names: prod)
		{
			productNames.add(names.getText());
			System.out.println(names.getText());
		}
		System.out.println("*************************************");
		
		while(true)
		{
			Thread.sleep(2000);
			nextbutton.click();
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, 5000);");
			Thread.sleep(3000);
			prod=driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));
			for(WebElement names: prod)
			{
				productNames.add(names.getText());
				System.out.println(names.getText());
			}
			System.out.println("*************************************");
			try {
				 nextbutton=nextpage;
			}
			catch(Exception e)
			{
				System.out.println("No More Product");
				break;
			}
			
		}
		System.out.println("*************************************");
		
		System.out.println("My Number of products are:"+productNames.size());
		System.out.println("Total number of displayed products:"+displayedCount);
	}
	
	public void filtration_customerrating()
	{
		searchbox.sendKeys("tshirt for men");
		searchbutton.click();
		driver.findElement(By.cssSelector("#p_72\\/11192169011 > span > a > section > i")).click();
		}
	public void filtration_Brand()
	{
		searchbox.sendKeys("tshirt for men");
		searchbutton.click();
		driver.findElement(By.cssSelector("#p_89\\/Amazon\\ Essentials > span > a > div > label > i")).click();
		
		}
	public void filtration_price()
	{
		searchbox.sendKeys("tshirt for men");
		searchbutton.click();
		driver.findElement(By.xpath("//span[contains(text(),'Under $25')]")).click();
		
		}
	public void filtration_availability()
	{
		searchbox.sendKeys("tshirt for men");
		searchbutton.click();
		driver.findElement(By.cssSelector("#p_n_availability\\/12035748011 > span > a > div > label > i")).click();
	}
	public void sorting_Newest_Arrival()
	{
		searchbox.sendKeys("tshirt for men");
		searchbutton.click();
		WebElement drpsortEle=driver.findElement(By.cssSelector("#s-result-sort-select"));
		Select drpsort= new Select(drpsortEle);
		drpsort.selectByVisibleText("Newest arrivals");
	}
	public void sorting_Price1()
	{
		searchbox.sendKeys("tshirt for men");
		searchbutton.click();
		WebElement drpsortEle=driver.findElement(By.cssSelector("#s-result-sort-select"));
		Select drpsort= new Select(drpsortEle);
		drpsort.selectByVisibleText("Price: Low to high");
	}
	
	public void sorting_price2()
	{
		searchbox.sendKeys("tshirt for men");
		searchbutton.click();
		WebElement drpsortEle=driver.findElement(By.cssSelector("#s-result-sort-select"));
		Select drpsort= new Select(drpsortEle);
		drpsort.selectByVisibleText("Price: High to low");
	}
	public void sorting_Rating()
	{
		searchbox.sendKeys("tshirt for men");
		searchbutton.click();
		WebElement drpsortEle=driver.findElement(By.cssSelector("#s-result-sort-select"));
		Select drpsort= new Select(drpsortEle);
		drpsort.selectByVisibleText("Avg. customer review");
	}
	
	
	
	public void Sorting_Filtration() throws InterruptedException
	{
		searchbox.sendKeys("tshirt for men");
		searchbutton.click();
		WebElement drpsortEle=driver.findElement(By.cssSelector("#s-result-sort-select"));
		Select drpsort= new Select(drpsortEle);
		drpsort.selectByVisibleText("Price: High to low");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Under $25')]")).click();
		
		
		
	}
	public void sorting_filtration_pagination() throws InterruptedException
	{
		searchbox.sendKeys("midnight children salman rushdie");
		searchbutton.click();
		WebElement drop= driver.findElement(By.cssSelector("#s-result-sort-select"));
		Select dropdn= new Select(drop);
		dropdn.selectByVisibleText("Price: High to low");
		Thread.sleep(3000);
		String displayedCount =productsperpage.getText().split(" ")[2]; 
		WebElement nextbutton=nextpage;
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000);");
		List<WebElement>prod=driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));
		List<String> productNames= new ArrayList();
		for(WebElement names: prod)
		{
			productNames.add(names.getText());
			System.out.println(names.getText());
		}
		System.out.println("*************************************");
		
		while(true)
		{
			Thread.sleep(2000);
			nextbutton.click();
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, 5000);");
			Thread.sleep(3000);
			prod=driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));
			for(WebElement names: prod)
			{
				productNames.add(names.getText());
				System.out.println(names.getText());
			}
			System.out.println("*************************************");
			try {
				 nextbutton=nextpage;
			}
			catch(Exception e)
			{
				System.out.println("No More Product");
				break;
			}
			
		}
		System.out.println("*************************************");
		
		System.out.println("My Number of products are:"+productNames.size());
		System.out.println("Total number of displayed products:"+displayedCount);
		
		
		
		
		
	}
	
	
	
	
	
	

}
