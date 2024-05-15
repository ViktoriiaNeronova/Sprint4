import MainPagePackage.MainPage;
import OrderPagePackage.OrderPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestOrder {
    private WebDriver driver;

    private void Init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkOrder(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickOrderButton();
        // wait until order page is loaded
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setOrder("Вика", "Неронова", "Тестовый адрес", "7928123456");
        Assert.assertEquals("Phone is incorrect", "7928123456", objOrderPage.getPhoneValue());
        Assert.assertEquals("Subway is incorrect", "Бульвар Рокоссовского", objOrderPage.getSubwayValue());
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
