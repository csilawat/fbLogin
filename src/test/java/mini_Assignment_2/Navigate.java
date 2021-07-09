package mini_Assignment_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Navigate {

    WebDriver driver = null;


    @BeforeEach
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver5");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void quiteDriver() {
        driver.quit();
    }

    @Test
    public void main() throws InterruptedException {

        driver.get("http://www.flipkart.com");

        assertThat(driver.getCurrentUrl(), containsString("http://www.flipkart.com"));

        String parentWindow = driver.getWindowHandle();
        driver = driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");

        assertThat(driver.getCurrentUrl(), containsString("https://www.facebook.com"));

        driver.switchTo().window(parentWindow);

        assertThat(driver.getCurrentUrl(), containsString("http://www.flipkart.com"));

        driver.navigate().refresh();
        Thread.sleep(5000);

    }

    @Test
    public void dragNDrop() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions builder = new Actions(driver);

        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement targetElement = driver.findElement(By.xpath("//div[@id='column-b']"));

        builder.dragAndDrop(sourceElement, targetElement).build().perform();

    }
}
