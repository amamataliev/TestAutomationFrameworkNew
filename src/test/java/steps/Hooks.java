//package steps;
//
//import com.digital_nomads.driverFactory.Driver;
//import cucumber.api.Scenario;
//
//import cucumber.api.java.After;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//public class Hooks {
//
//
//    @After
//    public void tearDown(Scenario scenario){
//        try{
//            if(scenario.isFailed()){
//                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "image/png", "screenshot");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//
//        }
//        Driver.closeDriver();
//    }
//}
