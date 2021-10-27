package com.pages;


import utils.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    ConfigFileReader fileReader;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(css = "[data-test='username']")
    public WebElement UsernameTextBox;

    @FindBy(css = "[data-test='password']")
    public WebElement PasswordTextBox;

    @FindBy(css = "[data-test='login-button']")
    public WebElement LoginButton;

    @FindBy(xpath = ".//*[@class='shopping_cart_link']")
    public WebElement CartButton;

    @FindBy(css = "[data-test='checkout']")
    public WebElement CheckoutButton;

    @FindBy(css = "[data-test='firstName']")
    public WebElement FirstName;

    @FindBy(css = "[data-test='lastName']")
    public WebElement LastName;

    @FindBy(css = "[data-test='postalCode']")
    public WebElement Zipcode;

    @FindBy(css = "[data-test='continue']")
    public WebElement ContinueButton;

    @FindBy(css = "[data-test='finish']")
    public WebElement FinishButton;


    public void enterText(String text, String Field){
       switch(Field){
           case "Username" :
               UsernameTextBox.sendKeys(text);
               break;

           case "Password" :
               PasswordTextBox.sendKeys(text);
               break;

           case "FirstnameField" :
               FirstName.sendKeys(text);
               break;

           case "LastNameField" :
               LastName.sendKeys(text);
               break;

           case "ZipcodeField" :
               Zipcode.sendKeys(text);
               break;

           default:

       }

    }



    public void click( String type){
        switch(type){
            case "Login" :
                LoginButton.click();
                break;

            case "Cart" :
                CartButton.click();
                break;

            case "Checkout" :
                CheckoutButton.click();
                break;

            case "Continue" :
                ContinueButton.click();
                break;

            case "Finish" :
                FinishButton.click();
                break;

            default:

        }
    }


    public void openLoginPage() {
        fileReader = new ConfigFileReader();

        driver.get(fileReader.getUrl());

    }


}
