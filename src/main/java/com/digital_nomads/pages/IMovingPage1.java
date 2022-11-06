package com.digital_nomads.pages;

import com.digital_nomads.helperMethods.AssertHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IMovingPage1 extends BasePage{

    @FindBy(xpath = "//h1[@class='main-title hp-title']")
    private WebElement findMovers;

    public IMovingPage1 findMoverAssert(String str){
        AssertHelper.AssertText(str, findMovers);
        return this;
    }
}
