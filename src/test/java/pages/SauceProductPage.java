package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceProductPage extends BasePage {

    private final By ALL_BUTTON_ADD_TO_CART = By.xpath("//div[@class='inventory_item']//button");
    private final By CART_LINK = By.xpath("//div[@id='shopping_cart_container']/a");
    private final String ALL_BUTTON_CART_PATTERN = "//div[text()='%s']//ancestor::div[@class='inventory_item_description']//button[text()='Add to cart']";
    private final By TEXT_CORRECT_LOGIN = By.cssSelector("[class=title]");

    public SauceProductPage(WebDriver driver) {
        super(driver);
    }

    @Step("Добавить товары в корзину по индексу {index}")
    public void addToCart(int index) {
        driver.findElements(ALL_BUTTON_ADD_TO_CART).get(index).click();
    }

    @Step("Добавить товары в корзину по названию {productName}")
    public void addToCart(String productName) {
        By btnAddToCart = By.xpath(String.format(ALL_BUTTON_CART_PATTERN, productName));
        driver.findElement(btnAddToCart).click();
    }

    @Step("Открытие страницы корзины")
    public void openCart() {
        driver.findElement(CART_LINK).click();
    }

    @Step("Сообщение об успешной авторизации")
    public String getMessageProductPage() {
        return driver.findElement(TEXT_CORRECT_LOGIN).getText();
    }
}