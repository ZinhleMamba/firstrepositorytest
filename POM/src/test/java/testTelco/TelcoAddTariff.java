package testTelco;

import org.testng.Assert;
import org.testng.annotations.Test;

import FrameworkClasses.BasePage;
import pageObjectsTelcoProject.AddCustomer;
import pageObjectsTelcoProject.AddTariffPlantoCustomer;


public class TelcoAddTariff extends TelcoAddCusstomer{
	BasePage bp = new BasePage();
	AddTariffPlantoCustomer atp = new AddTariffPlantoCustomer();
	AddCustomer ac = new AddCustomer();
	
	@Test
	
	public void GIVEN_AddingTariffpage_WHEN_ActiveCustomerNumberIsUsed_THEN_ActiveIsDisplayed() {
		//GIVEN
		atp.goToHomePage1();
		atp.clickAddTariffPlan();
		//WHEN
		//String custID = ac.customerID();
		
		//atp.enterCustomerID(custID);
		atp.enterCustomerID("167007");
		atp.clickSubmit1();
		//THEN
		String Actualstatus = atp.activeMessageDisplay();
		String Expectedstatus = "ACTIVE";
		Assert.assertEquals(Actualstatus, Expectedstatus);
		
	}
	@Test
	
	public void GIVEN_AddingTariffpage_WHEN_InActiveCustomerNumberIsUsed_THEN_InActiveIsDisplayed() {
		//GIVEN
		atp.goToHomePage1();
		//atp.clickAddTariffPlan();
		//WHEN
		ac.clickAddCustomer();
		ac.clickRadioPending();
		//user's information is entered
		ac.enterFirstName("Zie");
		ac.enterLastName("Zekethe");
		ac.enterEmail("medunsa@gmail.com");
		//a correct address is entered
		ac.enterAddress("190 exte 45661 was");
		ac.enterMobileNumber("0732480911");
		ac.clickSubmit();
		
		String custID1 = ac.customerID();
		atp.goToHomePage1();
		//atp.enterCustomerID(custID);
		atp.clickAddTariffPlan();
		atp.enterCustomerID(custID1);
		atp.clickSubmit1();
		System.out.println("Pending ID: " +custID1);
		//THEN
		String Actualstat = atp.inActiveMessageDisplay();
		String Expectedstat = "INACTIVE";
		Assert.assertEquals(Actualstat, Expectedstat);
		
	}
	
	@Test
	
	public void GIVEN_ActiveCustomerNumberIsUsed_WHEN_SubmitIsClicked_THEN_AtleastOneTariffPlanIsDisplayed() {
		//GIVEN
		atp.goToHomePage1();
		//atp.clickAddTariffPlan();
		//WHEN
		
		ac.clickAddCustomer();
		ac.clickRadioDone();
		//user's information is entered
		ac.enterFirstName("Zee");
		ac.enterLastName("Zekethelo");
		ac.enterEmail("meddiaa@gmail.com");
		//a correct address is entered
		ac.enterAddress("123 exte 45661 wewtw");
		ac.enterMobileNumber("0732480988");
		ac.clickSubmit();
		
		//WHEN
		String custID2 = ac.customerID();
		System.out.println("The Done's ID: "+ custID2);
		atp.goToHomePage1();
		atp.clickAddTariffPlan();
			
		
		//atp.enterCustomerID(custID);
		atp.enterCustomerID(custID2);
		atp.clickSubmit1();
		//THEN
		String Actualtariff = atp.tariffPlanDisplay();
		String Expectedtariff = "Select Tariff Plans";
		Assert.assertEquals(Actualtariff, Expectedtariff);
		
	}
	@Test
	
	public void GIVEN_AtleastOneTariffPlanIsSelected_WHEN_AddTariffIsClicked_THEN_SuccessMessageIsDisplayed() {
		//GIVEN
		atp.goToHomePage1();
		//atp.clickAddTariffPlan();
		//WHEN

		ac.clickAddCustomer();
		ac.clickRadioDone();
		//user's information is entered
		ac.enterFirstName("Last Test");
		ac.enterLastName("Zekethelo");
		ac.enterEmail("median@gmail.com");
		//a correct address is entered
		ac.enterAddress("123 exte 45661 wewtw");
		ac.enterMobileNumber("0732480900");
		ac.clickSubmit();
		
		//WHEN
		String custID3 = ac.customerID();
		System.out.println("The Done's last ID: "+ custID3);
		atp.goToHomePage1();
		atp.clickAddTariffPlan();
			
		atp.enterCustomerID(custID3);
		atp.clickSubmit1();
		//atp.enterCustomerID("274009");
		//atp.clickSubmit1();
		atp.checkLabel();
		atp.selectTariffPlan();
		//THEN
		String Actualmessage = atp.successMessageDisplay();
		String Expectedmessage = "Congratulation Tariff Plan assigned";
		Assert.assertEquals(Actualmessage, Expectedmessage);
		
	}
	

}

