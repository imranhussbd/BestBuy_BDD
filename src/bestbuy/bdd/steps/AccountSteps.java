 package bestbuy.bdd.steps;

import bestbuy.bdd.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AccountSteps extends BaseClass {

	@Given("user is in HomePage")
	public void user_is_in_home_page() {
		homePage.getTitle();
	   
	}

	@When("user clicks on account")
	public void user_clicks_on_account() {
	   homePage.clickAccount();
	}

	@When("user clicks on create a account")
	public void user_clicks_on_create_a_account() {
	   homePage.clickCreateAcc();
	}

	
}
