package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import lib.selenium.WebDriverServiceImpl;

public class MyLeads extends WebDriverServiceImpl{

	public MyLeads(/*EventFiringWebDriver driver, ExtentTest test*/) {
/*		this.driver = driver;
		this.test =test;
*/		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLead;
	
	@FindBy(xpath="(//div[@class='x-panel-header']/a)[2]")
	WebElement eleLeads;
	
	@Given("click Leads tab")
	public MyLeads clickLeadsTab() {
		click(eleLeads);			
			return this;
	}
	
	@And("click createLead link")
	public CreateLeadsPage clickCreateLeads() {
		click(eleCreateLead);
		return new CreateLeadsPage();
	}
	
	public FindLeadsPage clickFindLeads() {
			click(eleFindLead);
		
		return new FindLeadsPage(driver,test);
	}
}
