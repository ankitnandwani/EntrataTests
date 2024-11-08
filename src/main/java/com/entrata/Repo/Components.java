package com.entrata.Repo;

import com.entrata.Utils;
import com.entrata.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Components {

    public Components(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(id = "cookie-decline")
    private WebElement denyBtn;

    @FindBy(id = "cookie-policy")
    private WebElement cookiePopup;

    @FindBy(xpath = "//button[@aria-label='close']")
    private WebElement bannerPopup;

    public void declineCookies(){
        Utils.click(denyBtn);
    }

    public void closeAllPopups(){
        Utils.click(denyBtn);
        Utils.click(bannerPopup);
    }

    public boolean verifyCookiePopupIsVisible(){
        return cookiePopup.isDisplayed();
    }
}
