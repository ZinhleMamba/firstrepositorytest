package testTelco;


import org.testng.Assert;
import org.testng.annotations.Test;

import FrameworkClasses.BasePage;
import PageObjectsDstv.LandingPage;
import pageObjectsTelcoProject.AddCustomer;

public class TelcoAddCusstomer {
	LandingPage lps = new LandingPage();
	AddCustomer ac = new AddCustomer();
	//BasePage bp = new BasePage();
	
//	@Test
//	
//	public void GIVEN_Guru99Homepage_WHEN_AssertTitleOnFormIsUsed_THEN_TitleOnFormMatches() {
//		//GIVEN
//		ac.goToHomePage();
//		//WHEN
//		String ActualHeading1 = ac.assertGuru99Heading();
//		String ExpectedHeading1 = "Guru99 telecom";
//		
//		//THEN
//		Assert.assertEquals(ActualHeading1, ExpectedHeading1);
//		
//	}
//	@Test
//	
//	public void GIVEN_Guru99Homepage_WHEN_AssertAddCustomerOnFormIsUsed_THEN_AddCustomerOnFormMatches() {
//		//GIVEN
//		ac.goToHomePage();
//		//WHEN
//		String ActualHeading2 = ac.assertAddCustomerHeading();
//		String ExpectedHeading2 = "Add Customer";
//		//THEN
//		Assert.assertEquals(ActualHeading2, ExpectedHeading2);
//		
//	}
//	
	@Test
	public void GIVEN_AddCustomerDetailsOnForm_WHEN_InvalidDataIsEntered_THEN_WarningMessageIsDisplayed() {
		
//		//GIVEN
//		//AddCustomer form is open
		ac.goToHomePage();
		ac.clickAddCustomer();
		
		//WHEN
		//user's information is entered
		ac.clickRadioDone();
		ac.enterFirstName("Zee");
		ac.enterLastName("Zekethelo");
		ac.enterEmail("meddiaa@gmail.com");
		//incorrect address is entered
		ac.enterAddress("123, exte 4566 !1 wewtw");	
		//ac.enterMobileNumber("0732480988");
		String actualError = ac.specailCharsErrorMessage();
		String expectedError = "Special characters are not allowed";
		Assert.assertEquals(actualError, expectedError);

		
	}
	@Test
	public void GIVEN_AddCustomerDetailsOnForm_WHEN_InvalidDataIsEntered_THEN_Alert_WHEN_SubmitButtonIsPressed()  {
		
		//GIVEN
		//Test 1 has executed
		//AddCustomer form is open
				ac.goToHomePage();
				ac.clickAddCustomer();
				
				
				//WHEN
				//user's information is entered
				ac.clickRadioDone();
				ac.enterFirstName("Zee");
				ac.enterLastName("Zekethelo");
				ac.enterEmail("meddiaa@gmail.com");
				//incorrect address is entered
				ac.enterAddress("123 exte 45661! wewtw");
				ac.enterMobileNumber("0732480988");
				
				//WHEN
				ac.clickSubmit();
				//Thread.sleep(5000);
			
				
				
			
		
	}
	
	@Test
	public void GIVEN_ValidDataIsEntered_WHEN_SubmitButtonIsPressed_THEN_IdIsDisplayed() {
		
		//WHEN
		ac.goToHomePage();
		ac.clickAddCustomer();
		ac.clickRadioDone();
		//user's information is entered
		ac.enterFirstName("Zee");
		ac.enterLastName("Zekethelo");
		ac.enterEmail("meddiaa@gmail.com");
		//a correct address is entered
		ac.enterAddress("123 exte 45661 wewtw");
		ac.enterMobileNumber("0732480988");

		//WHEN
		ac.clickSubmit();
		//THEN
		//ac.customerID();
		System.out.println("The Done's ID: "+ ac.customerID());
		
		
	}
	@Test
	
public void GIVEN_ValidDataIsEntered_AND_PendingIsSelected_WHEN_SubmitButtonIsPressed_THEN_IdIsDisplayed() {
		
		//WHEN
		ac.goToHomePage();
		ac.clickAddCustomer();
		ac.clickRadioPending();
		//user's information is entered
		ac.enterFirstName("Zie");
		ac.enterLastName("Zekethe");
		ac.enterEmail("medunsa@gmail.com");
		//a correct address is entered
		ac.enterAddress("190 exte 45661 was");
		ac.enterMobileNumber("0732480911");

		//WHEN
		ac.clickSubmit();
		//THEN
		//ac.customerID();
		System.out.println("Pending ID: " +ac.customerID());
		
		
		
	}

}
