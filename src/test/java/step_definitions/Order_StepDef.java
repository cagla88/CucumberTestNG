package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import pages.OrderPage;
import utilities.*;


public class Order_StepDef extends OrderPage {

    @Given("^I am on the Trendyol website$")
    public void iAmOnTheTrendyolWebsite() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("^I add an item to my cart$")
    public void iAddAnItemToMyCart() {

        List<WebElement> products = productCardContainer;
        Assert.assertTrue(products.size() > 0, "Yemek ürünleri bulunamadı");

        WebElement firstProduct = products.get(0);
        firstProduct.click();

        addToCartButton.click();

    }

    @When("^I proceed to checkout$")
    public void iProceedToCheckout() {

        cartIcon.click();
    }

    @Then("^I should complete the checkout process successfully$")
    public void iShouldCompleteTheCheckoutProcessSuccessfully() {


        Assert.assertNotNull(cartItem, "Sepette ürün bulunamadı");
        checkoutButton.click();
        Assert.assertEquals(paymentPageHeader.getText(), "Ödeme");


    }

}
