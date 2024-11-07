package com.entrata.Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.entrata.Utils;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(xpath = "//div[normalize-space()='Schedule Your Demo']")
    private WebElement scheduleDemoBtn;

    public void navigateToScheduleDemoPage(){
        Utils.click(driver, scheduleDemoBtn);
        Utils.switchToNewTab(driver);
    }


}
