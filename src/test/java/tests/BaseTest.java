package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HerokuappCheckboxesPage;
import pages.HerokuappTyposPage;
import pages.SauceLoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    SauceLoginPage loginPage;
    HerokuappCheckboxesPage checkboxesTest;
    HerokuappTyposPage typosTest;

    public void open(String url) {
        driver.get(url);
    }

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        checkboxesTest = new HerokuappCheckboxesPage(driver);
        loginPage = new SauceLoginPage(driver);
        typosTest = new HerokuappTyposPage(driver);
    }


    @AfterMethod(alwaysRun = true)
    public void close() {
        driver.quit();
    }
}
