package MainPagePackage;

import OrderPagePackage.OrderPageLocators;
import org.junit.Assert;
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

    public void clickWhatIsPriceQuestion(){
        WebElement whatIsThePriceButton = driver.findElement(MainPageLocators.q1WhatIsThePriceButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", whatIsThePriceButton);
        assertTrue(whatIsThePriceButton.isEnabled());
        whatIsThePriceButton.click();
    }
    public void checkWhatIsThePriceText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.a1WhatIsThePriceText).isDisplayed()));
        WebElement whatIsThePriceTextElement = driver.findElement(MainPageLocators.a1WhatIsThePriceText);
        String actualText = whatIsThePriceTextElement.getText();
        String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает в вопросе!", expectedText, actualText);
    }
    public void clickSeveralScootersButton(){
        WebElement SeveralScootersButton = driver.findElement(MainPageLocators.q2SeveralScootersButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", SeveralScootersButton);
        assertTrue(SeveralScootersButton.isEnabled());
        SeveralScootersButton.click();
    }
    public void checkSeveralScootersText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.a2SeveralScootersText).isDisplayed()));
        WebElement SeveralScootersText = driver.findElement(MainPageLocators.a2SeveralScootersText);
        String actualText = SeveralScootersText.getText();
        String expectedText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает в вопросе!", expectedText, actualText);
    }

    public void clickHowIsRentalTimeCalculatedButton(){
        WebElement HowIsRentalTimeCalculatedButton = driver.findElement(MainPageLocators.q3HowIsRentalTimeCalculatedButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", HowIsRentalTimeCalculatedButton);
        assertTrue(HowIsRentalTimeCalculatedButton.isEnabled());
        HowIsRentalTimeCalculatedButton.click();
    }
    public void checkHowIsRentalTimeCalculatedText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.a3HowIsRentalTimeCalculatedText).isDisplayed()));
        WebElement HowIsRentalTimeCalculatedText = driver.findElement(MainPageLocators.a3HowIsRentalTimeCalculatedText);
        String actualText = HowIsRentalTimeCalculatedText.getText();
        String expectedText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickOrderScooterTodayButton(){
        WebElement OrderScooterTodayButton = driver.findElement(MainPageLocators.q4OrderScooterTodayButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", OrderScooterTodayButton);
        assertTrue(OrderScooterTodayButton.isEnabled());
        OrderScooterTodayButton.click();
    }
    public void checkOrderScooterTodayText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.a4OrderScooterTodayText).isDisplayed()));
        WebElement OrderScooterTodayText = driver.findElement(MainPageLocators.a4OrderScooterTodayText);
        String actualText = OrderScooterTodayText.getText();
        String expectedText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickExtendOrderButton(){
        WebElement ExtendOrderButton = driver.findElement(MainPageLocators.q5ExtendOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ExtendOrderButton);
        assertTrue(ExtendOrderButton.isEnabled());
        ExtendOrderButton.click();
    }
    public void checkExtendOrderText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.a5ExtendOrderText).isDisplayed()));
        WebElement ExtendOrderText = driver.findElement(MainPageLocators.a5ExtendOrderText);
        String actualText = ExtendOrderText.getText();
        String expectedText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickChargersWithScooterButton(){
        WebElement ChargersWithScooterButton = driver.findElement(MainPageLocators.q6ChargersWithScooterButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ChargersWithScooterButton);
        assertTrue(ChargersWithScooterButton.isEnabled());
        ChargersWithScooterButton.click();
    }
    public void checkChargersWithScooterText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.a6ChargersWithScooterText).isDisplayed()));
        WebElement ChargersWithScooterText = driver.findElement(MainPageLocators.a6ChargersWithScooterText);
        String actualText = ChargersWithScooterText.getText();
        String expectedText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickCanICancelOrderButton(){
        WebElement CanICancelOrderButton = driver.findElement(MainPageLocators.q7CanICancelOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", CanICancelOrderButton);
        assertTrue(CanICancelOrderButton.isEnabled());
        CanICancelOrderButton.click();
    }
    public void checkCanICancelOrderText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.a7CanICancelOrderText).isDisplayed()));
        WebElement CanICancelOrderText = driver.findElement(MainPageLocators.a7CanICancelOrderText);
        String actualText = CanICancelOrderText.getText();
        String expectedText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickLiveOutsideMkadButton(){
        WebElement LiveOutsideMkadButton = driver.findElement(MainPageLocators.q8LiveOutsideMkadButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", LiveOutsideMkadButton);
        assertTrue(LiveOutsideMkadButton.isEnabled());
        LiveOutsideMkadButton.click();
    }
    public void checkLiveOutsideMkadText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.a8LiveOutsideMkadText).isDisplayed()));
        WebElement LiveOutsideMkadText = driver.findElement(MainPageLocators.a8LiveOutsideMkadText);
        String actualText = LiveOutsideMkadText.getText();
        String expectedText = "Да, обязательно. Всем самокатов! И Москве, и Московской области."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickCookieConfirmButton(){
        WebElement cookieConfirmButton = driver.findElement(MainPageLocators.cookieConfirmButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cookieConfirmButton);
        cookieConfirmButton.click();
    }

    public void clickOrderButton(){
        WebElement orderButton = driver.findElement(MainPageLocators.orderButton);
        Assert.assertTrue(checkOrderButtonIsEnabled());
        orderButton.click();
    }

    public boolean checkOrderButtonIsEnabled(){
        WebElement orderButton = driver.findElement(MainPageLocators.orderButton);
        return orderButton.isEnabled();
    }
    public void clickHowItWorkOrderButton(){
        WebElement howItWorkOrderButton = driver.findElement(MainPageLocators.howItWorkOrderButton);
        Assert.assertTrue(checkhowItWorkOrderButtonIsEnabled());
        howItWorkOrderButton.click();
    }

    public boolean checkhowItWorkOrderButtonIsEnabled(){
        WebElement howItWorkOrderButton = driver.findElement(MainPageLocators.howItWorkOrderButton);
        return howItWorkOrderButton.isEnabled();
    }
}