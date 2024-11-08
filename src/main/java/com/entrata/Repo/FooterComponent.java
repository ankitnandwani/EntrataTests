package com.entrata.Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FooterComponent {

    public FooterComponent(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@class,'footer-link black')]")
    private List<WebElement> footerLinks;

    public List<WebElement> getFooterLinks(){
        return footerLinks;
    }
}
