package steps;


import com.digital_nomads.dataProvider.ConfigReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class AddNewUser extends BaseTest {
    @Given("user on web")
    public void user_on_web() {
        loginPage.login(ConfigReader.getProperty("qaEnv"));
    }

    @When("user click on add User button")
    public void user_click_on_add_user_button() {
        addNewUserPage.addNewUserButton();
    }




//    @Given("user on web")
//    public void user_on_web() {
//        loginPage.login(ConfigReader.getProperty("qaEnv"));
//    }

    @Then("user should see home page")
    public void user_should_see_home_page() {
    }

//    @Then("user clicked Add user button to create new user")
//    public void user_clicked_add_user_button_to_create_new_user() {
//        loginPage.goToAddNewUserPage();
//    }

    @Then("user should see input fields")
    public void user_should_see_input_fields() {
    }

//    @Then("user create new user with mock data using faker")
//    public void user_create_new_user_with_mock_data_using_faker() {
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.youtube.com/watch?v=n-jVNxIhY6M&t=38s");
//        for (int i = 0; i < 100; i++) {
//            addNewUserPage.inputFirstName(MockDataGenerator.generateMockFirstName())
//                    .inputLastName(MockDataGenerator.generateMockLastName())
//                    .inputPassword(MockDataGenerator.generateMockPassword())
//                    .inputUserName(MockDataGenerator.generateMockUserName())
//                    .inputEmailAddress(MockDataGenerator.generateMockEmail())
//                    .inputBio(MockDataGenerator.generateMockBio());
//        }
//    }
}
