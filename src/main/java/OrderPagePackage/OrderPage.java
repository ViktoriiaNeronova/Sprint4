package OrderPagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.hamcrest.MatcherAssert;
import static org.junit.Assert.*;

public class OrderPage {
    private WebDriver driver;

    WebElement nameInput;
    WebElement surnameInput;
    WebElement addressInput;
    WebElement subwayInput;
    WebElement subwayPicker;
    WebElement phoneInput;
    WebElement orderFurtherButton;
    WebElement whenToBringScooterButton;
    WebElement calendarPickTodayDayButton;
    WebElement rentalPeriodButton;
    WebElement colorScooterBlackButton;
    WebElement colorScooterGreyButton;
    WebElement commentForCourierInput;
    WebElement rentOneDayButton;
    WebElement rentSevenDaysButton;
    WebElement createOrderButton;
    WebElement confirmOrderYesButton;

    public OrderPage(WebDriver driver){
        this.driver = driver;

        nameInput = driver.findElement(OrderPageLocators.nameInput);
        surnameInput = driver.findElement(OrderPageLocators.surnameInput);
        addressInput = driver.findElement(OrderPageLocators.addressInput);
        subwayInput = driver.findElement(OrderPageLocators.subwayInput);
        phoneInput = driver.findElement(OrderPageLocators.phoneInput);

        orderFurtherButton = driver.findElement(OrderPageLocators.orderFurtherButton);

        whenToBringScooterButton = driver.findElement(OrderPageLocators.whenToBringScooterButton);
        rentalPeriodButton = driver.findElement(OrderPageLocators.rentalPeriodButton);
        colorScooterBlackButton = driver.findElement(OrderPageLocators.colorScooterBlackButton);
        colorScooterGreyButton = driver.findElement(OrderPageLocators.colorScooterGreyButton);
        commentForCourierInput = driver.findElement(OrderPageLocators.commentForCourierInput);
        createOrderButton = driver.findElement(OrderPageLocators.createOrderButton);
        confirmOrderYesButton = driver.findElement(OrderPageLocators.confirmOrderYesButton);
    }

    // Действия над элементами
    public void setNameValue(String value) {
        assertTrue(nameInput.isEnabled());
        nameInput.sendKeys(value);
    }
    public void setSurnameValue(String value) {
        assertTrue(surnameInput.isEnabled());
        surnameInput.sendKeys(value);
    }
    public void setAddressValue(String value) {
        assertTrue(addressInput.isEnabled());
        addressInput.sendKeys(value);
    }
    public void setPhoneValue(String value) {
        assertTrue(phoneInput.isEnabled());
        phoneInput.sendKeys(value);
    }
    public String getPhoneValue(){
        assertTrue(phoneInput.isEnabled());
        return phoneInput.getAttribute("value");
    }
    public void clickSubwayInput(){
        assertTrue(subwayInput.isEnabled());
        subwayInput.click();
    }
    public void selectFirstSubway(){
        // Становится видимым только после клика на subwayInput
        subwayPicker = driver.findElement(OrderPageLocators.subwayPicker);
        subwayPicker.click();
    }
    public String getSubwayValue(){
        return subwayInput.getAttribute("value");
    }

    public void clickOrderFurtherButton(){
        assertTrue(orderFurtherButton.isEnabled());
        orderFurtherButton.click();
    }
    public void clickWhenToBringScooterButton(){
        assertTrue(whenToBringScooterButton.isEnabled());
        whenToBringScooterButton.click();
    }
    public void selectPickTodayDay(){
        // Становится видимым только после клика на whenToBringScooterButton
        calendarPickTodayDayButton = driver.findElement(OrderPageLocators.calendarPickTodayDayButton);
        calendarPickTodayDayButton.click();
    }
    public void clickRentalPeriodButton(){
        assertTrue(rentalPeriodButton.isEnabled());
        rentalPeriodButton.click();
    }
    public void selectRentOneDay(){
        // Становится видимым только после клика на rentalPeriodButton
        rentOneDayButton = driver.findElement(OrderPageLocators.rentOneDayButton);
        rentOneDayButton.click();
    }
    public void selectRentSevenDays(){
        // Становится видимым только после клика на rentalPeriodButton
        rentSevenDaysButton = driver.findElement(OrderPageLocators.rentSevenDaysButton);
        rentSevenDaysButton.click();
    }

    public void clickColorScooterBlackButton(){
        assertTrue(colorScooterBlackButton.isEnabled());
        colorScooterBlackButton.click();
    }

    public void clickColorScooterGreyButton(){
        assertTrue(colorScooterGreyButton.isEnabled());
        colorScooterGreyButton.click();
    }
    public void setCommentForCourier(String value) {
        assertTrue(commentForCourierInput.isEnabled());
        commentForCourierInput.sendKeys(value);
    }

    // Наборы действий

    public void setOrderForOneDay(String name, String surname, String address, String phone, boolean hasSubway, boolean hasComment){
        setNameValue(name);
        setSurnameValue(surname);
        setAddressValue(address);
        if (hasSubway) {
            clickSubwayInput();
            selectFirstSubway();
        }
        setPhoneValue(phone);
        clickOrderFurtherButton();
        clickWhenToBringScooterButton();
        selectPickTodayDay();
        clickRentalPeriodButton();
        selectRentOneDay();
        clickColorScooterBlackButton();
        if (hasComment) {
            setCommentForCourier(hasComment);
        }
    }

    public void setOrderForSevenDays(String name, String surname, String address, String phone, boolean hasSubway, boolean hasComment){
        setNameValue(name);
        setSurnameValue(surname);
        setAddressValue(address);
        if (hasSubway) {
            clickSubwayInput();
            selectFirstSubway();
        }
        setPhoneValue(phone);
        clickOrderFurtherButton();
        clickWhenToBringScooterButton();
        selectPickTodayDay();
        clickRentalPeriodButton();
        selectRentSevenDays();
        clickColorScooterGreyButton();
        if (hasComment) {
            setCommentForCourier(hasComment);
        }
    }

}