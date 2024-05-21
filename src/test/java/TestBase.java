import MainPagePackage.MainPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestBase {
    protected WebDriver driver;

    @Before
    public void setup() {

    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
