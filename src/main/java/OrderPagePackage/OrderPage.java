package OrderPagePackage;

import OrderPagePackage.OrderPageLocators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
    private WebDriver driver;
    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setOrder(String name, String surname, String address, String phone){
        WebElement whoIsNameInput = driver.findElement(OrderPageLocators.whoIsNameInput);
        whoIsNameInput.sendKeys(name);
        WebElement whoIsSurnameInput = driver.findElement(OrderPageLocators.whoIsSurnameInput);
        whoIsSurnameInput.sendKeys(surname);
        WebElement whoIsAddressInput = driver.findElement(OrderPageLocators.whoIsAddressInput);
        whoIsAddressInput.sendKeys(address);
        WebElement whoIsSubwayInput = driver.findElement(OrderPageLocators.whoIsSubwayInput);
        whoIsSubwayInput.click();
        WebElement whoIsSubwayPicker = driver.findElement(OrderPageLocators.whoIsSubwayPicker);
        whoIsSubwayPicker.click();
        WebElement whoIsPhoneInput = driver.findElement(OrderPageLocators.whoIsPhoneInput);
        whoIsPhoneInput.sendKeys(phone);
    }

    public void clickOrderFurtherButton(){
        WebElement orderFurtherButton = driver.findElement(OrderPageLocators.orderFurtherButton);
        orderFurtherButton.click();
    }

    public String getSubwayValue(){
        WebElement whoIsSubwayInput = driver.findElement(OrderPageLocators.whoIsSubwayInput);
        return whoIsSubwayInput.getAttribute("value");
    }

    public String getPhoneValue(){
        WebElement whoIsPhoneInput = driver.findElement(OrderPageLocators.whoIsPhoneInput);
        return whoIsPhoneInput.getAttribute("value");
    }
}