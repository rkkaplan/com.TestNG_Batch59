package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BRC_Page {
    public BRC_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement firstLoginButton;

    @FindBy (xpath = "//input[@id='formBasicEmail']")
    public WebElement emailInput;

    @FindBy (xpath = "//input[@id='formBasicPassword']")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement secondtLoginButton;

    @FindBy (id = "dropdown-basic-button")
    public WebElement userProfileName;
}
