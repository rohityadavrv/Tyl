package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigFileReader;

import java.util.List;

public class ProductsPage {
    WebDriver driver;
    ConfigFileReader fileReader;


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public WebElement Filter;
    public WebElement AddToCartButton;


    @FindBy(css = "[class='title']")
    public WebElement PageName;



    public void verifyPage(String pageName) {
        Assert.assertEquals(pageName, PageName.getText());
    }


    public void selectFromDropdown(String option){
        Filter=driver.findElement(By.xpath(".//*[@value='"+option+"']"));
        if(Filter.isDisplayed()){
            Filter.click();
        }
        else{
            System.out.println("option not present based on selection");
        }

    }
    public void clicks( String type) throws InterruptedException {
        int count;
        List<WebElement> products = driver.findElements(By.xpath(".//*[@class='inventory_list']/div"));
        count= products.size();

        switch(type){
            case "First" :
                AddToCartButton=driver.findElement(By.xpath(".//*[@class='inventory_list']/div["+1+"]//button"));
                AddToCartButton.click();
                break;
            case "Last" :
                AddToCartButton=driver.findElement(By.xpath(".//*[@class='inventory_list']/div["+count+"]//button"));
                AddToCartButton.click();
                break;
        }
    };

}
