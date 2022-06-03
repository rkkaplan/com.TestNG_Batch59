package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ReactShoppingPage {
    public ReactShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//p[@class='sc-124al1g-4 eeXMBo']")
    public List<WebElement> allElements;

    @FindBy (xpath = "//button[@class='sc-124al1g-0 jCsgpZ']")
     public List<WebElement> allAddToCartButtonsList;

    @FindBy (xpath = "//p[@class='sc-11uohgb-2 elbkhN']")
    public List<WebElement> listOfCart;

    @FindBy (xpath = "//button[@class='sc-1h98xa9-0 gFkyvN']")
    public WebElement quitFromAddToCartListButton;

    @FindBy (xpath = "//div[@class='sc-1h98xa9-2 fGgnoG']")
    public WebElement openCartButton;

    @FindBy (xpath = "//div[@class='sc-11uohgb-4 bnZqjD']")
    public List<WebElement> pricesOfCart;

    @FindBy (xpath = "//p[@class='sc-124al1g-6 ljgnQL']")
    public List<WebElement> pricesOfPages;

    //
    //
}
