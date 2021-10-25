package loans;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PersonalLoan2 {
	@Test
	public void mypersonalRevolvingLoan() {
		System.out.println("Personal Revolving Loan");
		
		String expectedTitle1 = "Personal Increase loan";
		String actualTitle1 = "Personal loan Increase";
		
		Reporter.log("expected ------>"+ expectedTitle1);
		Reporter.log("actual ------>"+ actualTitle1);
		
		Assert.assertEquals(expectedTitle1, actualTitle1);
		
	}

}
