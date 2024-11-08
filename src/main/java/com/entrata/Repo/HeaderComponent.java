package com.entrata.Repo;

import com.entrata.Utils;
import com.entrata.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderComponent {

    public HeaderComponent(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindAll({
            @FindBy(xpath = "(//div[normalize-space()='Products'])[5]"),
            @FindBy(xpath = "(//div[normalize-space()='Products'])[2]")
    }
    )
    private WebElement productsLink;

    @FindBy(xpath = "(//h3[normalize-space()='Property Management'])[7]")
    private WebElement propertyManagementLink;

    @FindBy(xpath = "(//h3[normalize-space()='Marketing & Leasing'])[2]")
    private WebElement marketingAndLeasingLink;

    @FindBy(xpath = "(//h3[normalize-space()='Accounting'])[2]")
    private WebElement accountingLink;

    @FindBy(xpath = "(//h3[normalize-space()='Utilities'])[2]")
    private WebElement utilitiesLink;

    @FindBy(xpath = "//div[normalize-space()='Solutions']")
    private WebElement solutionsLink;

    @FindBy(xpath = "//h3[normalize-space()='All Solutions']")
    private WebElement allSolutionsLink;

    @FindBy(xpath = "//div[normalize-space()='Resources']")
    private WebElement resourcesLink;

    @FindBy(xpath = "//h3[normalize-space()='All Resources']")
    private WebElement allResourcesLink;

    public void navigateToPropertyManagementPage(){
        Utils.click(productsLink);
        Utils.click(propertyManagementLink);
    }

    public void navigateToMarketingAndLeasingPage(){
        Utils.click(productsLink);
        Utils.click(productsLink);
        Utils.click(marketingAndLeasingLink);
    }

    public void navigateToAccountingPage(){
        Utils.click(productsLink);
        Utils.click(productsLink);
        Utils.click(accountingLink);
    }

    public void navigateToUtilitiesPage(){
        Utils.click(productsLink);
        Utils.click(productsLink);
        Utils.click(utilitiesLink);
    }

    public void navigateToAllSolutionPage(){
        Utils.click(solutionsLink);
        Utils.click(solutionsLink);
        Utils.click(solutionsLink);
        Utils.click(allSolutionsLink);
    }

    public void navigateToAllResourcesPage(){
        Utils.click(resourcesLink);
        Utils.click(resourcesLink);
        Utils.click(resourcesLink);
        Utils.click(allResourcesLink);
    }
}
