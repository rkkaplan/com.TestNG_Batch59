package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CapitalOfCountriesPage {
    public CapitalOfCountriesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//div[text()='Copenhagen'])[2]")
    public WebElement copenhagenButton;

    @FindBy (xpath = "(//div[text()='Rome'])[2]")
    public WebElement romeButton;

    @FindBy (xpath = "(//div[text()='Madrid'])[2]")
    public WebElement madridButton;

    @FindBy (xpath = "(//div[text()='Oslo'])[2]")
    public WebElement osloButton;

    @FindBy (xpath = "(//div[text()='Stockholm'])[2]")
    public WebElement stockholmButton;

    @FindBy (xpath = "(//div[text()='Washington'])[2]")
    public WebElement washingtonButton;

    @FindBy (xpath = "(//div[text()='Seoul'])[2]")
    public WebElement seoulButton;


    @FindBy (xpath = "//div[text()='Italy']")
    public WebElement italyButton;

    @FindBy (xpath = "//div[text()='Spain']")
    public WebElement spainButton;

    @FindBy (xpath = "//div[text()='Norway']")
    public WebElement norwayButton;

    @FindBy (xpath = "//div[text()='Denmark']")
    public WebElement denmarkButton;

    @FindBy (xpath = "//div[text()='South Korea']")
    public WebElement southKoreaButton;

    @FindBy (xpath = "//div[text()='Sweden']")
    public WebElement swedenButton;

    @FindBy (xpath = "//div[text()='United States']")
    public WebElement usaButton;


}
