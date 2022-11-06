package com.digital_nomads.testSelect;

import com.digital_nomads.driverFactory.Driver;
import com.digital_nomads.pages.AdminHomePage;
import com.digital_nomads.pages.IMovingPage;

import org.junit.jupiter.api.Test;

public class iMovingTest extends AdminHomePage {

    IMovingPage iMovingPage = new IMovingPage();
    @Test
    public void testIMoving(){
        Driver.getDriver().get("https://www.imoving.com/");
        iMovingPage.compareClick(1,2,4)
                .clickAddInvertory();



    }
}
