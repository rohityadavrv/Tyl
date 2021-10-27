package com.stepDefinitions;

import com.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import com.pages.YourCartPage;

public class YourCartTest {


    public WebDriver driver;

    YourCartPage yourCartPage;


    public YourCartTest() {
        this.driver = Hooks.driver;
        yourCartPage = new YourCartPage(driver);
    }
    @And("^user should see \"([^\"]*)\" items in the cart$")
    public void userShouldSeeItemsInTheCart(int number) throws Throwable {
        yourCartPage.countItems(number);
    }
}
