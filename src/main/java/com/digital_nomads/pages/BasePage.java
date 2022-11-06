package com.digital_nomads.pages;

import com.digital_nomads.helperMethods.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.digital_nomads.driverFactory.Driver;



public abstract class BasePage {

    protected Helper helper = new Helper();
    protected WebDriver driver= Driver.getDriver();

    public BasePage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
