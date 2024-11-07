package com.entrata.Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Components {
    public Components(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "cookie-decline")
    private WebElement denyBtn;

    @FindBy(id = "cookie-policy")
    private WebElement cookiePopup;

    public void declineCookies(){
        denyBtn.click();
    }

    public boolean verifyCookiePopupIsVisible(){
        return cookiePopup.isDisplayed();
    }
}
