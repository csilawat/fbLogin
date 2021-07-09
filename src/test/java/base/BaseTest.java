package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public WebDriver beforeTest() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver5");
        WebDriver driver = driver = new ChromeDriver();

        return driver;
    }


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
