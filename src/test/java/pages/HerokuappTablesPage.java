package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappTablesPage extends BasePage {

    private final By CELL_1_TAB_1 = By.xpath("//table[@id='table1']//tr[1]//td[3]");
    private final By CELL_1_TAB_2 = By.xpath("//table[@id='table2']//tr[1]//td[3]");
    private final By CELL_2_TAB_1 = By.xpath("//table[@id='table1']//tr[2]//td[4]");
    private final By CELL_3_TAB_1 = By.xpath("//table[@id='table1']//tr[3]//td[3]");
    private final By CELL_4_TAB_1 = By.xpath("//table[@id='table1']//tr[4]//td[4]");

    public HerokuappTablesPage(WebDriver driver) {
        super(driver);
    }

    public String getTextCell1Tab1() {
        return driver.findElement(CELL_1_TAB_1).getText();
    }

    public String getTextCell1Tab2() {
        return driver.findElement(CELL_1_TAB_2).getText();
    }

    public String getTextCell2Tab1() {
        return driver.findElement(CELL_2_TAB_1).getText();
    }

    public String getTextCell3Tab1() {
        return driver.findElement(CELL_3_TAB_1).getText();
    }

    public String getTextCell4Tab1() {
        return driver.findElement(CELL_4_TAB_1).getText();
    }
}