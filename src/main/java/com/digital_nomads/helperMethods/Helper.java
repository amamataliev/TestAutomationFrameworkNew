package com.digital_nomads.helperMethods;

import com.digital_nomads.driverFactory.Driver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.html.HTMLEditorKit;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {

    public Helper waitElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public Helper waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public Helper click(WebElement element){
        waitElementToBeClickable(element);
        waitElementToBeDisplayed(element);
        element.click();
        return this;
    }
    public Helper sendKeys(WebElement element, String str){
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }
    public Helper sendKeysWithClear(WebElement element,String str){
        waitElementToBeDisplayed(element);
        element.clear();
        element.sendKeys(str);
        return this;
    }

    public String getText(WebElement element){
        return element.getText();
    }
    public Helper pause(Integer seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }
    public Helper javascriptScrollDownThePage(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,800)");
        return this;
    }
    public Helper jsClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
        return this;
    }
    public Helper clear(WebElement element){
        waitElementToBeDisplayed(element);
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        element.sendKeys(Keys.BACK_SPACE);
        return this;
    }
    public Helper multipleClick(int howManyTimes, WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        for(int i = 0; i < howManyTimes; i++){
            element.click();
            pause(1);
        }
        return this;
    }
}
