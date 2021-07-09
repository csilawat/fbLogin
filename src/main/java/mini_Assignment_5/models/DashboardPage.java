package mini_Assignment_5.models;

import mini_Assignment_5.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Assign Leave')]")
    private WebElement assignLevel;

    @FindBy(xpath = "//span[contains(text(),'Leave List')]")
    private WebElement assignList;

    @FindBy(xpath = "//span[contains(text(),'Timesheets')]")
    private WebElement timeSheets;

    @FindBy(xpath = "//span[contains(text(),'Apply Leave')]")
    private WebElement applyLeaves;

    @FindBy(xpath = "//span[contains(text(),'My Leave')]")
    private WebElement myLeaves;

    @FindBy(xpath = "//span[contains(text(),'My Timesheet')]")
    private WebElement myTimeSheets;

    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public WebElement getAssignLevel() {
        elementWait(assignLevel);
        return assignLevel;
    }

    public WebElement getAssignList() {
        elementWait(assignList);
        return assignList;
    }

    public WebElement getApplyLeaves() {
        elementWait(applyLeaves);
        return applyLeaves;
    }

    public WebElement getMyLeaves() {
        elementWait(myLeaves);
        return myLeaves;
    }

    public WebElement getMyTimeSheets() {
        elementWait(myTimeSheets);
        return myTimeSheets;
    }

    public void setAssignList(WebElement assignList) {
        this.assignList = assignList;
    }

    public void setAssignLevel(WebElement assignLevel) {
        this.assignLevel = assignLevel;
    }

    public void setTimeSheets(WebElement timeSheets) {
        this.timeSheets = timeSheets;
    }

    public WebElement getTimeSheets() {
        return timeSheets;
    }

    public void setApplyLeaves(WebElement applyLeaves) {
        this.applyLeaves = applyLeaves;
    }

    public void setMyLeaves(WebElement myLeaves) {
        this.myLeaves = myLeaves;
    }

    public void setMyTimeSheets(WebElement myTimeSheets) {
        this.myTimeSheets = myTimeSheets;
    }

}
