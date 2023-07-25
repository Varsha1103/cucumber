package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookDefinition {
	@Before("@smokeTest")
	public void beforeFeature()
	{
		System.out.println("Before scenario");
	}
	@After("@smokeTest")
	public void afterFeature()
	{
		System.out.println("After scenario");
	}

	@Given("example of given one")
	public void example_of_given_one() {
		System.out.println("Given one");
	    
	}
	@When("example of when one")
	public void example_of_when_one() {
		System.out.println("When one");
	}
	@Then("example of then one")
	public void example_of_then_one() {
		System.out.println("Then one");
	}
}
