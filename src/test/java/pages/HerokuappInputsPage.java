package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HerokuappInputsPage extends BasePage {

    private final By INPUT_NUMBER = By.xpath("//input");

    public HerokuappInputsPage(WebDriver driver) {
        super(driver);
    }

    public String sendKeysUpInput() {
        driver.findElement(INPUT_NUMBER).sendKeys(Keys.ARROW_UP);
        return driver.findElement(INPUT_NUMBER).getAttribute("value");

    }

    public String sendKeysDownInput() {
        driver.findElement(INPUT_NUMBER).sendKeys(Keys.ARROW_DOWN);
        return driver.findElement(INPUT_NUMBER).getAttribute("value");

    }

    public String sendKeysInput(String keys) {
        driver.findElement(INPUT_NUMBER).sendKeys(keys);
        return driver.findElement(INPUT_NUMBER).getAttribute("value");

    }
}
