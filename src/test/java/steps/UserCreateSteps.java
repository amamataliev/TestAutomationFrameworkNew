package steps;

import com.digital_nomads.dataProvider.ConfigReader;
import com.digital_nomads.driverFactory.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.jupiter.api.Assertions;

public class UserCreateSteps extends BaseTest{
    @Given("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("qaEnv"));
    }


    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("user should successfully logged in")
    public void user_should_successfully_logged_in() {
        Assertions.assertEquals("Home", helper.getText(adminHomePage.adminHomeTitle));

    }
    @Given("user should click Add user button in Admin Home page")
    public void user_should_click_add_user_button_in_admin_home_page() {
        adminHomePage.addUserButton.click();
       
     
    }
    @Then("user in field First name write first name")
    public void user_in_field_first_name_write_first_name() {
       addNewUserPage.inputFirstName(mockDataGenerator.generateMockFirstName());
     
    }
    @Then("user in field Last name write last name")
    public void user_in_field_last_name_write_last_name() {
        addNewUserPage.inputLastName(mockDataGenerator.generateMockLastName());
       
     
    }
    @Then("user in field Email address write email address")
    public void user_in_field_email_address_write_email_address() {
        addNewUserPage.inputEmailAddress(mockDataGenerator.generateMockEmail());


    }
    @Then("user in field Username write username")
    public void user_in_field_username_write_username() {
     addNewUserPage.inputUserName(mockDataGenerator.generateMockUsername());
     
    }
    @Then("user in field Password write password")
    public void user_in_field_password_write_password() {
        addNewUserPage.inputPassword(mockDataGenerator.generateMockPassword());
       
     
    }
    @Then("user in field Bio name write bio")
    public void user_in_field_bio_name_write_bio() {
       addNewUserPage.inputBio(mockDataGenerator.generateMockBio());
     
    }

    @When("user click Add user button")
    public void user_click_add_user_button() {
        addNewUserPage.addNewUserButton();
     
    }
    @Then("user should successfully created with correctness data")
    public void user_should_successfully_created_with_correctness_data() {


     
    }

}
