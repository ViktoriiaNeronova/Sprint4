package MainPagePackage;

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
        WebElement whatIsThePriceButton = driver.findElement(MainPageLocators.Q_1_WHAT_IS_THE_PRICE_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", whatIsThePriceButton);
        assertTrue(whatIsThePriceButton.isEnabled());
        whatIsThePriceButton.click();
    }
    public void checkWhatIsThePriceText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.A_1_WHAT_IS_THE_PRICE_TEXT).isDisplayed()));
        WebElement whatIsThePriceTextElement = driver.findElement(MainPageLocators.A_1_WHAT_IS_THE_PRICE_TEXT);
        String actualText = whatIsThePriceTextElement.getText();
        String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает в вопросе!", expectedText, actualText);
    }
    public void clickSeveralScootersButton(){
        WebElement severalScootersButton = driver.findElement(MainPageLocators.Q_2_SEVERAL_SCOOTERS_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", severalScootersButton);
        assertTrue(severalScootersButton.isEnabled());
        severalScootersButton.click();
    }
    public void checkSeveralScootersText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.A_2_SEVERAL_SCOOTERS_TEXT).isDisplayed()));
        WebElement severalScootersText = driver.findElement(MainPageLocators.A_2_SEVERAL_SCOOTERS_TEXT);
        String actualText = severalScootersText.getText();
        String expectedText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает в вопросе!", expectedText, actualText);
    }

    public void clickHowIsRentalTimeCalculatedButton(){
        WebElement howIsRentalTimeCalculatedButton = driver.findElement(MainPageLocators.Q_3_HOW_IS_RENTAL_TIME_CALCULATED_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", howIsRentalTimeCalculatedButton);
        assertTrue(howIsRentalTimeCalculatedButton.isEnabled());
        howIsRentalTimeCalculatedButton.click();
    }
    public void checkHowIsRentalTimeCalculatedText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.A_3_HOW_IS_RENTAL_TIME_CALCULATED_TEXT).isDisplayed()));
        WebElement howIsRentalTimeCalculatedText = driver.findElement(MainPageLocators.A_3_HOW_IS_RENTAL_TIME_CALCULATED_TEXT);
        String actualText = howIsRentalTimeCalculatedText.getText();
        String expectedText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickOrderScooterTodayButton(){
        WebElement orderScooterTodayButton = driver.findElement(MainPageLocators.Q_4_ORDER_SCOOTER_TODAY_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", orderScooterTodayButton);
        assertTrue(orderScooterTodayButton.isEnabled());
        orderScooterTodayButton.click();
    }
    public void checkOrderScooterTodayText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.A_4_ORDER_SCOOTER_TODAY_TEXT).isDisplayed()));
        WebElement orderScooterTodayText = driver.findElement(MainPageLocators.A_4_ORDER_SCOOTER_TODAY_TEXT);
        String actualText = orderScooterTodayText.getText();
        String expectedText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickExtendOrderButton(){
        WebElement extendOrderButton = driver.findElement(MainPageLocators.Q_5_EXTEND_ORDER_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", extendOrderButton);
        assertTrue(extendOrderButton.isEnabled());
        extendOrderButton.click();
    }
    public void checkExtendOrderText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.A_5_EXTEND_ORDER_TEXT).isDisplayed()));
        WebElement extendOrderText = driver.findElement(MainPageLocators.A_5_EXTEND_ORDER_TEXT);
        String actualText = extendOrderText.getText();
        String expectedText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickChargersWithScooterButton(){
        WebElement chargersWithScooterButton = driver.findElement(MainPageLocators.Q_6_CHARGERS_WITH_SCOOTER_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", chargersWithScooterButton);
        assertTrue(chargersWithScooterButton.isEnabled());
        chargersWithScooterButton.click();
    }
    public void checkChargersWithScooterText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.A_6_CHARGERS_WITH_SCOOTER_TEXT).isDisplayed()));
        WebElement chargersWithScooterText = driver.findElement(MainPageLocators.A_6_CHARGERS_WITH_SCOOTER_TEXT);
        String actualText = chargersWithScooterText.getText();
        String expectedText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickCanICancelOrderButton(){
        WebElement canICancelOrderButton = driver.findElement(MainPageLocators.Q_7_CAN_I_CANCEL_ORDER_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", canICancelOrderButton);
        assertTrue(canICancelOrderButton.isEnabled());
        canICancelOrderButton.click();
    }
    public void checkCanICancelOrderText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.A_7_CAN_I_CANCEL_ORDER_TEXT).isDisplayed()));
        WebElement canICancelOrderText = driver.findElement(MainPageLocators.A_7_CAN_I_CANCEL_ORDER_TEXT);
        String actualText = canICancelOrderText.getText();
        String expectedText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
    }

    public void clickLiveOutsideMkadButton(){
        WebElement liveOutsideMkadButton = driver.findElement(MainPageLocators.Q_8_LIVE_OUTSIDE_MKAD_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", liveOutsideMkadButton);
        assertTrue(liveOutsideMkadButton.isEnabled());
        liveOutsideMkadButton.click();
    }
    public void checkLiveOutsideMkadText() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(MainPageLocators.A_8_LIVE_OUTSIDE_MKAD_TEXT).isDisplayed()));
        WebElement liveOutsideMkadText = driver.findElement(MainPageLocators.A_8_LIVE_OUTSIDE_MKAD_TEXT);
        String actualText = liveOutsideMkadText.getText();
        String expectedText = "Да, обязательно. Всем самокатов! И Москве, и Московской области."; // Укажите здесь ожидаемый текст
        assertEquals("Текст не совпадает вопросе!", expectedText, actualText);
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