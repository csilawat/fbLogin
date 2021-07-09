package mini_Assignment_5.com.TestClasses;

import mini_Assignment_5.base.BaseTest;
import mini_Assignment_5.models.LoginPage;
import org.junit.jupiter.api.Test;
import utils.ApplicationProperties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class LoginPageTest extends BaseTest {


    private LoginPage loginPage;
    private String userName = ApplicationProperties.INSTANCE.getUserName5();
    private String password = ApplicationProperties.INSTANCE.getPassword5();

    @Test
    public void loginTest() throws InterruptedException {

        loginPage = new LoginPage(driver);
        loginPage.login(userName, password);

        Thread.sleep(5000);
        assertThat(driver.getCurrentUrl(), containsString("https://opensource-demo.orangehrmlive.com/"));

    }
}
