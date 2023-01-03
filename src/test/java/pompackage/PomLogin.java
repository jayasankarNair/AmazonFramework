package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbasePackage.Amazonbaseclass;

public class PomLogin extends Amazonbaseclass{
	
	@FindBy(id="ap_email")
	WebElement Email;
	@FindBy(id="continue")
	WebElement Continuebutton;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement Signinbutton;
	
	public PomLogin()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void typeemailid(String email)
	{
		Email.sendKeys(email);
		
	}
	
	public void click_Continue_button()
	{
		Continuebutton.click();
	}
	
	public void type_password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void Click_Signin_button()
	{
		Signinbutton.click();
	}
	

}
