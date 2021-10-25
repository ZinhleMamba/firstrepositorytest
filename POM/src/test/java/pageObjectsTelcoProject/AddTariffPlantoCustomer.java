package pageObjectsTelcoProject;

import org.openqa.selenium.By;

import FrameworkClasses.BasePage;

public class AddTariffPlantoCustomer extends BasePage {
	public void goToHomePage1() {
		driver.get("http://demo.guru99.com/telecom/index.html");
	}
		public void clickAddTariffPlan() {
			clickElement(By.linkText("Add Tariff Plan to Customer"));
	}
	
	public String assertGuru99Heading1() {
		return getElementText(By.linkText("Guru99 telecom"));
	}
	
	public String assertAddTariffPlanHeading() {
		return getElementText(By.xpath("//h1[contains(text(),'Add Tariff Plan to Customer')]"));
	}
	
	public void clickRadioDone1() {
		clickElement(By.xpath("//label[@for='done']"));
	}
	
	public void enterCustomerID(String custID) {
		EnterText(By.xpath("//input[@id='customer_id']"),custID);		
	}
	
	public void clickSubmit1() {
		clickElement(By.xpath("//input[@name='submit']"));
	}
	
	public String activeMessageDisplay() {
		return getElementText(By.xpath("//font[contains(text(),'ACTIVE')]"));
	}
	public String inActiveMessageDisplay() {
		return getElementText(By.xpath("//font[contains(text(),'INACTIVE')]"));
	}
	public String tariffPlanDisplay() {
		return getElementText(By.xpath("//b[contains(text(),'Select Tariff Plans')]"));
	}
	public void checkLabel() {
		clickElement(By.xpath("//tbody/tr[1]/td[1]"));
	}
	
	public void selectTariffPlan() {
		clickElement(By.xpath("//input[@name='submit']"));
	}
	public String successMessageDisplay() {
		return getElementText(By.xpath("//h2[contains(text(),'Congratulation Tariff Plan assigned')]"));
	
	}

}

