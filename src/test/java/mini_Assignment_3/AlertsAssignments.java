package mini_Assignment_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class AlertsAssignments {

    WebDriver driver = null;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver5");
        driver = new ChromeDriver();

    }

    @AfterEach
    public void quiteDriver() {
        driver.quit();
    }

    @Test
    public void frameHandlerTest() {

        driver.get("https://the-internet.herokuapp.com/");
        WebElement frame = driver.findElement(By.xpath("//a[text()='Frames']"));
        frame.click();

        WebElement nestedFrame = driver.findElement(By.xpath("//a[text()='Nested Frames']"));
        nestedFrame.click();

        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath("//frame[@name='frame-left']"));
        assertThat(element.getText(), containsString(""));

    }


    @Test
    public void alertHandlerTest() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/");
        WebElement jSAlertButton = driver.findElement(By.xpath("//a[text()='JavaScript Alerts']"));

        jSAlertButton.click();

        WebElement nestedFrameButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        nestedFrameButton.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);

        alert.sendKeys("Alerts");
        alert.accept();

    }

    @Test
    public void verifyTitleOfEbayTest() {

        driver.get("https://in.ebay.com/");

        assertThat(driver.getTitle(), containsString("eBay India Seller Center"));
        assertThat(driver.getCurrentUrl(), containsString("https://sellglobal.ebay.in/seller-center/"));
    }


    @Test
    public void flightBookingTest() throws InterruptedException {

        driver.get("https://www.goibibo.com/");

        WebElement element = null;
        element = driver.findElement(By.id("roundTrip"));
        Thread.sleep(2000);
        waits(driver, element);
        element.click();
        element.sendKeys("New York (JFK)");
        element = driver.findElement(By.xpath("//input[@placeholder='From']"));
        Thread.sleep(2000);
        waits(driver, element);
        element.click();
        element.sendKeys("New York (JFK)");


        element = driver.findElement(By.xpath("//input[@placeholder='Destination']"));
        Thread.sleep(2000);
        waits(driver, element);
        element.click();
        element.sendKeys("Seattle (SEA)");

        element = driver.findElement(By.xpath("//input[@placeholder='Departure']"));
        Thread.sleep(2000);
        waits(driver, element);
        element.click();

        element = driver.findElement(By.xpath("//div/div[contains(text(),'24')]"));
        Thread.sleep(2000);
        waits(driver, element);
        element.click();

        element = driver.findElements(By.xpath("//div/span[@role='button']")).get(1);
        Thread.sleep(2000);
        waits(driver, element);
        element.click();
        //Thread.sleep(8000);

        element = driver.findElement(By.xpath("//div/div[contains(text(),'8')]"));
        Thread.sleep(2000);
        waits(driver, element);
        element.click();

        element = driver.findElement(By.xpath("//label[@for='student_fare_check']"));
        Thread.sleep(2000);
        waits(driver, element);
        element.click();

        element = driver.findElement(By.xpath("//div/button[contains(text(),'SEARCH')]"));
        Thread.sleep(4000);
        waits(driver, element);
        element.click();

    }


    public void waits(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(element));

    }
}
