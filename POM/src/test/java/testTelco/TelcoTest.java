package testTelco;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectsTelcoProject.AddCustomer;
import pageObjectsTelcoProject.AddTariffPlantoCustomer;

public class TelcoTest {
	AddCustomer ac = new AddCustomer();
	AddTariffPlantoCustomer at = new AddTariffPlantoCustomer();
	
	@Test
		public void Test1() {
		ac.clickAddCustomer();
		ac.clickRadioDone();
		ac.enterFirstName("Test");
		ac.enterLastName("Testing");
		ac.enterEmail("Testing@gmail.com");
		ac.enterAddress("!23 test");
		ac.enterMobileNumber("0987654321");
		ac.clickSubmit();
		
		
		
		String ActualMsg = ac.getAlertText();
		String ExpectedMsg ="please fill all fields";
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		ac.closeAlertText();
		
	}

}
