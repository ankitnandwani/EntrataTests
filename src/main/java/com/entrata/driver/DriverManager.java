package com.entrata.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private void DriverManager(){}

    private static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>() ;

    public static void setDriver(WebDriver driver) {
        threadDriver.set(driver);
    }

    public static  WebDriver getDriver(){
        return threadDriver.get();
    }
}
