package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialsNinjaPage {
    public TutorialsNinjaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[text()='Phones & PDAs']")
    public WebElement phonesPDAsButton;

    @FindBy (xpath = "//h4")
    public List<WebElement> brandNamesOfPhones;

    @FindBy (xpath = "//div[@class='button-group']")
    public  List<WebElement> addToCartButtons;

    @FindBy (xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public  WebElement blackButtonCartTotal;

    @FindBy (xpath = "//td[@class='text-left']")
    public  List<WebElement> listOfCarts;
}
