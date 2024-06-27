package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
    HerokuappContextMenuPage contextMenuPage;
    HerokuappDynamicControlsPage dynamicControlsPage;
    SauceProductPage productPage;
    SauceCartPage cartPage;
    HerokuappInputsPage inputsPage;
    HerokuappFramesPage framesPage;
    HerokuappIFramesPage iFramesPage;
    final String BASE_URL_HEROKUAPP = "http://the-internet.herokuapp.com";
    final String BASE_URL_SAUCEDEMO = "https://www.saucedemo.com/";

    public void openHerokuapp(String url) {
        driver.get(BASE_URL_HEROKUAPP + url);
    }
    public void openSaucedemo() {
        driver.get(BASE_URL_SAUCEDEMO);
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
        contextMenuPage = new HerokuappContextMenuPage(driver);
        dynamicControlsPage = new HerokuappDynamicControlsPage(driver);
        productPage = new SauceProductPage(driver);
        cartPage = new SauceCartPage(driver);
        inputsPage = new HerokuappInputsPage(driver);
        framesPage = new HerokuappFramesPage(driver);
        iFramesPage = new HerokuappIFramesPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        driver.quit();
    }
}