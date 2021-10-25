package loans;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VehicleLoan {
	
	@Test(dataProvider= "getData")
	public void myGetDatatest(String firstname, String lastname) {
		System.out.println("The get Data Array Test");
		System.out.println(firstname +" "+lastname);
		
	}
	
	@Test
	
	public void myCarInsuranceLoan() {
		System.out.println("Car Insurance");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data = new Object [3][2];
		
		//1st set
		data[0][0]="FirstPersonUserName";
		data [0][1]="FirstPersonUserSurname";
		//2nd set
		data [1][0] = "SecondPersonUsername";
		data [1][1] = "SecondPersonSurname";
		//3rd Set
		data [2][0] = "ThirdPersonUsername";
		data [2][1] = "ThirdPersonSurname";
		return data;
		
	}

}
