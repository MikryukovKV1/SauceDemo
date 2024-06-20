import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SaucedemoInventoryPage {

    WebDriver driver = new ChromeDriver();

    WebElement elementId = driver.findElement(By.id("item_4_title_link"));
    WebElement elementName = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
    WebElement elementClass = driver.findElement(By.className("shopping_cart_link"));
    List<WebElement> elementsTag = driver.findElements(By.tagName("a"));
    WebElement elementText = driver.findElement(By.linkText("Sauce Labs Bike Light"));
    List<WebElement> elementsPartText = driver.findElements(By.partialLinkText("T-Shirt"));
    WebElement elementXpAttr = driver.findElement(By.xpath("//a[@data-test='item-4-img-link']"));
    WebElement elementXpText = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
    WebElement elementXpContText = driver.findElement(By.xpath("//div[contains(text(),'Red')]"));
    WebElement elementXpContAttr = driver.findElement(By.xpath("//a[contains(@id,'about_sidebar')]"));
    WebElement elementXpAncestor = driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs')]//ancestor::a"));
    WebElement elementXpPreced = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']/preceding::div[contains(text(),'$')]"));
    WebElement elementXpFollow = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']/following::div[contains(text(),'$')]"));
    WebElement elementXpDescen = driver.findElement(By.xpath("//div[@class='inventory_item']/descendant::a[@id='item_3_title_link']"));
    WebElement elementXpOr = driver.findElement(By.xpath("//a[@class='inventory_list' or @id='item_2_title_link']"));

    WebElement elementCssClass = driver.findElement(By.cssSelector(".active_option"));
    WebElement elementCss = driver.findElement(By.cssSelector(".btn.btn_primary"));
    WebElement elementCssId = driver.findElement(By.cssSelector("#inventory_sidebar_link"));
    WebElement elementCssAttr = driver.findElement(By.cssSelector("a[data-test='item-3-title-link']"));
    WebElement elementCssAttrAndClass = driver.findElement(By.cssSelector("div[data-test='header-container'] .shopping_cart_link"));

}
