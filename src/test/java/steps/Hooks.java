package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lib.selenium.WebDriverServiceImpl;

public class Hooks extends WebDriverServiceImpl{
	
	@Before
	public void beforeScenario(Scenario sc) {
		/*System.out.println(sc.getName());
		System.out.println(sc.getId());*/
		startReport();
		startTestCase(sc.getName(), sc.getId());
		startTestModule("Leads");
		test.assignAuthor("AbiDharan");
		test.assignCategory("Sanity");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		type(locateElement("id", "username"), "DemoSalesManager");	
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
	}
	@After
	public void afterScenario(Scenario sc) {
		closeActiveBrowser();
		endResult();
		System.out.println(sc.getStatus());
		boolean status=sc.isFailed();
		if(status)
			System.out.println("Test case failed");
		else
			System.out.println("Test case passed");
	}
}
