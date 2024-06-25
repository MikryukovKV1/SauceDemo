package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceProductPage extends BasePage {

    private final By ALL_BUTTON_ADD_TO_CART = By.xpath("//div[@class='inventory_item']//button");
    private final By CART_LINK = By.xpath("//div[@id='shopping_cart_container']/a");
    private final String ALL_BUTTON_CART_PATTERN = "//div[text()='%s']//ancestor::div[@class='inventory_item_description']//button[text()='Add to cart']";

    public SauceProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart(int index) {
        driver.findElements(ALL_BUTTON_ADD_TO_CART).get(index).click();
    }

    public void addToCart(String prod) {
        By btnAddToCart = By.xpath(String.format(ALL_BUTTON_CART_PATTERN, prod));
        driver.findElement(btnAddToCart).click();
    }

    public void openCart() {
        driver.findElement(CART_LINK).click();
    }

}
