package pageObjectsTelcoProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import FrameworkClasses.BasePage;

public class AddCustomer extends BasePage{
	public void goToHomePage() {
		driver.get("http://demo.guru99.com/telecom/index.html");
	}
	
	public void clickAddCustomer() {
		clickElement(By.linkText("Add Customer"));
	}
	public String assertGuru99Heading() {
		return getElementText(By.linkText("Guru99 telecom"));
	}
	
	public String assertAddCustomerHeading() {
		return getElementText(By.xpath("//h1[contains(text(),'Add Customer')]"));
	}
	
	public void clickRadioDone() {
		clickElement(By.xpath("//label[@for='done']"));
	}
	
	public void clickRadioPending() {
		clickElement(By.xpath("//label[@for='pending']"));
	}
	public void enterFirstName(String userFName) {
		EnterText(By.xpath("//input[@id='fname']"),userFName);		
	}
	
	public void enterLastName(String userLName) {
		EnterText(By.xpath("//input[@id='lname']"),userLName);		
	}
	
	public void enterEmail(String userEmail) {
		EnterText(By.xpath("//input[@id='email']"),userEmail);		
	}
	
	public void enterAddress(String userAddress) {
		EnterText(By.xpath("//textarea[@id='message']"),userAddress);		
	}
	
	public void enterMobileNumber(String userMobileNumber) {
		EnterText(By.xpath("//input[@id='telephoneno']"),userMobileNumber);		
	}
	
	public void clickSubmit() {
		clickElement(By.xpath("//input[@name='submit']"));
	}
	
	public String specailCharsErrorMessage() {
		return getElementText(By.xpath("//label[@id='message3']"));
	}
	
	public String customerID() {
		String custID= getElementText(By.tagName("h3"));
		 return custID;
	}
//	public String capturedID() {
//		String myID = customerID();
//		return myID;
//		
//	}
	//create  method or a pop up n close it
	
	
		public String getAlertText() {
			Alert alert = driver.switchTo().alert();
			
			String 	alertmessage = driver.switchTo().alert().getText();
			
			return alertmessage;
			
		}
		
		public void closeAlertText() {
		Alert alert = driver.switchTo().alert();	
			alert.accept();
				
		}


}

