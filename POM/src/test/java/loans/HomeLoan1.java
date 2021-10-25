package loans;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan1 {
	@Test
	
	public void myHouseInsuranceLoan() {
		System.out.println("House Insurance");
		Assert.assertTrue(false);
		String expectedTitle = "Insurance1";
		String actualTitle = "Insurance";
		
		Reporter.log("expected ------>"+ expectedTitle);
		Reporter.log("actual ------>"+ actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	@Test
	public void myHouseInsuranceBoost() {
		System.out.println("The House Insurance booster");
		String expectedTitle1 = "House Insurance1";
		String actualTitle1 = "House Insurance1";
		
		Reporter.log("expected ------>"+ expectedTitle1);
		Reporter.log("actual ------>"+ actualTitle1);
		
		Assert.assertEquals(expectedTitle1, actualTitle1);
	}
	@BeforeTest
	@AfterTest
	
	public void cleanDB() {
		System.out.println("let's clean our database ");
	}
	@AfterSuite
	public void ResetGlobalVariables() {
		System.out.println(" Reset our Variables");
	}

}
