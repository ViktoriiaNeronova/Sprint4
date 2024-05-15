package OrderPagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
    private WebDriver driver;

    WebElement nameInput;
    WebElement surnameInput;
    WebElement addressInput;
    WebElement subwayInput;
    WebElement subwayPicker;
    WebElement phoneInput;
    WebElement orderFurtherButton;

    public OrderPage(WebDriver driver){
        this.driver = driver;

        nameInput = driver.findElement(OrderPageLocators.nameInput);
        surnameInput = driver.findElement(OrderPageLocators.surnameInput);
        addressInput = driver.findElement(OrderPageLocators.addressInput);
        subwayInput = driver.findElement(OrderPageLocators.subwayInput);
        phoneInput = driver.findElement(OrderPageLocators.phoneInput);

        orderFurtherButton = driver.findElement(OrderPageLocators.orderFurtherButton);
    }

    // Действия над элементами
    public void setNameValue(String value) {
        nameInput.sendKeys(value);
    }
    public void setSurnameValue(String value) {
        surnameInput.sendKeys(value);
    }
    public void setAddressValue(String value) {
        addressInput.sendKeys(value);
    }
    public void setPhoneValue(String value) {
        phoneInput.sendKeys(value);
    }
    public String getPhoneValue(){
        return phoneInput.getAttribute("value");
    }
    public void clickSubwayInput(){
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
        orderFurtherButton.click();
    }

    // Наборы действий

    public void setOrder(String name, String surname, String address, String phone, boolean hasSubway){
        setNameValue(name);
        setSurnameValue(surname);
        setAddressValue(address);
        if (hasSubway) {
            clickSubwayInput();
            selectFirstSubway();
        }
        setPhoneValue(phone);
    }
}