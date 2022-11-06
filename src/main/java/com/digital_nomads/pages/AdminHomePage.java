package com.digital_nomads.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage extends BasePage {

    @FindBy(xpath = "//div[@class=\"tl-title tl-ellipsis\"]")
    public WebElement adminHomeTitle;

    @FindBy(xpath = ".//input[@id='472676861']")
    public WebElement Firstname;

    @FindBy(xpath = ".//input[@id='2141365458']")
    public WebElement Lastname;

    @FindBy(xpath = ".//input[@id='195089811']")
    public WebElement emailAddress;

    @FindBy(xpath = ".//input[@id='259332440']")
    public WebElement username;

    @FindBy(xpath = ".//input[@id='638971854']")
    public WebElement password;

    @FindBy(xpath = ".//input[@id='652954478']")
    public WebElement bio;

    @FindBy(xpath = "//a[@href=\"https://digitalsdet.talentlms.com/user/create\"]")
    public WebElement addUserButton;
}
