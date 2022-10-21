package bestbuy.bdd.steps;

import bestbuy.bdd.base.BaseClass;
import io.cucumber.java.en.Then;

public class CreateAccountSteps extends BaseClass{

	
	@Then("user will be in Page Title Create a Account")
	public void user_will_be_in_page_title_create_a_account() {
	  createAccount.getTitle("Best Buy: Create an Account");
	}
	
	@Then("user will be in Page {string} Create a Account")
	public void user_will_be_in_page_create_a_account(String string) {
	   createAccount.getTitle(string);
	}
	@Then("user input {string} in first name")
	public void user_input_in_first_name(String string) {
	  createAccount.inputFirstName(string);
	}
	@Then("user input {string} in last name")
	public void user_input_in_last_name(String string) {
	   createAccount.inputLastName(string);
	}
	@Then("user input {string} in email")
	public void user_input_in_email(String string) {
	   createAccount.inputEmail(string);
	}
	@Then("user input {string} in password")
	public void user_input_in_password(String string) {
	   createAccount.inputPassword(string);
	}
	@Then("user input {string} in confirm password")
	public void user_input_in_confirm_password(String string) {
	   createAccount.reputPassword(string);
	}
	@Then("user will see password {string} text")
	public void user_will_see_password_text(String string) {
	   createAccount.getPasswordMatchText(string);
	}
	@Then("user input {int} in phone number")
	public void user_input_in_phone_number(Integer int1) {
	 createAccount.inputPhoneNum(int1.toString());
	}
	
	
}
