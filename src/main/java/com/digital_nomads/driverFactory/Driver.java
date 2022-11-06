package com.digital_nomads.driverFactory;

import com.digital_nomads.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

 private Driver(){
     // Singleton pattern

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null)
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.laodFirefoxDriver();
                    break;
                case "safari":
                    driver = SafariWebDriver.loadSafariDriver();
                    break;
                default:
                    driver = EdgeWebDriver.loadEdgeDriver();

            }
        return driver;
    }
    public static void closeDriver(){
        try{
            if(driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
