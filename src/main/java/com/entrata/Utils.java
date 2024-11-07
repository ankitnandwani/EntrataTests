package com.entrata;

import com.entrata.config.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Utils {

    public static void waitUntilElementVisible(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static Boolean isDisplayed(WebDriver driver, WebElement element) {
        waitUntilElementVisible(driver, element);
        return element.isDisplayed();
    }

    public static void click(WebDriver driver, WebElement element) {
        waitUntilElementVisible(driver, element);
        element.click();
    }

    public static void switchToNewTab(WebDriver driver){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
