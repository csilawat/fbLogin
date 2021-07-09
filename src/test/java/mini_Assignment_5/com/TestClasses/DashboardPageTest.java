package mini_Assignment_5.com.TestClasses;

import mini_Assignment_5.base.BaseTest;
import mini_Assignment_5.models.DashboardPage;
import mini_Assignment_5.models.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utils.ApplicationProperties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class DashboardPageTest extends BaseTest {

    DashboardPage dashboardPage;
    private LoginPage loginPage;
    private String userName = ApplicationProperties.INSTANCE.getUserName5();
    private String password = ApplicationProperties.INSTANCE.getPassword5();


    @Test
    public void checkVisibilityOfElementsOnDashBoardPageTest() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.login(userName, password);

        Thread.sleep(3000);
//        TODO not working got Null value when get this value from POM
       // assertThat(dashboardPage.getApplyLeaves().getText(), containsString("Apply Leave"));

        assertThat(findElementsByXpath("//span[contains(text(),'Apply Leave')]"), containsString("Apply Leave"));
        assertThat(findElementsByXpath("//span[contains(text(),'Assign Leave')]"), containsString("Assign Leave"));
        assertThat(findElementsByXpath("//span[contains(text(),'Leave List')]"), containsString("Leave List"));

    }

    public String findElementsByXpath(String xpath) {


        return driver.findElement(By.xpath(xpath)).getText();
    }
}
