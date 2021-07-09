package mini_Assignment_4.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ApplicationProperties;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class ProductOperationClass extends BaseClass {

    WebElement element;
    String firstName = ApplicationProperties.INSTANCE.getFirstName();
    String lastName = ApplicationProperties.INSTANCE.getLastName();
    String postalCode = ApplicationProperties.INSTANCE.getPostalCode();


    public void findProduct() throws InterruptedException {

        element = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']"));
        element.click();

        // remove product from cart and add again
        removeAndAddAgainProduct();

        Thread.sleep(4000);
        clickOnCartIcon();
        Thread.sleep(4000);

    }

    public void clickOnCartIcon() {
        element = driver.findElement(By.className("shopping_cart_link"));
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }

    }

    public void removeAndAddAgainProduct() {

        element = driver.findElement(By.xpath("//button[@name='remove-sauce-labs-fleece-jacket']"));
        System.out.println(element.getText());
        element.click();

        element = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']"));
        System.out.println(element.getText());
        element.click();
    }

    public void continueShopping() throws InterruptedException {
        element = driver.findElement(By.className("back-image"));
        element.click();

        element = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-onesie']"));
        System.out.println(element.getText());
        element.click();

        clickOnCartIcon();
        Thread.sleep(4000);

    }

    public void countCartNumber() {

        element = driver.findElement(By.className("shopping_cart_badge"));
        if (!(element.getText().equals("2")))
            driver.navigate().refresh();
        assertThat(element.getText(), is("2"));


    }

    public void countCartValueOnCheckOut() {

        List<WebElement> elements = driver.findElements(By.className("cart_item"));
        assertThat(elements.size(), is(2));
    }

    public void checkOut() throws InterruptedException {

        element = driver.findElement(By.id("checkout"));
        element.click();

        element = driver.findElement(By.id("first-name"));
        element.click();

        element.sendKeys(firstName);
        element = driver.findElement(By.id("last-name"));
        element.click();

        element.sendKeys(lastName);
        element = driver.findElement(By.id("postal-code"));
        element.click();

        element.sendKeys(postalCode);
        element = driver.findElement(By.id("continue"));
        element.click();

        Thread.sleep(3000);
        element = driver.findElement(By.name("finish"));
        element.click();

    }

    public void verifySuccessMessage() {

        element = driver.findElement(By.className("complete-header"));

        assertThat(element.getText(), containsString("THANK YOU FOR YOUR ORDER"));


    }
}
