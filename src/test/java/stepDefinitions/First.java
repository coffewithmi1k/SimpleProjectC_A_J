package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class First {

    @Given("^I typed this$")
    public void i_typed_this() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is given step");
    }

    @When("^I had typed that$")
    public void i_had_typed_that() throws Throwable {
        System.out.println("This is when step");
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I got this$")
    public void i_got_this() throws Throwable {
        System.out.println("This is then step");
    }
}
