package OrderPagePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageLocators {
    private WebDriver driver;
    private By cookieConfirmButton = By.xpath(".//button[contains(@class, 'App_CookieButton')]");

    public static final By nameInput = By.xpath(".//div[2]/div[1]/input");
    public static final By surnameInput = By.xpath(".//input[@placeholder='* Фамилия']");
    public static final By addressInput = By.xpath(".//input[contains(@placeholder, 'Адрес')]");
    public static final By subwayInput = By.xpath(".//input[contains(@placeholder, 'метро')]");
    public static final By subwayPicker = By.xpath(".//li[@class='select-search__row' and @data-index = '0']");
    public static final By phoneInput = By.xpath(".//input[contains(@placeholder, 'Телефон')]");

    public static final By orderFurtherButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    private By whenToBringScooterButton = By.xpath(".//input[contains(@placeholder, '* Когда привезти самокат')]");
    private By rentalPeriodButton = By.xpath(".//div[contains(text(), '* Срок аренды')]");
    private By colorScooterBlackButton = By.xpath(".//label[@for='black']");
    private By colorScooterGreyButton = By.xpath(".//label[@for='grey']");
    private By commentForCourierButton = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    private By calendarPickTodayDayButton = By.xpath(".//div[contains(@class, 'today')]");

    private By rentOneDayButton = By.xpath(".//div[text()='сутки']");
    private By rentTwoDaysButton = By.xpath(".//div[contains(text(), 'двое')]");
    private By rentThreeDaysButton = By.xpath(".//div[contains(text(), 'трое')]");
    private By rentFourDaysButton = By.xpath(".//div[contains(text(), 'четверо')]");
    private By rentFiveDaysButton = By.xpath(".//div[contains(text(), 'пятеро')]");
    private By rentSixDaysButton = By.xpath(".//div[contains(text(), 'шестеро')]");
    private By rentSevenDaysButton = By.xpath(".//div[contains(text(), 'семеро')]");

    private By createOrderButton = By.xpath(".//button[(text()='Заказать') and contains(@class, 'Button_Middle')]");
    private By confirmOrderYesButton = By.xpath(".//button[text()= 'Да']");
    private By confirmOrderNoButton = By.xpath(".//button[text()= 'Нет']");
    private By backOrderButton = By.xpath(".//button[(text()='Назад') and contains(@class, 'Button_Middle')]");

    private By viewStatusButton = By.xpath(".//button[text()= 'Посмотреть']");
    private By confirm_order_number_text = By.xpath(".//*/div/text()[2]");

    private By compliteOrderModalWindowDisplayed = By.xpath(".//div[contains(@class, 'ModalHeader')]");

}
