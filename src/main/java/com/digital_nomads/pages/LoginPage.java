package com.digital_nomads.pages;

import com.digital_nomads.dataProvider.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    private AddNewUserPage addNewUserPage = new AddNewUserPage();
    @FindBy(xpath = "//input[@name='login']")
    public WebElement userNameOrEmailInput;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameOrEmailInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement loginButton;


    public LoginPage inputUserNameOrEmail(String usernameOrEmail){
        helper.sendKeys(usernameOrEmailInput,usernameOrEmail);
        return this;
    }

    public LoginPage inputPassword(String password){
        helper.sendKeys(passwordInput,password);
        return this;
    }

    public LoginPage clickLoginButton(){
        helper.click(loginButton);
        return this;
    }
    public LoginPage addUserAssert(String str){
//        Assert.assertEquals(str,addUserAssert("Add user").getText().substring(15));
        return this;
    }
    public AddNewUserPage login(String url) {
        driver.get(url);
        inputUserNameOrEmail(ConfigReader.getProperty("username"))
                .inputPassword(ConfigReader.getProperty("password"))
                .clickLoginButton();
        return addNewUserPage;
    }
}
