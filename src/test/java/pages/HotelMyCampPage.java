package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement logOnButton;


    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@value='Log in']")
    public WebElement logInButtonSubmit;

    @FindBy (xpath = "(//*[text()='ListOfUsers'])[2]")
    public WebElement entryStatement;



}

