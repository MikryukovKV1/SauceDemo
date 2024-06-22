package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappInputsPage extends BasePage{

    private final By INPUT_NUMBER = By.tagName("input");

    public HerokuappInputsPage(WebDriver driver) {
        super(driver);
    }
}
