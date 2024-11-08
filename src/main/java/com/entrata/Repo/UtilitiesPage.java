package com.entrata.Repo;

import com.entrata.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UtilitiesPage {

    WebDriver driver;

    public UtilitiesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "product-banner-h1")
    private WebElement pageHeader;

    public Boolean isHeaderTitleDisplayed() {
        return Utils.isDisplayed(driver, pageHeader);
    }

    public String getHeader() {
        return Utils.getText(driver, pageHeader);
    }

}
