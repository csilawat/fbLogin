package mini_Assignment_1;

import base.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class SeleniumLocatorsAssignment extends BaseTest {

    WebElement element = null;
    WebDriver driver = null;

    @BeforeEach
    public void setUrl() {
        driver = beforeTest();
        driver.get("https://www.ixigo.com/");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser() {
        quitDriver(driver);
    }

    @Test
    public void getTextFromElements() {

        element = driver.findElement(By.id("ixiLogoImg"));

        element = driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]"));

        assertThat(element.getText(), containsString("FLIGHTS"));

        element = driver.findElement(By.xpath("//a[contains(text(),'TRAINS')]"));

        assertThat(element.getText(), containsString("TRAINS"));

        element = driver.findElement(By.xpath("//a[contains(text(),'BUSES')]"));

        assertThat(element.getText(), containsString("BUSES"));

        element = driver.findElement(By.xpath("//a[contains(text(),'HOTELS')]"));

        assertThat(element.getText(), containsString("HOTELS"));

    }


    @Test
    public void bookTicket() {

        // TODO find WebElement for 'From'
        element = driver.findElement(By.xpath("//input[@placeholder='Enter city or airport']//preceding::input[1]"));
        element.sendKeys("Indore");

        // TODO find WebElement for 'To'
        element = driver.findElement(By.xpath("//input[@type='text']//following::input[1]"));
        element.sendKeys("tests");

        // TODO find WebElement for 'Departure'
        element = driver.findElement(By.cssSelector("input[placeholder=Depart]"));
        element.click();

        // TODO find WebElement for 'Return'
        element = driver.findElement(By.cssSelector("input[placeholder=Return]"));
        element.click();

        // TODO find WebElement for 'Travellers | Class'
        element = driver.findElement(By.xpath("//div[contains(text(),'Travellers | Class')]"));
        element.click();

        // TODO find WebElement for 'Search Button'
        element = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
        element.click();

    }

}
