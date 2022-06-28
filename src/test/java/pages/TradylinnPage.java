package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.annotation.processing.Generated;

public class TradylinnPage {
    public TradylinnPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//a[@class='login inline-type']")
    public WebElement girisYapButton;

    @FindBy (xpath = "//a[text()='Hesabım']")
    public WebElement hesabimButton;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement girisYapSubmitButton;

    @FindBy (xpath = "//a[text()='Store Manager']")
    public WebElement storeManagerButton;

    @FindBy (xpath = "//a[@href='https://tradylinn.com/store-manager/products/']")
    public  WebElement urunButton;

    @FindBy (xpath = "//a[@data-tip='Add New Product']")
    public  WebElement yeniEkleButton;

    @FindBy (xpath = "(//div[@class='page_collapsible_content_holder'])[9]")
    public  WebElement attributes;


}
