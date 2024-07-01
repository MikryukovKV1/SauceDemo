package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.PropertyReader;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    SauceLoginPage loginPage;
    SauceProductPage productPage;
    SauceCartPage cartPage;
    private final static String BASE_URL = "https://www.saucedemo.com/";
    String userName;
    String password;

    @Step("Открытие в браузере saucedemo.com")
    public void openSaucedemo() {
        driver.get(BASE_URL);
    }

    @BeforeMethod(description = "Запуск браузера")
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new SauceLoginPage(driver);
        productPage = new SauceProductPage(driver);
        cartPage = new SauceCartPage(driver);
        userName = PropertyReader.getProperty("saucedemo.user");
        password = PropertyReader.getProperty("saucedemo.password");
    }


    @AfterMethod(alwaysRun = true, description = "Закрытие браузера")
    public void close() {
        driver.quit();
    }
}