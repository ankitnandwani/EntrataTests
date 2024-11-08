package com.entrata.driver;

import com.entrata.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public  final class DriverFactory {
    private DriverFactory() {}

    public static WebDriver getDriver(String browserName) {

        WebDriver driver = null;

        if (browserName.equalsIgnoreCase(BrowserType.CHROME.toString())) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase(BrowserType.FIREFOX.toString())) {
            FirefoxOptions options = new FirefoxOptions();
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(options);
        } else if (browserName.equalsIgnoreCase(BrowserType.EDGE.toString())) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }else if (browserName.equalsIgnoreCase(BrowserType.SAFARI.toString())) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }

        return driver;
    }
}