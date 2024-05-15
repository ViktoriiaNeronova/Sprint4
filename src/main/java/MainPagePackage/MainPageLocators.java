package MainPagePackage;

import org.openqa.selenium.By;

public class MainPageLocators {

    public static final By yandexButton = By.xpath(".//a[@href='//yandex.ru']");
    private By scooterButton = By.xpath(".//a[@href='/']");
    public static final By orderButton = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    private By orderStatusButton = By.xpath(".//button[@class='Header_Link__1TAG7']");
    private By howItWorkOrderButton = By.xpath(".//div/div/div/div/div/div/button[text()='Заказать']");
    public static final By q1WhatIsThePriceButton = By.xpath(".//div[text()='Сколько это стоит? И как оплатить?']");
    private By q2SeveralScootersButton = By.xpath(".//div[text()='Хочу сразу несколько самокатов! Так можно?']");
    private By q3HowIsRentalTimeCalculatedButton = By.xpath(".//div[text()='Как рассчитывается время аренды?']");
    private By q4OrderScooterTodayButton = By.xpath(".//div[text()='Можно ли заказать самокат прямо на сегодня?']");
    private By q5ExtendOrderButton = By.xpath(".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");
    private By q6ChargersWithScooterButton = By.xpath(".//div[text()='Вы привозите зарядку вместе с самокатом?']");
    private By q7CanICancelOrderButton = By.xpath(".//div[text()='Можно ли отменить заказ?']");
    private By q8LiveOutsideMkadButton = By.xpath(".//div[text()='Я жизу за МКАДом, привезёте?']");

    private By a1WhatIsThePriceText = By.xpath(".//p[contains(text(), '400')]");
    private By a2SeveralScootersText = By.xpath(".//p[contains(text(), 'один заказ')]");
    private By a3HowIsRentalTimeCalculatedText = By.xpath(".//p[contains(text(), 'заказ на 8 мая')]");
    private By a4OrderScooterTodayText = By.xpath(".//p[contains(text(), 'расторопнее')]");
    private By a5ExtendOrderText = By.xpath(".//p[contains(text(), '1010')]");
    private By a6ChargersWithScooterText = By.xpath(".//p[contains(text(), 'Зарядка')]");
    private By a7CanICancelOrderText = By.xpath(".//p[contains(text(), 'Штрафа')]");
    private By a8LiveOutsideMkadText = By.xpath(".//p[contains(text(), 'И Москве')]");
}