package steps;

import com.digital_nomads.pojo.FBLoginPojo;

import cucumber.api.java.en.Given;


import java.util.List;

public class TestPojo  {
    @Given("user is on FB page")
    public void user_is_on_fb_page() {
        System.out.println("Hello");

    }
    @Given("enter following info")
    public void enter_following_info(List<FBLoginPojo> fbLoginPojos) {
        System.out.println(fbLoginPojos.get(3).getEmailOrPhoneNumber());


    }
}
