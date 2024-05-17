package OrderPagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.Assert.*;

public class OrderPage {
    private WebDriver driver;


    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    // Действия над элементами
    public void setNameValue(String value) {
        WebElement nameInput = driver.findElement(OrderPageLocators.nameInput);
        assertTrue(nameInput.isEnabled());
        nameInput.sendKeys(value);
        assertEquals(value, nameInput.getAttribute("value"));
    }
    public void setSurnameValue(String value) {
        WebElement surnameInput = driver.findElement(OrderPageLocators.surnameInput);
        assertTrue(surnameInput.isEnabled());
        surnameInput.sendKeys(value);
        assertEquals(value, surnameInput.getAttribute("value"));
    }
    public void setAddressValue(String value) {
        WebElement addressInput = driver.findElement(OrderPageLocators.addressInput);
        assertTrue(addressInput.isEnabled());
        addressInput.sendKeys(value);
        assertEquals(value, addressInput.getAttribute("value"));
    }
    public void setPhoneValue(String value) {
        WebElement phoneInput = driver.findElement(OrderPageLocators.phoneInput);
        assertTrue(phoneInput.isEnabled());
        phoneInput.sendKeys(value);
        assertEquals(value, getPhoneValue());
    }
    public String getPhoneValue(){
        WebElement phoneInput = driver.findElement(OrderPageLocators.phoneInput);
        assertTrue(phoneInput.isEnabled());
        return phoneInput.getAttribute("value");
    }
    public void clickSubwayInput(){
        WebElement subwayInput = driver.findElement(OrderPageLocators.subwayInput);
        assertTrue(subwayInput.isEnabled());
        subwayInput.click();
    }
    public void selectSubway(int index){
        // Становится видимым только после клика на subwayInput
        WebElement subwayPicker = driver.findElement(By.xpath(".//li[@class='select-search__row' and @data-index = '" + index + "']"));
        subwayPicker.click();
    }

    public void clickOrderFurtherButton(){
        WebElement orderFurtherButton = driver.findElement(OrderPageLocators.orderFurtherButton);
        assertTrue(orderFurtherButton.isEnabled());
        orderFurtherButton.click();
    }
    public void clickWhenToBringScooterButton(){
        WebElement whenToBringScooterButton = driver.findElement(OrderPageLocators.whenToBringScooterButton);
        assertTrue(whenToBringScooterButton.isEnabled());
        whenToBringScooterButton.click();
    }
    public void selectPickTodayDay(){
        // Становится видимым только после клика на whenToBringScooterButton
        WebElement calendarPickTodayDayButton = driver.findElement(OrderPageLocators.calendarPickTodayDayButton);
        calendarPickTodayDayButton.click();
    }
    public void clickRentalPeriodButton(){
        WebElement rentalPeriodButton = driver.findElement(OrderPageLocators.rentalPeriodButton);
        assertTrue(rentalPeriodButton.isEnabled());
        rentalPeriodButton.click();
    }
    public void selectRentOneDay(){
        // Становится видимым только после клика на rentalPeriodButton
        WebElement rentOneDayButton = driver.findElement(OrderPageLocators.rentOneDayButton);
        rentOneDayButton.click();
    }
    public void selectRentSevenDays(){
        // Становится видимым только после клика на rentalPeriodButton
        WebElement rentSevenDaysButton = driver.findElement(OrderPageLocators.rentSevenDaysButton);
        rentSevenDaysButton.click();
    }

    public void clickColorScooterBlackButton(){
        WebElement colorScooterBlackButton = driver.findElement(OrderPageLocators.colorScooterBlackButton);
        assertTrue(colorScooterBlackButton.isEnabled());
        colorScooterBlackButton.click();
    }

    public void clickColorScooterGreyButton(){
        WebElement colorScooterGreyButton = driver.findElement(OrderPageLocators.colorScooterGreyButton);
        assertTrue(colorScooterGreyButton.isEnabled());
        colorScooterGreyButton.click();
    }
    public void setCommentForCourier(String value) {
        WebElement commentForCourierInput = driver.findElement(OrderPageLocators.commentForCourierInput);
        assertTrue(commentForCourierInput.isEnabled());
        commentForCourierInput.sendKeys(value);
    }

    public void clickCreateOrderButton(){
        WebElement createOrderButton = driver.findElement(OrderPageLocators.createOrderButton);
        assertTrue(createOrderButton.isEnabled());
        createOrderButton.click();
    }

    public void clickConfirmOrderYesButton(){
        WebElement confirmOrderYesButton = driver.findElement(OrderPageLocators.confirmOrderYesButton);
        assertTrue(confirmOrderYesButton.isEnabled());
        confirmOrderYesButton.click();
    }

    // метод ожидания прогрузки окна создания заказа
    public void waitForLoadCompleteOrderModalWindow() {
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(driver -> (driver.findElement(OrderPageLocators.completeOrderModalWindowDisplayed).isEnabled()));
        assertTrue("Окно с сообщением об успешном создании заказа не появилось", driver.findElement(OrderPageLocators.completeOrderModalWindowDisplayed).isEnabled());
    }

    // Наборы действий

    public void setOrderForOneDay(String name, String surname, String address, String phone, int subwayIndex, String comment){
        setNameValue(name);
        setSurnameValue(surname);
        setAddressValue(address);
        clickSubwayInput();
        selectSubway(subwayIndex);
        setPhoneValue(phone);
        clickOrderFurtherButton();
        clickWhenToBringScooterButton();
        selectPickTodayDay();
        clickRentalPeriodButton();
        selectRentOneDay();
        clickColorScooterBlackButton();
        setCommentForCourier(comment);
        clickCreateOrderButton();
        clickConfirmOrderYesButton();
    }

    public void setOrderForSevenDays(String name, String surname, String address, String phone, int subwayIndex, String comment){
        setNameValue(name);
        setSurnameValue(surname);
        setAddressValue(address);
        clickSubwayInput();
        selectSubway(subwayIndex);
        setPhoneValue(phone);
        clickOrderFurtherButton();
        clickWhenToBringScooterButton();
        selectPickTodayDay();
        clickRentalPeriodButton();
        selectRentSevenDays();
        clickColorScooterGreyButton();
        setCommentForCourier(comment);
        clickCreateOrderButton();
        clickConfirmOrderYesButton();
    }

}