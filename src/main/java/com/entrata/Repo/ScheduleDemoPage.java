package com.entrata.Repo;

import com.entrata.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleDemoPage {

    WebDriver driver;

    public ScheduleDemoPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(xpath = "//h1[normalize-space()='Property Management the Way It Should Be']")
    private WebElement header;

    public Boolean isHeaderTitleDisplayed() {
        return Utils.isDisplayed(driver, header);
    }
}
