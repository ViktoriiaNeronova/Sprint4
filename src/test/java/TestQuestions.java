import MainPagePackage.MainPage;
import MainPagePackage.MainPageLocators;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestQuestions extends TestBase {

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
    @Test
    public void checkWhatIsPriceQuestion(){
        init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickWhatIsPriceQuestion();
        objMainPage.checkWhatIsThePriceText();
    }
    @Test
    public void checkSeveralScootersQuestion(){
        init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickSeveralScootersButton();
        objMainPage.checkSeveralScootersText();
    }
    @Test
    public void checkHowIsRentalTimeCalculateQuestion(){
        init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickHowIsRentalTimeCalculatedButton();
        objMainPage.checkHowIsRentalTimeCalculatedText();
    }
    @Test
    public void checkOrderScooterTodayQuestion(){
        init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickOrderScooterTodayButton();
        objMainPage.checkOrderScooterTodayText();
    }
    @Test
    public void checkExtendOrderQuestion(){
        init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickExtendOrderButton();
        objMainPage.checkExtendOrderText();
    }
    @Test
    public void checkChargersWithScooterQuestion(){
        init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickChargersWithScooterButton();
        objMainPage.checkChargersWithScooterText();
    }
    @Test
    public void checkCanICancelQuestion(){
        init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickCanICancelOrderButton();
        objMainPage.checkCanICancelOrderText();
    }
    @Test
    public void checkLiveOutsideMkadQuestion(){
        init();
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickLiveOutsideMkadButton();
        objMainPage.checkLiveOutsideMkadText();
    }
}
