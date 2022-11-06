package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScenarioOutline {

    @Given("^user enter \"([^\"]*)\" in email input field$")
    public void user_enter_in_email_input_field(String string) {

    }

    @And("^user enter \"([^\"]*)\" in password input field$")
    public void user_enter_in_password_input_field(String string) {

    }

    @When("user click on Login button")
    public void user_click_on_login_button() {

    }
    @Then("user should successfully sign in")
    public void user_should_successfully_sign_in() {
    }

}
