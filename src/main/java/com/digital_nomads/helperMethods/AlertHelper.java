package com.digital_nomads.helperMethods;


import com.digital_nomads.driverFactory.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver;

    public AlertHelper(WebDriver driver){
        this.driver = driver;
    }
    public Alert getAlert(){
        return driver.switchTo().alert();
    }
    public void acceptAlert(){
        getAlert().accept();
    }
    public void dismissAlert(){
        getAlert().dismiss();
    }
    public boolean isAlertPresent(){
        try{
            WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
            webDriverWait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (NoAlertPresentException e){
            return false;
        }
    }

    public void acceptPrompt(String txt){
        if (!isAlertPresent())
            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.accept();
    }
}
