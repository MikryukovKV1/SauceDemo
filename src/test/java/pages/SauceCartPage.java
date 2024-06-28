package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SauceCartPage extends BasePage {

    private final By PRODUCTS_NAME = By.cssSelector(".inventory_item_name ");

    public SauceCartPage(WebDriver driver) {
        super(driver);
    }

    @Step("Получение списка добавленых в корзину товаров")
    public ArrayList<String> getProducts() {
        List<WebElement> allProducts = driver.findElements(PRODUCTS_NAME);
        ArrayList<String> names = new ArrayList<>();
        for (WebElement prod : allProducts) {
            names.add(prod.getText());
        }
        return names;
    }
}