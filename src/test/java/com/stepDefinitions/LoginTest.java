package com.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import com.pages.LoginPage;

public class LoginTest {

    public WebDriver driver;

    LoginPage loginPage;


    public LoginTest() {
        this.driver = Hooks.driver;
        loginPage = new LoginPage(driver);
    }

    @Given("^user is on the Login Page$")
    public void userIsOnTheLoginPage() {
        loginPage.openLoginPage();
    }


    @And("^user enters \"([^\"]*)\"$")
    public void userEnters(String text) throws Throwable {

    }

    @And("^user enters \"([^\"]*)\" in \"([^\"]*)\"$")
    public void userEntersIn(String text, String field) throws Throwable {
        loginPage.enterText(text, field);
    }

    @And("^user clicks on \"([^\"]*)\" of \"([^\"]*)\" item$")
    public void userClicksOnOfButton(String button, String type) throws Throwable {

    }

    @And("^user press the \"([^\"]*)\" button$")
    public void userPressTheButton(String button) throws Throwable {
        loginPage.click(button);
    }

}
