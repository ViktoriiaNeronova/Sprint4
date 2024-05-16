import MainPagePackage.MainPage;
import OrderPagePackage.OrderPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


@RunWith(Parameterized.class)
public class TestOrder {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final boolean hasSubway;
    private final boolean hasComment;

    public TestOrder(String name, String surname, String address, String phone, boolean hasSubway, boolean hasComment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.hasSubway = hasSubway;
        this.hasComment = hasComment;

        Init();
    }

    private void Init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    // Тестовые данные
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][] {
                { "Ви", "Не", "Ленин", "89295567440", true, true},
                { "Виккккккккккккк", "Нерррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррр", "Ленинфываппрррррррррррррррррррррррррррррррррррррр", "+79295567440", false, false},
        };
    }
    //Проверка создания заказа на самокат, через кнопку 'Заказать' в header сайта
    @Test
    public void checkOrderViaOrderButton(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickOrderButton();
        // wait until order page is loaded
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setOrderForOneDay(name, surname, address, phone, hasSubway, hasComment);
        Assert.assertEquals("Phone is incorrect", phone, objOrderPage.getPhoneValue());
    }
    //Проверка создания заказа на самокат, через кнопку 'Заказать' в теле сайта
    @Test
    public void checkOrderViaHowItWorkOrderButton(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickHowItWorkOrderButton();
        // wait until order page is loaded
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setOrderForSevenDays(name, surname, address, phone, hasSubway, hasComment);
        Assert.assertEquals("Phone is incorrect", phone, objOrderPage.getPhoneValue());
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
