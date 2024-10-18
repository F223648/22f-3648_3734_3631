package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Navigating to login page...");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        System.out.println("Entering valid credentials...");
    }

    @Then("I should be redirected to the homepage")
    public void i_should_be_redirected_to_the_homepage() {
        System.out.println("Logged in successfully.");
    }
}
