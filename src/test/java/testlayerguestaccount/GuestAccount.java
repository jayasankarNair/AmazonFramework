package testlayerguestaccount;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasePackage.Amazonbaseclass;
import pompackage.PomGuestAccount;

public class GuestAccount extends Amazonbaseclass {
	
	PomGuestAccount xyz;
	public GuestAccount()
	{
		super();
	}
	@BeforeMethod
	public void INITIAL()
	{
		initiate();
		xyz=new PomGuestAccount();
	}
	
	@Test(priority=1)
	public void NAVIGATE()
	{
		xyz.navigate();
	}
	@Test(priority=2)
	public void BUYASAGUEST()
	{
		xyz.buy_as_a_guest();
	}
	
	@AfterMethod
	public void closedriver() {
		driver.close();
	}
	
	
	

}
