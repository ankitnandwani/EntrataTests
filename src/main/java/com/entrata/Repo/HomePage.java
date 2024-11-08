package com.entrata.Repo;

import com.entrata.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.entrata.Utils;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//div[normalize-space()='Schedule Your Demo']")
    private WebElement scheduleDemoBtn;

    public void navigateToScheduleDemoPage(){
        Utils.click(scheduleDemoBtn);
        Utils.switchToNewTab();
    }


}
