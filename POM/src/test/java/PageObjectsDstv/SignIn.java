package PageObjectsDstv;

import org.openqa.selenium.By;

import FrameworkClasses.BasePage;

public class SignIn extends BasePage {
	
	public void enterUserNameOrEmail(String userNameOrEmail) {
		EnterText(By.xpath("//input[@name='EmailOrMobileNumber']"),userNameOrEmail);		
	}
	
	public void enterPassword(String moviePassword) {
		EnterText(By.xpath("//input[@class='password']"),moviePassword);		
	}
	
	public void clickSignInButton() {
		clickElement(By.xpath("//button[@id='btnSubmit']"));
	}
	public String checkUserNameError() {
		return getElementText(By.xpath("//span[@id='EmailOrMobileNumber-error']"));
	}
	
	public String tryAgainIncorrectdetailsError() {
		return getElementText(By.xpath("//p[@class='error_msg global']"));
	}
	
	public void passwordReset() {
		clickElement(By.xpath("//a[@id='lknPasswordReset']"));
	}
	
	public void clickSignUpNowlink() {
		clickElement(By.linkText("Sign Up Now"));		
	}

}

