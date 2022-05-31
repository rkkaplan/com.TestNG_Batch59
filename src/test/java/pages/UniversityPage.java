package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UniversityPage {
    public UniversityPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//span[@id='button1']")
    public WebElement jsAlert;

    @FindBy (xpath = "//span[@onclick='confirmAlert()']")
    public  WebElement confirmAlert;

    @FindBy (xpath = "//p[@id='confirm-alert-text']")
    public WebElement confirmAlertText;

}
