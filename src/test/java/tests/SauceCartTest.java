package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SauceCartTest extends BaseTest {

    @Test(description = "проверка, что добавленные в корзину товары по индексу, находятся в корзине")
    public void buyProducts() {
        openSaucedemo();
        loginPage.login(userName, password);
        productPage.addToCart(0);
        productPage.addToCart(3);
        productPage.addToCart(5);
        productPage.openCart();
        assertTrue(cartPage.getProducts().contains("Sauce Labs Backpack"));
        assertTrue(cartPage.getProducts().contains("Sauce Labs Fleece Jacket"));
        assertTrue(cartPage.getProducts().contains("Test.allTheThings() T-Shirt (Red)"));
    }

    @Test(description = "проверка, что добавленные в корзину товары по названию продукта, находятся в корзине")
    public void buyProductsStringFormat() {
        openSaucedemo();
        loginPage.login(userName, password);
        productPage.addToCart("Sauce Labs Backpack");
        productPage.addToCart("Sauce Labs Fleece Jacket");
        productPage.addToCart("Test.allTheThings() T-Shirt (Red)");
        productPage.openCart();
        assertTrue(cartPage.getProducts().contains("Sauce Labs Backpack"));
        assertTrue(cartPage.getProducts().contains("Sauce Labs Fleece Jacket"));
        assertTrue(cartPage.getProducts().contains("Test.allTheThings() T-Shirt (Red)"));
    }
}