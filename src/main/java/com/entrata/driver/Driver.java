package com.entrata.driver;

import com.entrata.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public final class Driver {

    private Driver(){}

    public static void initDriver(){
        String browser = ConfigFactory.getConfig().browser();

        WebDriver driver = DriverFactory.getDriver(browser);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        DriverManager.getDriver().get(ConfigFactory.getConfig().url());
    }

    public static void quitDriver() {
        DriverManager.getDriver().quit();
    }
}