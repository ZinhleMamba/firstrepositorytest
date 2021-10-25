package TestDstv;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


import PageObjectsDstv.LandingPage;
import PageObjectsDstv.SignIn;
import PageObjectsDstv.SignUp;
import PageObjectDEMOS.TableScraping;
import PageObjectDEMOS.TableValueRetrieval;

public class MovieMagicTests {
	//instantiate Page Objects
	
	LandingPage lp = new LandingPage();
	SignIn sn = new SignIn();
	SignUp su = new SignUp();
	TableScraping ts = new TableScraping();
	TableValueRetrieval tvr = new TableValueRetrieval();
	
	
	
	@Test
	public void GIVEN_NavigationToSigninPage_WHEN_OnlyPasswordEntered_AND_SignInButtonClicked_THEN_Error() {
//		lp.hiworld();
		//GIVEN
			//goHome
			//Click sign in
			lp.clickSignIn();
			//Enter Password
			sn.enterPassword("Testingpwd");
			
		//WHEN
			// Click Sign in Button
			sn.clickSignInButton();
			
			String actual = sn.checkUserNameError();
			String expected = "Email or Mobile number is required";
		//THEN
			Assert.assertEquals(actual, expected);
			tvr.tableDemo();
			//ts.tablesDemo();
		
		
	}
	
//	@Test
//	
//	public void GIVEN_NavigationToSigninPage_WHEN_UserNameOrEmailIsEntered_AND_WrongPasswordIsEntered_AND_SignInButtonClicked_THEN_Error() {
//	//	lp.hiworld();
//				
//		//GIVEN
//		//DstvHome
//		//Click sign in
//		
//		lp.clickSignIn();
//		
//		//User enters username an password
//		sn.enterUserNameOrEmail("nhlemamba1@gmail.com");
//		sn.enterPassword("Testingpwd");
//		//WHEN
//		//Click sign in
//		sn.clickSignInButton();
//		String actualstr = sn.tryAgainIncorrectdetailsError();
//		String expectedstr = "Your details are incorrect, please try again";
//		
//		//THEN 
//		Assert.assertEquals(actualstr, expectedstr);
//		//AND
////		sn.passwordReset();
//		sn.clickSignUpNowlink();
//		//THEN
//		su.enterUserEmail("nhlemamba@gmail.com");
//		su.enterMobileNumber("0839873120");
//		su.enterSignupPassword("Testpwd");
//		su.clickCreateAccountButton();
//	
//		
//		}
	
	
//	@AfterSuite
//	
//	public void cleanup() {
//		lp.cleanup();
//	}
	
	

}
