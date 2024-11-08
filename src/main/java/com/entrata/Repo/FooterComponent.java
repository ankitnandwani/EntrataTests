package com.entrata.Repo;

import com.entrata.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FooterComponent {

    public FooterComponent(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(@class,'footer-link black')]")
    private List<WebElement> footerLinks;

    public List<WebElement> getFooterLinks(){
        return footerLinks;
    }
}
