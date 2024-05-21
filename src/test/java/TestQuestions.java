import MainPagePackage.MainPage;
import MainPagePackage.MainPageLocators;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

@RunWith(Parameterized.class)
public class TestQuestions extends TestBase {
    private final By buttonLocator;
    private final By labelLocator;
    private final String expectedText;

    public TestQuestions(By buttonLocator, By labelLocator, String expectedText) {
        this.buttonLocator = buttonLocator;
        this.labelLocator = labelLocator;
        this.expectedText = expectedText;

        init();
    }

    private void init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // переход на страницу тестового приложения
        driver.get(MainPageLocators.URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickCookieConfirmButton();
    }
    // Тестовые данные
    @Parameterized.Parameters
    public static Object[][] getParams() {
        return new Object[][] {
                { MainPageLocators.Q_1_WHAT_IS_THE_PRICE_BUTTON, MainPageLocators.A_1_WHAT_IS_THE_PRICE_TEXT, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                { MainPageLocators.Q_2_SEVERAL_SCOOTERS_BUTTON, MainPageLocators.A_2_SEVERAL_SCOOTERS_TEXT, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                { MainPageLocators.Q_3_HOW_IS_RENTAL_TIME_CALCULATED_BUTTON, MainPageLocators.A_3_HOW_IS_RENTAL_TIME_CALCULATED_TEXT, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                { MainPageLocators.Q_4_ORDER_SCOOTER_TODAY_BUTTON, MainPageLocators.A_4_ORDER_SCOOTER_TODAY_TEXT, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                { MainPageLocators.Q_5_EXTEND_ORDER_BUTTON, MainPageLocators.A_5_EXTEND_ORDER_TEXT, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                { MainPageLocators.Q_6_CHARGERS_WITH_SCOOTER_BUTTON, MainPageLocators.A_6_CHARGERS_WITH_SCOOTER_TEXT, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                { MainPageLocators.Q_7_CAN_I_CANCEL_ORDER_BUTTON, MainPageLocators.A_7_CAN_I_CANCEL_ORDER_TEXT, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                { MainPageLocators.Q_8_LIVE_OUTSIDE_MKAD_BUTTON, MainPageLocators.A_8_LIVE_OUTSIDE_MKAD_TEXT, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }

    @Test
    public void checkQuestion(){
        init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickQuestionButton(buttonLocator);
        objMainPage.checkAnswerText(labelLocator, expectedText);
    }
}
