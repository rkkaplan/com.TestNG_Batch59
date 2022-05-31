package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TwitterPage {
    public TwitterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/i/flow/signup']")
    public WebElement signUpButton;

    @FindBy (xpath = "//input[@autocomplete='name']")
    public WebElement nameInput;

    @FindBy (xpath = "//span[text()='E-posta kullan']")
    public WebElement useEMail;

    @FindBy (xpath = "//*[text()='İleri']")
    public WebElement forwardButton;

    @FindBy (xpath = "//*[text()='Kaydol']")
    public  WebElement enrollButton;


}
