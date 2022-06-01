package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class SauceDemoPage {
    public SauceDemoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@id='user-name']")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@id='login-button']")
    public WebElement loginButton;

    @FindBy (xpath = "//select[@class='product_sort_container']")
    public WebElement productSortDDM;


    @FindBy (className = "inventory_item_price")
    public List<WebElement> pricesofProducts;
}
