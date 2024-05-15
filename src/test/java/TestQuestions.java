import MainPagePackage.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class TestQuestions {
    private WebDriver driver;

    private void Init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkHowItCostQuestion(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        boolean isEnabled = objMainPage.checkOrderButtonIsEnabled();
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
