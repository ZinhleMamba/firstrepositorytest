package loans;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Homeloan2 {
	@Test
	
	public void myHouseInfrastructureLoan() {
		System.out.println("House Infrastructure");
		
	}
	@Test
	
	public void myHouseInstallmentfraud() {
		System.out.println("Fraud installment");
		
	}
	@Test(enabled=false)
	
	public void myHousefraudLoan() {
		System.out.println("House Fraud Loan");
		
	}
	@Parameters({"URL"})
	@Test
	
	
	public void callmyURL(String URL) {
		System.out.println("The URL parameter is "+URL);
	}
	@Test
	
	public void myHousefraudulent() {
		System.out.println("House Fraududulent");
		
	}
	@Test(enabled=true)
	
	public void myHousePropertyLoan() {
		System.out.println("House Property");
		
	}
	@BeforeSuite
	
	public void GlobalVariables() {
		System.out.println("Set our globals here before we start");
		
	}





}
