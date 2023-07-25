package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OutlineDefinition {
	
	@Given("User is on the login screen outline")
	public void user_is_on_the_login_screen_outline() {
		System.out.println("Given");
	}
	@When("user provides correct username outline={string}")
	public void user_provides_correct_username_outline(String username) {
		System.out.println(username);
	}
	@When("user provides correct password outline={string}")
	public void user_provides_correct_password_outline(String password) {
		System.out.println(password);
	}
	@Then("user must login outline")
	public void user_must_login_outline() {
		System.out.println("Then");
	}

}
