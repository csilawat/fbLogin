package mini_Assignment_5.models;

import mini_Assignment_5.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ApplicationProperties;

public class LoginPage extends BasePage {

    @FindBy(id = "txtUsername")
    private WebElement usernameInput;

    @FindBy(id = "txtPassword")
    private WebElement passwordInput;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    private String url = ApplicationProperties.INSTANCE.getBaseUrl5();

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
        getWebDriver().get(url);
    }

    public void login(String username, String password) {
        elementWait(usernameInput);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        elementWait(passwordInput);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        elementWait(loginButton);
        elementToBeClickable(loginButton);
        loginButton.click();
    }


}