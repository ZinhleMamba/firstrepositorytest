package PageObjectsDstv;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import FrameworkClasses.BasePage;

public class LandingPage extends BasePage {
	public void hiworld() {
		System.out.print("Hi Guys");
	
	}
	
	public void clickSignIn() {
		clickElement(By.xpath("//img[@alt='Sign in']"));
		
	}
	
//	public void clickAddCustomer() {
//		clickElement(By.linkText("Add Customer"));
//	}
	
	

}

