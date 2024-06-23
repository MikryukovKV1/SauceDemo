package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    SauceLoginPage loginPage;
    HerokuappCheckboxesPage checkboxesPage;
    HerokuappTyposPage typosPage;
    HerokuappTablesPage tablesPage;
    HerokuappHoversPage hoversPage;
    HerokuappHoversProfilePage hoversProfilePage;
    HerokuappNotificationMessagePage notificationMessagePage;

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
        checkboxesPage = new HerokuappCheckboxesPage(driver);
        loginPage = new SauceLoginPage(driver);
        typosPage = new HerokuappTyposPage(driver);
        tablesPage = new HerokuappTablesPage(driver);
        hoversPage = new HerokuappHoversPage(driver);
        hoversProfilePage = new HerokuappHoversProfilePage(driver);
        notificationMessagePage = new HerokuappNotificationMessagePage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        driver.quit();
    }
}
