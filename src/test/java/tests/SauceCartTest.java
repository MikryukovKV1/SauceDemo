package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SauceCartTest extends BaseTest {

    @Test
    public void buyProducts() {
        openSaucedemo();
        loginPage.login("standard_user", "secret_sauce");
        productPage.addToCart(0);
        productPage.addToCart(3);
        productPage.addToCart(5);
        productPage.openCart();
        assertTrue(cartPage.getProducts().contains("Sauce Labs Backpack"));
        assertTrue(cartPage.getProducts().contains("Sauce Labs Fleece Jacket"));
        assertTrue(cartPage.getProducts().contains("Test.allTheThings() T-Shirt (Red)"));
    }

    @Test
    public void buyProductsStringFormat() {
        openSaucedemo();
        loginPage.login("standard_user", "secret_sauce");
        productPage.addToCart("Sauce Labs Backpack");
        productPage.addToCart("Sauce Labs Fleece Jacket");
        productPage.addToCart("Test.allTheThings() T-Shirt (Red)");
        productPage.openCart();
        assertTrue(cartPage.getProducts().contains("Sauce Labs Backpack"));
        assertTrue(cartPage.getProducts().contains("Sauce Labs Fleece Jacket"));
        assertTrue(cartPage.getProducts().contains("Test.allTheThings() T-Shirt (Red)"));
    }
}