import MainPagePackage.MainPage;
import MainPagePackage.MainPageLocators;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Test;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.is;

public class TestQuestions {
    @Before
    public void setup() {
        Init();
    }
    private WebDriver driver;

    private void Init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickCookieConfirmButton();
    }

    @Test
    public void checkWhatIsPriceQuestion(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickWhatIsPriceQuestion();
        objMainPage.checkWhatIsThePriceText();
    }
    @Test
    public void checkSeveralScootersQuestion(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickSeveralScootersButton();
        objMainPage.checkSeveralScootersText();
    }
    @Test
    public void checkHowIsRentalTimeCalculateQuestion(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickHowIsRentalTimeCalculatedButton();
        objMainPage.checkHowIsRentalTimeCalculatedText();
    }
    @Test
    public void checkOrderScooterTodayQuestion(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickOrderScooterTodayButton();
        objMainPage.checkOrderScooterTodayText();
    }
    @Test
    public void checkExtendOrderQuestion(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickExtendOrderButton();
        objMainPage.checkExtendOrderText();
    }
    @Test
    public void checkChargersWithScooterQuestion(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickChargersWithScooterButton();
        objMainPage.checkChargersWithScooterText();
    }
    @Test
    public void checkCanICancelQuestion(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickCanICancelOrderButton();
        objMainPage.checkCanICancelOrderText();
    }
    @Test
    public void checkLiveOutsideMkadQuestion(){
        Init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickLiveOutsideMkadButton();
        objMainPage.checkLiveOutsideMkadText();
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
