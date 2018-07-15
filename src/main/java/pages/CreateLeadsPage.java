package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class CreateLeadsPage extends WebDriverServiceImpl{

	public CreateLeadsPage() {
		/*this.driver = driver;
		this.test =test;*/
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompName;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;

	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;

	@FindBy(className="smallSubmit")
	WebElement eleCreateLeadButton;

	@And("type company name as (.*)")
	public CreateLeadsPage typeCompanyName(String cName) {		
		type(eleCompName,cName);
		return this;
	}
	
	@And("type first name as (.*)")
	public CreateLeadsPage typeFirstName(String fName) {
		type(eleFirstName,fName);
		return this;
	}
	
	@And("type last name as (.*)")
	public CreateLeadsPage typeLastName(String lName) {
		
		type(eleLastName,lName);
		return this;
	}
	
	@When("click on create lead button")
	public CreateLeadsPage clickCreateLead() {
		
		click(eleCreateLeadButton);
		return new CreateLeadsPage();
	}
	
	@When("New Lead will be added")
	public CreateLeadsPage addedNewLead() {
		
		System.out.println("New lead has been added");
		return new CreateLeadsPage();
	}
	
	}
	

