package MainPagePackage;

import org.openqa.selenium.By;

public class MainPageLocators {

    public static final By cookieConfirmButton = By.xpath( ".//button[contains(@class, 'App_CookieButton')]");
    public static final By yandexButton = By.xpath(".//a[@href='//yandex.ru']");
    public static final By scooterButton = By.xpath(".//a[@href='/']");
    public static final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    public static final By orderStatusButton = By.xpath(".//button[@class='Header_Link__1TAG7']");
    public static final By howItWorkOrderButton = By.xpath(".//div/div/div/div/div/div/button[text()='Заказать']");
    public static final By q1WhatIsThePriceButton = By.xpath(".//div[text()='Сколько это стоит? И как оплатить?']");
    public static final By q2SeveralScootersButton = By.xpath(".//div[text()='Хочу сразу несколько самокатов! Так можно?']");
    public static final By q3HowIsRentalTimeCalculatedButton = By.xpath(".//div[text()='Как рассчитывается время аренды?']");
    public static final By q4OrderScooterTodayButton = By.xpath(".//div[text()='Можно ли заказать самокат прямо на сегодня?']");
    public static final By q5ExtendOrderButton = By.xpath(".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");
    public static final By q6ChargersWithScooterButton = By.xpath(".//div[text()='Вы привозите зарядку вместе с самокатом?']");
    public static final By q7CanICancelOrderButton = By.xpath(".//div[text()='Можно ли отменить заказ?']");
    public static final By q8LiveOutsideMkadButton = By.xpath(".//div[text()='Я жизу за МКАДом, привезёте?']");

    public static final By a1WhatIsThePriceText = By.xpath(".//p[contains(text(), '400')]");
    public static final By a2SeveralScootersText = By.xpath(".//p[contains(text(), 'один заказ')]");
    public static final By a3HowIsRentalTimeCalculatedText = By.xpath(".//p[contains(text(), 'заказ на 8 мая')]");
    public static final By a4OrderScooterTodayText = By.xpath(".//p[contains(text(), 'расторопнее')]");
    public static final By a5ExtendOrderText = By.xpath(".//p[contains(text(), '1010')]");
    public static final By a6ChargersWithScooterText = By.xpath(".//p[contains(text(), 'Зарядка')]");
    public static final By a7CanICancelOrderText = By.xpath(".//p[contains(text(), 'Штрафа')]");
    public static final By a8LiveOutsideMkadText = By.xpath(".//p[contains(text(), 'И Москве')]");
}