package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage (){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "email") // email or phone number
    public WebElement userMail;

    @FindBy (id = "pass")  //password
    public WebElement password;

    @FindBy (name = "login")  //login or girisYap
    public WebElement loginButton;

    @FindBy(className = "_9ay7")
    public WebElement girilemediYaziElementi;
}
