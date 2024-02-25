package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

import java.util.List;

public class OrderPage {

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(className = "p-card-chldrn-cntnr")
    public List<WebElement> productCardContainer;

    @FindBy(className = "add-to-bs-tx")
    public WebElement addToCartButton;

    @FindBy(className = "account-basket-container")
    public WebElement cartIcon;

    @FindBy(className = "pb-basket-item")
    public WebElement cartItem;

    @FindBy(className = "go-to-payment")
    public WebElement checkoutButton;

    @FindBy(className = "title-text")
    public WebElement paymentPageHeader;

}
