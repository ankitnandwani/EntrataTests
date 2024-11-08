package com.entrata;

import com.entrata.config.ConfigFactory;
import com.entrata.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Utils {

    public static void waitUntilElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static Boolean isDisplayed(WebElement element) {
        waitUntilElementVisible(element);
        return element.isDisplayed();
    }

    public static void click(WebElement element) {
        waitUntilElementClickable(element);
        element.click();
    }

    public static void switchToNewTab(){
        ArrayList<String> tabs = new ArrayList<>(DriverManager.getDriver().getWindowHandles());
        DriverManager.getDriver().switchTo().window(tabs.get(1));
    }

    public static void sendKeys(WebElement element, String value) {
        waitUntilElementVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    private static Select getSelect(WebElement element){
        waitUntilElementVisible(element);
        return new Select(element);
    }

    public static void selectByVisibleText(WebElement element, String text) {
        getSelect(element).selectByVisibleText(text);
    }

    public static String getText(WebElement element) {
        waitUntilElementVisible(element);
        return element.getText();
    }
}