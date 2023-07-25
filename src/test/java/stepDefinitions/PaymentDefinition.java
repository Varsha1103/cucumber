package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PaymentDefinition {
	@Given("User already has an account on gpay")
	public void user_already_has_an_account_on_gpay() {
	    System.out.println("Payment given");
	}
	@When("userid is correct")
	public void userid_is_correct() {
		 System.out.println("Payment when");
	
	}
	@Then("gpay message should be sent")
	public void gpay_message_should_be_sent() {
		 System.out.println("Payment then");
	  
	}
	

}
