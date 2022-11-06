package com.digital_nomads.pages;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPage extends BasePage {

    @FindBy(xpath = ".//input[@id='472676861']")
    private WebElement firstNameInputField;

    @FindBy(xpath = ".//input[@id='2141365458']")
    private WebElement lastNameInputField;

    @FindBy(xpath = ".//input[@id='195089811']")
    private WebElement emailInputfield;

    @FindBy(xpath = ".//input[@id='259332440']")
    private WebElement usernameInputField;

    @FindBy(xpath = ".//input[@id='638971854']")
    private WebElement passwordInputField;

    @FindBy(xpath = ".//input[@id='652954478']")
    private WebElement bioInputField;

    @FindBy(xpath = ".//input[@id='1625352382']")
    private WebElement addUserButton;

    @FindBy(xpath = ".//div[@class='tl-box tl-box-border ']")
    private WebElement addUserAssert;

    public AddNewUserPage inputFirstName(String firstName) {
        helper.sendKeys(firstNameInputField, firstName);
        return this;
    }

    public AddNewUserPage inputLastName(String lastName) {
        helper.sendKeysWithClear(lastNameInputField, lastName);
        return this;
    }

    public AddNewUserPage inputEmailAddress(String email) {
        helper.sendKeysWithClear(emailInputfield, email);
        return this;
    }

    public AddNewUserPage inputUserName(String username) {
        helper.sendKeysWithClear(usernameInputField, username);
        return this;
    }
    public AddNewUserPage inputPassword(String password) {
        helper.sendKeysWithClear(passwordInputField, password);
        return this;
    }
    public AddNewUserPage inputBio(String bio){
        helper.sendKeysWithClear(bioInputField,bio);
        return this;
    }
    public AddNewUserPage addNewUserButton(){
        helper.click(addUserButton);
            return this;
        }
    }



