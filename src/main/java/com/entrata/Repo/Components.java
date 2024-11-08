package com.entrata.Repo;

import com.entrata.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Components {

    WebDriver driver;
    public Components(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(id = "cookie-decline")
    private WebElement denyBtn;

    @FindBy(id = "cookie-policy")
    private WebElement cookiePopup;

    @FindBy(xpath = "//button[@aria-label='close']")
    private WebElement bannerPopup;

    public void declineCookies(){
        Utils.click(driver, denyBtn);
    }

    public void closeAllPopups(){
        Utils.click(driver, denyBtn);
        Utils.click(driver, bannerPopup);
    }

    public boolean verifyCookiePopupIsVisible(){
        return cookiePopup.isDisplayed();
    }
}
