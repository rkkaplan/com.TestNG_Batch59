package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SahibindenPage {
    public SahibindenPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "(//button[@aria-label='Kapat'])[1]")
    public WebElement cookiesButtonElement;

    @FindBy(xpath = "//*[@id='searchText']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@title='Otomobil']")
    public WebElement automobil;

    @FindBy(xpath = "//*[@title='Honda']")
    public WebElement honda;

    @FindBy(xpath = "//*[@title='Volvo']")
    public WebElement volvo;

    @FindBy(xpath ="//ul[@class='categoryList jspScrollable']//h2")
    public List<WebElement> carCategory;
}
