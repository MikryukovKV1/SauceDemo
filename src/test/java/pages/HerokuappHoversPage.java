package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HerokuappHoversPage extends BasePage {

    private final By LINK_NAME_1 = By.xpath("//a[@href='/users/1']");
    private final By LINK_NAME_2 = By.xpath("//a[@href='/users/2']");
    private final By LINK_NAME_3 = By.xpath("//a[@href='/users/3']");
    private final By NAME_1 = By.xpath("//*[text()='name: user1']");
    private final By NAME_2 = By.xpath("//*[text()='name: user2']");
    private final By NAME_3 = By.xpath("//*[text()='name: user3']");
    private final By PROFILE_1 = By.xpath("//*[text()='name: user1']/ancestor::div[@class='figure']");
    private final By PROFILE_2 = By.xpath("//*[text()='name: user2']/ancestor::div[@class='figure']");
    private final By PROFILE_3 = By.xpath("//*[text()='name: user3']/ancestor::div[@class='figure']");
    Actions actions = new Actions(driver);

    public HerokuappHoversPage(WebDriver driver) {
        super(driver);
    }

    public void hoveringProfile_1() {
        actions.moveToElement(driver.findElement(PROFILE_1)).perform();
    }

    public void hoveringProfile_2() {
        actions.moveToElement(driver.findElement(PROFILE_2)).perform();
    }

    public void hoveringProfile_3() {
        actions.moveToElement(driver.findElement(PROFILE_3)).perform();
    }

    public String getName_1() {
        return driver.findElement(NAME_1).getText();
    }

    public String getName_2() {
        return driver.findElement(NAME_2).getText();
    }

    public String getName_3() {
        return driver.findElement(NAME_3).getText();
    }

    public void clickLinkName_1() {
        driver.findElement(LINK_NAME_1).click();
    }

    public void clickLinkName_2() {
        driver.findElement(LINK_NAME_2).click();
    }

    public void clickLinkName_3() {
        driver.findElement(LINK_NAME_3).click();
    }
}
