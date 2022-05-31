package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ReactShoppingPage {
    public ReactShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//div[@class='sc-uhudcz-0 iZZGui']//div[@tabindex=1]//p[@class='sc-124al1g-4 eeXMBo']")
    public List<WebElement> allElements;

    @FindBy (xpath = "//div[@class='sc-uhudcz-0 iZZGui']//div[@tabindex=1]//button[@class='sc-124al1g-0 jCsgpZ']")
     public List<WebElement> allAddToCart;

    @FindBy (xpath = "//div[@class='sc-11uohgb-0 hDmOrM']//p[@class='sc-11uohgb-2 elbkhN']")
    public List<WebElement> listOfCart;
}
