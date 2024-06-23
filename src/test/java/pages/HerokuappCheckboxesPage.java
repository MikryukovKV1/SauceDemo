package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappCheckboxesPage extends BasePage {

    private final By CHECKBOX_1 = By.xpath("//input[@type='checkbox'][1]");
    private final By CHECKBOX_2 = By.xpath("//input[@type='checkbox'][2]");

    public HerokuappCheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOneCheckbox() {
        driver.findElement(CHECKBOX_1).click();
    }

    public void clickTwoCheckbox() {
        driver.findElement(CHECKBOX_2).click();
    }

    public boolean uncheckedOneCheckbox() {
        return driver.findElement(CHECKBOX_1).isSelected();
    }

    public boolean checkedOneCheckbox() {
        return driver.findElement(CHECKBOX_1).isSelected();
    }

    public boolean checkedTwoCheckbox() {
        return driver.findElement(CHECKBOX_2).isSelected();
    }

    public boolean uncheckedTwoCheckbox() {
        return driver.findElement(CHECKBOX_2).isSelected();
    }

}
