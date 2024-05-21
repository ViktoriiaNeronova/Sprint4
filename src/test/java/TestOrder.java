import mainpagepackage.MainPage;
import mainpagepackage.MainPageLocators;
import orderpagepackage.OrderPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


@RunWith(Parameterized.class)
public class TestOrder extends TestBase {
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final int subwayIndex;
    private final String comment;

    public TestOrder(String name, String surname, String address, String phone, int subwayIndex, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.subwayIndex = subwayIndex;
        this.comment = comment;

        init();
    }

    private void init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // переход на страницу тестового приложения
        driver.get(MainPageLocators.URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    // Тестовые данные
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][] {
                { "Ви", "Не", "Ленин", "89295567440", 0, "1"},
                { "Виккккккккккккк", "Нерррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррр", "Ленинфываппрррррррррррррррррррррррррррррррррррррр", "+79295567440", 1, "Код подъезда 340#"},
        };
    }
    //Проверка создания заказа на самокат, через кнопку 'Заказать' в header сайта
    @Test
    public void checkOrderViaOrderButton(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickOrderButton();
        objMainPage.clickCookieConfirmButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setOrderForOneDay(name, surname, address, phone, subwayIndex, comment);
        objOrderPage.waitForLoadCompleteOrderModalWindow();
    }
    //Проверка создания заказа на самокат, через кнопку 'Заказать' в теле сайта
    @Test
    public void checkOrderViaHowItWorkOrderButton(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickCookieConfirmButton();
        objMainPage.clickHowItWorkOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setOrderForSevenDays(name, surname, address, phone, subwayIndex, comment);
        objOrderPage.waitForLoadCompleteOrderModalWindow();
    }
}
