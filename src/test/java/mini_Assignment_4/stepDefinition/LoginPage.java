package mini_Assignment_4.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ApplicationProperties;


public class LoginPage extends BaseClass {


    String name = ApplicationProperties.INSTANCE.getUserName();
    String pass = ApplicationProperties.INSTANCE.getPassword();
    String baseUrl = ApplicationProperties.INSTANCE.getBaseUrl();

    @FindBy(id = "user-name")
    private WebElement userId;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void launchUrl() {

        driver = initialSetUp();
        driver.get(baseUrl);
    }

    public void login() throws InterruptedException {

        WebElement element;
        element = driver.findElement(By.id("user-name"));
        element.click();
        element.sendKeys(name);

        element = driver.findElement(By.id("password"));
        element.click();
        element.sendKeys(pass);

        element = driver.findElement(By.id("login-button"));
        element.click();


    }

}
