package mini_Assignment_4.stepDefinition;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    public static WebDriver driver;

    public static WebDriver initialSetUp() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver5");
        WebDriver driver = new ChromeDriver();
        return driver;

    }

    @AfterAll
    public void quitDriver(WebDriver driver) {

        driver.quit();

    }

    public void elementVisibilityWait(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
    }

    public void elementClickableWait(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(element));
    }
}
