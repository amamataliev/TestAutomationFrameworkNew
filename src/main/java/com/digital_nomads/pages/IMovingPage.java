package com.digital_nomads.pages;

import com.digital_nomads.helperMethods.AssertHelper;
import com.digital_nomads.helperMethods.DropDownHelper;
import com.digital_nomads.helperMethods.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IMovingPage extends AdminHomePage{

    @FindBy(xpath = "//select[@id='houseTypeSelectList']")
    public WebElement whatAreYouMoving;

    @FindBy(id = "hp-nav-select-house")
    public WebElement moveSize;

    @FindBy(xpath = "(//button[@class='btn btn-white quickQuoteLink'])[1]")
    public WebElement compareQuoresButton;

    @FindBy(xpath = "(//span[@class='quantity-plus'])[1]")
    public WebElement plus1;

    @FindBy (xpath = "//span[@class='col-sm-9 col-xs-12']")
    public WebElement continueButton;

    @FindBy(xpath = "(//a[@class='btn btn-blue'])[1]")
    public WebElement gotItButton;

    @FindBy(xpath = "//a[@id='closeTutorial']")
    public WebElement okButton;

    @FindBy(xpath = "(.//a[@class='btn btn-blue'])[1]")
    public WebElement addInventoryButton;

    @FindBy(xpath = "(.//a[@class='btn btn-blue'])[10]")
    public WebElement addLampButton;

    public IMovingPage clickAddInvertory(){
        helper.click(continueButton).click(gotItButton)
                .click(okButton);
        helper.click(addInventoryButton);
        helper.pause(3);
        helper.jsClick(addLampButton);
        helper.pause(3);
        helper.click(strelka);

        AssertHelper.AssertText("2 items",twoItems);
        return this;

    }
    @FindBy(xpath = "(//div[@class='arrowOpenRightNavigation leftArrowNavi'])[2]")
    public WebElement strelka;

    @FindBy(xpath = "//span[@class='room-counter withItems']")
    public WebElement twoItems;




    Helper helper = new Helper();

    public IMovingPage compareClick(int whatAreYouMovingSelectIndex, int moveSizeIndex, int HowManyClicks){
        DropDownHelper.selectUsingIndex(whatAreYouMoving,whatAreYouMovingSelectIndex);
        DropDownHelper.selectUsingIndex(moveSize,moveSizeIndex);
        compareQuoresButton.click();
        helper.multipleClick(HowManyClicks,plus1);
        return this;

    }

}
