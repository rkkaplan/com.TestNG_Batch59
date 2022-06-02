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

    @FindBy (xpath = "(//select[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-18jsvk2 r-1loqt21 r-37j5jr r-1inkyih r-rjixqe r-crgep1 r-1wzrnnt r-1ny4l3l r-t60dpp r-xd6kpl r-1pn2ns4 r-ttdzmv'])[1]")
    public WebElement ddmMonth;

    @FindBy (xpath = "(//select[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-18jsvk2 r-1loqt21 r-37j5jr r-1inkyih r-rjixqe r-crgep1 r-1wzrnnt r-1ny4l3l r-t60dpp r-xd6kpl r-1pn2ns4 r-ttdzmv'])[2]")
    public WebElement ddmDay;

    @FindBy (xpath = "(//select[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-18jsvk2 r-1loqt21 r-37j5jr r-1inkyih r-rjixqe r-crgep1 r-1wzrnnt r-1ny4l3l r-t60dpp r-xd6kpl r-1pn2ns4 r-ttdzmv'])[3]")
    public WebElement ddmYear;


}
