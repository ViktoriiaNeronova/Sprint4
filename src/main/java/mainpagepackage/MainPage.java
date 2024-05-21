package mainpagepackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickQuestionButton(By buttonLocator){
        WebElement button = driver.findElement(buttonLocator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", button);
        assertTrue(button.isEnabled());
        button.click();
    }

    public void checkAnswerText(By labelLocator, String expectedText){
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(labelLocator).isDisplayed()));
        WebElement label = driver.findElement(labelLocator);
        String actualText = label.getText();
        assertEquals("Текст не совпадает в вопросе!", expectedText, actualText);
    }

    public void clickCookieConfirmButton(){
        WebElement cookieConfirmButton = driver.findElement(MainPageLocators.COOKIE_CONFIRM_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cookieConfirmButton);
        cookieConfirmButton.click();
    }

    public void clickOrderButton(){
        WebElement orderButton = driver.findElement(MainPageLocators.ORDER_BUTTON);
        Assert.assertTrue(checkOrderButtonIsEnabled());
        orderButton.click();
    }

    public boolean checkOrderButtonIsEnabled(){
        WebElement orderButton = driver.findElement(MainPageLocators.ORDER_BUTTON);
        return orderButton.isEnabled();
    }
    public void clickHowItWorkOrderButton(){
        WebElement howItWorkOrderButton = driver.findElement(MainPageLocators.HOW_IT_WORK_ORDER_BUTTON);
        Assert.assertTrue(checkhowItWorkOrderButtonIsEnabled());
        howItWorkOrderButton.click();
    }

    public boolean checkhowItWorkOrderButtonIsEnabled(){
        WebElement howItWorkOrderButton = driver.findElement(MainPageLocators.HOW_IT_WORK_ORDER_BUTTON);
        return howItWorkOrderButton.isEnabled();
    }
}