package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstagramPage {
    public InstagramPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//button[@class='sqdOP yWX7d    y3zKF     '])[2]")
    public WebElement hesapDegistirButton;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm                                                                                                              ']")
    public WebElement girisYapButton;

    @FindBy (xpath = "//*[text()='Şimdi Değil']")
    public  WebElement simdiDegil;

    @FindBy (xpath = "//span[@class='_aa8h _aa8i']")
    public WebElement profileDDM;

    @FindBy (xpath = "//div[text()='Profil']")
    public WebElement profileOption;


}
