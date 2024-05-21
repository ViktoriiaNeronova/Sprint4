package MainPagePackage;

import org.openqa.selenium.By;

public class MainPageLocators {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    public static final By COOKIE_CONFIRM_BUTTON = By.xpath( ".//button[contains(@class, 'App_CookieButton')]");
    public static final By YANDEX_BUTTON = By.xpath(".//a[@href='//yandex.ru']");
    public static final By SCOOTER_BUTTON = By.xpath(".//a[@href='/']");
    public static final By ORDER_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    public static final By ORDER_STATUS_BUTTON = By.xpath(".//button[@class='Header_Link__1TAG7']");
    public static final By HOW_IT_WORK_ORDER_BUTTON = By.xpath(".//div/div/div/div/div/div/button[text()='Заказать']");
    public static final By Q_1_WHAT_IS_THE_PRICE_BUTTON = By.xpath(".//div[text()='Сколько это стоит? И как оплатить?']");
    public static final By Q_2_SEVERAL_SCOOTERS_BUTTON = By.xpath(".//div[text()='Хочу сразу несколько самокатов! Так можно?']");
    public static final By Q_3_HOW_IS_RENTAL_TIME_CALCULATED_BUTTON = By.xpath(".//div[text()='Как рассчитывается время аренды?']");
    public static final By Q_4_ORDER_SCOOTER_TODAY_BUTTON = By.xpath(".//div[text()='Можно ли заказать самокат прямо на сегодня?']");
    public static final By Q_5_EXTEND_ORDER_BUTTON = By.xpath(".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");
    public static final By Q_6_CHARGERS_WITH_SCOOTER_BUTTON = By.xpath(".//div[text()='Вы привозите зарядку вместе с самокатом?']");
    public static final By Q_7_CAN_I_CANCEL_ORDER_BUTTON = By.xpath(".//div[text()='Можно ли отменить заказ?']");
    public static final By Q_8_LIVE_OUTSIDE_MKAD_BUTTON = By.xpath(".//div[text()='Я жизу за МКАДом, привезёте?']");

    public static final By A_1_WHAT_IS_THE_PRICE_TEXT = By.xpath(".//p[contains(text(), '400')]");
    public static final By A_2_SEVERAL_SCOOTERS_TEXT = By.xpath(".//p[contains(text(), 'один заказ')]");
    public static final By A_3_HOW_IS_RENTAL_TIME_CALCULATED_TEXT = By.xpath(".//p[contains(text(), 'заказ на 8 мая')]");
    public static final By A_4_ORDER_SCOOTER_TODAY_TEXT = By.xpath(".//p[contains(text(), 'расторопнее')]");
    public static final By A_5_EXTEND_ORDER_TEXT = By.xpath(".//p[contains(text(), '1010')]");
    public static final By A_6_CHARGERS_WITH_SCOOTER_TEXT = By.xpath(".//p[contains(text(), 'Зарядка')]");
    public static final By A_7_CAN_I_CANCEL_ORDER_TEXT = By.xpath(".//p[contains(text(), 'Штрафа')]");
    public static final By A_8_LIVE_OUTSIDE_MKAD_TEXT = By.xpath(".//p[contains(text(), 'И Москве')]");
}