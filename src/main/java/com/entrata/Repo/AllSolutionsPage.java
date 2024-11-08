package com.entrata.Repo;

import com.entrata.Utils;
import com.entrata.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllSolutionsPage {

    public AllSolutionsPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='sub-title b-m']")
    private WebElement pageHeader;

    public Boolean isHeaderTitleDisplayed() {
        return Utils.isDisplayed(pageHeader);
    }

    public String getHeader() {
        return Utils.getText(pageHeader);
    }

}
