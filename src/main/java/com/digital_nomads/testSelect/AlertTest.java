package com.digital_nomads.testSelect;

import com.digital_nomads.driverFactory.Driver;
import com.digital_nomads.helperMethods.AlertHelper;
import com.digital_nomads.helperMethods.Helper;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertTest {

    @Test
    public void test1() {
        Driver.getDriver().get("https://demoqa.com/alerts");
        Helper helper = new Helper();
        WebElement demoQA = Driver.getDriver().findElement(By.xpath("//button[@id='alertButton']"));
        helper.click(demoQA);
        AlertHelper alertHelper = new AlertHelper(Driver.getDriver());
        alertHelper.acceptAlert();
        WebElement timerAlertButton = Driver.getDriver().findElement(By.xpath("//button[@id='timerAlertButton']"));
        timerAlertButton.click();
        //  helper.pause(5);
        alertHelper.isAlertPresent();
        alertHelper.acceptAlert();

        WebElement confirmButton = Driver.getDriver().findElement(By.xpath("//button[@id='confirmButton']"));
        confirmButton.click();
        alertHelper.dismissAlert();

        WebElement promtButton = Driver.getDriver().findElement(By.xpath("//button[@id='promtButton']"));
        promtButton.click();
        alertHelper.acceptPrompt("Aibek");
    }

}
