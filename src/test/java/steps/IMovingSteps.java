package steps;

import com.digital_nomads.driverFactory.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class IMovingSteps extends BaseTest{

    @Given("^User is on the \"([^\"]*)\"$")
    public void user_is_on_the(String string)  {
     Driver.getDriver().get(string);
    }
    @Given("user is on confirmation page")
    public void user_is_on_confirmation_page() {
        iMovingPage1.findMoverAssert("Find Movers");

      
      
    }
    @Given("User should navigate to moving journey button")
    public void user_should_navigate_to_moving_journey_button() {
      
      
    }
    @Given("User clicks on moving journey button")
    public void user_clicks_on_moving_journey_button() {
      
      
    }
    @Then("pick up address should appear underneath")
    public void pick_up_address_should_appear_underneath() {
      
      
    }


    
   
    @Then("User clicks show on map button")
    public void user_clicks_show_on_map_button() {
      
      
    }
    @Then("Map should appear underneath")
    public void map_should_appear_underneath() {
      
      
    }


    

    @Given("User should navigate to addresses restrictions button")
    public void user_should_navigate_to_addresses_restrictions_button() {
      
      
    }
    @Given("User clicks on addresses restrictions button")
    public void user_clicks_on_addresses_restrictions_button() {
      
      
    }
    @Then("Information chart should appear underneath")
    public void information_chart_should_appear_underneath() {
      
      
    }


  

   
    @Given("User should navigate to inventory items button")
    public void user_should_navigate_to_inventory_items_button() {
      
      
    }
    @Given("User clicks on inventory items button")
    public void user_clicks_on_inventory_items_button() {
      
      
    }


}
