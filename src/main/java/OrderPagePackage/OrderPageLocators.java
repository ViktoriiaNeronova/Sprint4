package OrderPagePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageLocators {
    private WebDriver driver;
    public static final By cookieConfirmButton = By.xpath(".//button[contains(@class, 'App_CookieButton')]");

    public static final By nameInput = By.xpath(".//div[2]/div[1]/input");
    public static final By surnameInput = By.xpath(".//input[@placeholder='* Фамилия']");
    public static final By addressInput = By.xpath(".//input[contains(@placeholder, 'Адрес')]");
    public static final By subwayInput = By.xpath(".//input[contains(@placeholder, 'метро')]");
    public static final By phoneInput = By.xpath(".//input[contains(@placeholder, 'Телефон')]");

    public static final By orderFurtherButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public static final By whenToBringScooterButton = By.xpath(".//input[contains(@placeholder, '* Когда привезти самокат')]");
    public static final By rentalPeriodButton = By.xpath(".//div[contains(text(), '* Срок аренды')]");
    public static final By colorScooterBlackButton = By.xpath(".//label[@for='black']");
    public static final By colorScooterGreyButton = By.xpath(".//label[@for='grey']");
    public static final By commentForCourierInput = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    public static final By calendarPickTodayDayButton = By.xpath(".//div[contains(@class, 'today')]");

    public static final By rentOneDayButton = By.xpath(".//div[text()='сутки']");
    public static final By rentTwoDaysButton = By.xpath(".//div[contains(text(), 'двое')]");
    public static final By rentThreeDaysButton = By.xpath(".//div[contains(text(), 'трое')]");
    public static final By rentFourDaysButton = By.xpath(".//div[contains(text(), 'четверо')]");
    public static final By rentFiveDaysButton = By.xpath(".//div[contains(text(), 'пятеро')]");
    public static final By rentSixDaysButton = By.xpath(".//div[contains(text(), 'шестеро')]");
    public static final By rentSevenDaysButton = By.xpath(".//div[contains(text(), 'семеро')]");

    public static final By createOrderButton = By.xpath(".//button[(text()='Заказать') and contains(@class, 'Button_Middle')]");
    public static final By confirmOrderYesButton = By.xpath(".//button[text()= 'Да']");
    public static final By confirmOrderNoButton = By.xpath(".//button[text()= 'Нет']");
    public static final By backOrderButton = By.xpath(".//button[(text()='Назад') and contains(@class, 'Button_Middle')]");

    public static final By viewStatusButton = By.xpath(".//button[text()= 'Посмотреть']");
    public static final By confirm_order_number_text = By.xpath(".//*/div/text()[2]");

    public static final By completeOrderModalWindowDisplayed = By.xpath(".//div[contains(@class, 'ModalHeader')]");

}
