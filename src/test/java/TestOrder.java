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

    public TestOrder(String name, String surname, String address, String phone, boolean hasSubway) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.hasSubway = hasSubway;

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
                { "Ви", "Не", "Ленин", "89295567440", true},
                { "Виккккккккккккк", "Нерррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррррр", "Ленинфываппрррррррррррррррррррррррррррррррррррррр", "+79295567440", false},
        };
    }
    @Test
    public void checkOrder(){
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickOrderButton();
        // wait until order page is loaded
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setOrder(name, surname, address, phone, hasSubway);
        Assert.assertEquals("Phone is incorrect", phone, objOrderPage.getPhoneValue());
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
