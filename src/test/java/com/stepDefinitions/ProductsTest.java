package com.stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import com.pages.ProductsPage;


public class ProductsTest {

    public WebDriver driver;

    ProductsPage productsPage;

    public ProductsTest() {
        this.driver = Hooks.driver;
        productsPage = new ProductsPage(driver);
    }


    @When("^user selects \"([^\"]*)\" from dropdown$")
    public void userSelectsFromDropdown(String option) throws Throwable {
        Thread.sleep(1000);
        productsPage.selectFromDropdown(option);
    }

    @And("^user clicks on add to cart  of \"([^\"]*)\" item$")
    public void userClicksOnAddToCartOfItem(String type) throws Throwable {
        productsPage.clicks(type);
    }

    @Then("^user should land on \"([^\"]*)\" page$")
    public void userShouldLandOnPage(String pageName) throws Throwable {
        productsPage.verifyPage(pageName);
    }
}
