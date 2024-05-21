package OrderPagePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageLocators {
    private WebDriver driver;

    public static final By NAME_INPUT = By.xpath(".//div[2]/div[1]/input");
    public static final By SURNAME_INPUT = By.xpath(".//input[@placeholder='* Фамилия']");
    public static final By ADDRESS_INPUT = By.xpath(".//input[contains(@placeholder, 'Адрес')]");
    public static final By SUBWAY_INPUT = By.xpath(".//input[contains(@placeholder, 'метро')]");
    public static final By PHONE_INPUT = By.xpath(".//input[contains(@placeholder, 'Телефон')]");

    public static final By ORDER_FURTHER_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public static final By WHEN_TO_BRING_SCOOTER_BUTTON = By.xpath(".//input[contains(@placeholder, '* Когда привезти самокат')]");
    public static final By RENTAL_PERIOD_BUTTON = By.xpath(".//div[contains(text(), '* Срок аренды')]");
    public static final By COLOR_SCOOTER_BLACK_BUTTON = By.xpath(".//label[@for='black']");
    public static final By COLOR_SCOOTER_GREY_BUTTON = By.xpath(".//label[@for='grey']");
    public static final By COMMENT_FOR_COURIER_INPUT = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    public static final By CALENDAR_PICK_TODAY_DAY_BUTTON = By.xpath(".//div[contains(@class, 'today')]");

    public static final By RENT_ONE_DAY_BUTTON = By.xpath(".//div[text()='сутки']");
    public static final By RENT_TWO_DAYS_BUTTON = By.xpath(".//div[contains(text(), 'двое')]");
    public static final By RENT_THREE_DAYS_BUTTON = By.xpath(".//div[contains(text(), 'трое')]");
    public static final By RENT_FOUR_DAYS_BUTTON = By.xpath(".//div[contains(text(), 'четверо')]");
    public static final By RENT_FIVE_DAYS_BUTTON = By.xpath(".//div[contains(text(), 'пятеро')]");
    public static final By RENT_SIX_DAYS_BUTTON = By.xpath(".//div[contains(text(), 'шестеро')]");
    public static final By RENT_SEVEN_DAYS_BUTTON = By.xpath(".//div[contains(text(), 'семеро')]");

    public static final By CREATE_ORDER_BUTTON = By.xpath(".//button[(text()='Заказать') and contains(@class, 'Button_Middle')]");
    public static final By CONFIRM_ORDER_YES_BUTTON = By.xpath(".//button[text()= 'Да']");
    public static final By CONFIRM_ORDER_NO_BUTTON = By.xpath(".//button[text()= 'Нет']");
    public static final By BACK_ORDER_BUTTON = By.xpath(".//button[(text()='Назад') and contains(@class, 'Button_Middle')]");

    public static final By VIEW_STATUS_BUTTON = By.xpath(".//button[text()= 'Посмотреть']");

    public static final By COMPLETE_ORDER_MODAL_WINDOW_DISPLAYED = By.xpath(".//div[contains(@class, 'ModalHeader')]");

}
