package com.entrata.Repo;

import com.entrata.Utils;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleDemoPage {

    WebDriver driver;

    public ScheduleDemoPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(xpath = "//h1[normalize-space()='Property Management the Way It Should Be']")
    private WebElement header;

    @FindBy(id = "FirstName")
    private WebElement firstNameInput;

    @FindBy(id = "LastName")
    private WebElement lastNameInput;

    @FindBy(id = "Email")
    private WebElement emailInput;

    @FindBy(id = "Company")
    private WebElement companyInput;

    @FindBy(id = "Phone")
    private WebElement phoneInput;

    @FindBy(id = "Unit_Count__c")
    private WebElement unitDropdown;

    @FindBy(id = "Title")
    private WebElement jobTitleInput;

    @FindBy(id = "demoRequest")
    private WebElement demoRequestDropdown;

    @FindBy(xpath = "//button[normalize-space()='SCHEDULE DEMO']")
    private WebElement scheduleDemoBtn;

    public Boolean isHeaderTitleDisplayed() {
        return Utils.isDisplayed(driver, header);
    }

    public void fillAllDetails(){
        Utils.sendKeys(driver, firstNameInput, new Faker().name().firstName());
        Utils.sendKeys(driver, lastNameInput, new Faker().name().lastName());
        Utils.sendKeys(driver, emailInput, new Faker().internet().emailAddress());
        Utils.sendKeys(driver, companyInput, new Faker().company().name());
        Utils.sendKeys(driver, phoneInput, new Faker().phoneNumber().cellPhone());
        Utils.selectByVisibleText(driver, unitDropdown, "1 - 10");
        Utils.sendKeys(driver, jobTitleInput, new Faker().job().title());
        Utils.selectByVisibleText(driver, demoRequestDropdown, "a Resident");
    }

    public Boolean isScheduleDemoBtnDisplayed() {
        return Utils.isDisplayed(driver, scheduleDemoBtn);
    }
}
