package pages;

import org.checkerframework.framework.qual.QualifierForLiterals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy (xpath = "(//button[@class='btn btn-primary'])[2]")
    public WebElement buttonUpVehicles;

    @FindBy (xpath = "(//button[@class='btn btn-primary'])[3]")
    public WebElement buttonDownVehicles;

    @FindBy(css = "ul.vehicleList>li[class]")
    public List<WebElement> carBrandsList;
}
