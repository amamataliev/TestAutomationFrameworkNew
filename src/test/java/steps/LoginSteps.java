package steps;

import cucumber.api.java.en.Given;

public class LoginSteps extends BaseTest{


    @Given("^Enter \"([^\"]*)\" in username or email input field$")
    public void enter_in_username_or_email_input_field(String usernameOrEmail) {
        loginPage.inputUserNameOrEmail(usernameOrEmail);
    }

    @Given("^Enter \"([^\"]*)\" in password input field$")
    public void enter_in_password_input_field(String password) {
      loginPage.inputPassword(password);
    }
//    @Given("Go to login page")
//    public void go_to_login_page() {
//        Driver.getDriver().get(ConfigReader.getProperty("qaEnv"));
//    }
//    @Given("Enter {string} in username or email input field")
//    public void enter_in_username_or_email_input_field(String usernameOrEmail) {
//        loginPage.inputUserNameOrEmail(usernameOrEmail);
//    }
//    @Given("Enter {string} in password input field")
//    public void enter_in_password_input_field(String password) {
//        loginPage.inputPassword(password);
//    }
//    @When("user click on login button")
//    public void user_click_on_login_button() {
//        loginPage.clickLoginButton();
//    }
//    @Then("user should successfully logged in")
//    public void user_should_successfully_logged_in() {
//        Assertions.assertEquals("Home", helper.getText(adminHomePage.adminHomeTitle));
//
//
//    }


}
