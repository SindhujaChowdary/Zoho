package Background;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Invalid 
{
	@When("User given invalid input")
	public void user_given_invalid_input() {
	    System.out.println("User given inavlid input");
	}
	@Then("Field not should be accept")
	public void field_not_should_be_accept() {
	    System.out.println("Field should not accept");
	}
}
