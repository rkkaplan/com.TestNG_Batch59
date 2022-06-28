package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikipediWebTablePage {
    public WikipediWebTablePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[4]/caption")
    public WebElement nameOfList;
    // 4.SATIR   //*[@id="mw-content-text"]/div[1]/table[4]/tbody/tr[4]
}
