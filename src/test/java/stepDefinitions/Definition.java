package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definition {

	@Given("User is on the login screen")
	public void user_is_on_the_login_screen() {
		System.out.println("**GIVEN**");
	   
	}
	@When("user provides correct username")
	public void user_provides_correct_username(io.cucumber.datatable.DataTable data) {
		List<String>table=data.asList();
		System.out.println(table.get(0));
	}
	@When("user provides correct username=")
	public void user_provides_correct_username_user(DataTable user) {
		System.out.println("**WHEN PART 1**"+user);
	    
	}
	@When("user provides correct password=")
	public void user_provides_correct_password_pass(DataTable pass) {
		System.out.println("**WHEN PART 2**"+pass);
	}
	
	@Then("User  must login")
	public void user_must_login() {
		 System.out.println("**LOGIN**");
	}

	
	@Then("error should not be there")
	public void error_should_not_be_there() {
		int num=5/0;
	    System.out.println("**BUT**");
	}    



}
