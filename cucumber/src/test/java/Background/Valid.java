package Background;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Valid 
{
	@Before
	public void beforeTest() {
		System.out.println("Beforetest");
	}

	@After
	public void afterTest() {
		System.out.println("Aftertest");
	}

	@Given("Open Browser")
	public void open_browser() {
		System.out.println("Open Browser");
	}


    @And("enter url")
    public void enter_url() {
    System.out.println("Enter URL");
}
   @When("User given valid input")
   public void user_given_valid_input() {
    System.out.println("User Enter Valid Input");
}
   @Then("Field should be accept")
    public void field_should_be_accept() {
    System.out.println("Feild Should Accept");
}
}
