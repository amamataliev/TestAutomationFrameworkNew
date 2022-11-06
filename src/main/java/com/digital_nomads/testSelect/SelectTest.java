package com.digital_nomads.testSelect;

import com.digital_nomads.driverFactory.Driver;
import com.digital_nomads.helperMethods.DropDownHelper;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectTest {

    @Test
    public void test1() {
        Driver.getDriver().get("https://qa.imoving.com/");
        WebElement element = Driver.getDriver().findElement(By.id("houseTypeSelectList"));
        DropDownHelper.selectUsingVisibleText(element, "My Apartment");

    }

    @Test
    public void test2() {
        Driver.getDriver().get("https://qa.imoving.com/");
        // Driver.getDriver().navigate().to("https://qa.imoving.com/");
        WebElement element = Driver.getDriver().findElement(By.id("houseTypeSelectList"));
        DropDownHelper.selectUsingIndex(element, 2);
    }
}

