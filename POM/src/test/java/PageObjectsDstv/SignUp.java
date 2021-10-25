package PageObjectsDstv;

import org.openqa.selenium.By;

import FrameworkClasses.BasePage;

public class SignUp extends BasePage {
	
	public void enterUserEmail(String userNameEmail) {
		EnterText(By.xpath("//input[@name='Email']"),userNameEmail);		
	}
	
	public void enterMobileNumber(String userMobileNumber) {
		EnterText(By.xpath("//input[@name='MobileNumber']"),userMobileNumber);		
	}
	
	public void enterSignupPassword(String userSignupPassword) {
		EnterText(By.xpath("//input[@name='Password']"),userSignupPassword);		
	}
	
	public void clickCreateAccountButton() {
		clickElement(By.xpath("//button[@id='btnSubmit']"));
	}

}

