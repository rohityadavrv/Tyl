package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigFileReader;

import java.util.List;

public class YourCartPage {
    WebDriver driver;
    ConfigFileReader fileReader;


    public YourCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void countItems(int number){
        int count;
        List<WebElement> products = driver.findElements(By.cssSelector("[class='cart_item_label']"));
        count= products.size();
        Assert.assertEquals(number,count);
    }

}
