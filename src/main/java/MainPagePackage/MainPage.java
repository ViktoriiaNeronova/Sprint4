package MainPagePackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickWhatIsPriceQuestion(){
        WebElement whatIsThePriceButton = driver.findElement(MainPageLocators.q1WhatIsThePriceButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", whatIsThePriceButton);
        whatIsThePriceButton.click();
    }

    public void clickOrderButton(){
        WebElement orderButton = driver.findElement(MainPageLocators.orderButton);
        orderButton.click();
    }

    public boolean checkOrderButtonIsEnabled(){
        WebElement orderButton = driver.findElement(MainPageLocators.orderButton);
        return orderButton.isEnabled();
    }
}