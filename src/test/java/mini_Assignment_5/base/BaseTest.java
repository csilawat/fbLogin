package mini_Assignment_5.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver5");
        System.out.println("before test");
        driver = new ChromeDriver();

    }

    @AfterEach
    public void afterTest() {
        driver.close();
        driver.quit();
    }

}
