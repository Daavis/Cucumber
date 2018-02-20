package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import Base.BaseUtil;
import cucumber.api.java.en.And;

public class SearchSteps extends BaseUtil {
	
	private BaseUtil base;

	public SearchSteps(BaseUtil base) {
		this.base = base;
	}
	
	@Given("^I navigate to google search page$")
	public void navigateToGoogle() throws Throwable {
		System.out.println("Navigating to google search page.");
		base.driver.navigate().to("http://google.pl");
	}

	@Then("^I should see results$")
	public void checkResults() throws Throwable {
		System.out.println("Checking the results.");
	}

	@And("^I enter ([^\\\"]*) in serach input$")
	public void enterWord(String word) throws Throwable {
		System.out.println("Entering "+word+" to google search input.");
		
	}
  
	@And("^I click search button$")
	public void IClickSearchButton() throws Throwable {
		System.out.println("Clicking the search button.");
	}

}
