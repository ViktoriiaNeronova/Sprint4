package MainPagePackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    WebElement whatIsThePriceButton;
    WebElement orderButton;

    WebElement howItWorkOrderButton;

    public MainPage(WebDriver driver){
        this.driver = driver;

        whatIsThePriceButton = driver.findElement(MainPageLocators.q1WhatIsThePriceButton);
        orderButton = driver.findElement(MainPageLocators.orderButton);
        howItWorkOrderButton = driver.findElement(MainPageLocators.howItWorkOrderButton);
    }

    public void clickWhatIsPriceQuestion(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", whatIsThePriceButton);
        whatIsThePriceButton.click();
    }

    public void clickOrderButton(){
        orderButton.click();
    }

    public boolean checkOrderButtonIsEnabled(){
        return orderButton.isEnabled();
    }
    public void clickHowItWorkOrderButton(){
        howItWorkOrderButton.click();
    }

    public boolean checkhowItWorkOrderButtonIsEnabled(){
        return howItWorkOrderButton.isEnabled();
    }
}