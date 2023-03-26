package onliner.selenium.tests;

import onliner.selenium.utils.WebDriverRunner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    public static WebDriver driver;
    private static ChromeOptions chromeOptions = new ChromeOptions();


    @BeforeEach
    public void openOnliner() {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac64/chromedriver");
        driver = WebDriverRunner.getDriver();
        driver.get("https://onliner.by");
//        driver.manage().window().maximize();
    }

    @AfterAll
    public static void cleanUp() {

        driver.close();
    }
}
