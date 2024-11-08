import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EntrataTests extends TestBase{

    @Test
    public void testCookiesPopup() {
        // Test to verify the title and cookie popup
        String title = driver.getTitle();
        Assert.assertTrue("Home page title does not contain 'Entrata'", title.contains("Entrata"));
        Assert.assertTrue("Popup not found", components.verifyCookiePopupIsVisible());
        components.declineCookies();
        Assert.assertFalse("Popup found", components.verifyCookiePopupIsVisible());
    }

    @Test
    public void testNavigationToScheduleYourDemoPage() {
        // Test the navigation and form on Schedule Your Demo page
        components.declineCookies();
        homePage.navigateToScheduleDemoPage();
        Assert.assertTrue(scheduleDemoPage.isHeaderTitleDisplayed());
        scheduleDemoPage.fillAllDetails();
        Assert.assertTrue(scheduleDemoPage.isScheduleDemoBtnDisplayed());
    }

    @Test
    public void testHeaderLinksRedirection() {
        // Test to verify header links are navigating correctly
        components.closeAllPopups();
        headerComponent.navigateToPropertyManagementPage();
        Assert.assertTrue(propertyManagementPage.isHeaderTitleDisplayed());
        Assert.assertEquals("Property Management", propertyManagementPage.getHeader());

        headerComponent.navigateToMarketingAndLeasingPage();
        Assert.assertTrue(marketingAndLeasingPage.isHeaderTitleDisplayed());
        Assert.assertEquals("Marketing & Leasing", marketingAndLeasingPage.getHeader());

        headerComponent.navigateToAccountingPage();
        Assert.assertTrue(accountingPage.isHeaderTitleDisplayed());
        Assert.assertEquals("Entrata® Accounting™", accountingPage.getHeader());

        headerComponent.navigateToUtilitiesPage();
        Assert.assertTrue(utilitiesPage.isHeaderTitleDisplayed());
        Assert.assertEquals("Utilities", utilitiesPage.getHeader());

        headerComponent.navigateToAllSolutionPage();
        Assert.assertTrue(allSolutionsPage.isHeaderTitleDisplayed());
        Assert.assertEquals("All Solutions", allSolutionsPage.getHeader());

        headerComponent.navigateToAllResourcesPage();
        Assert.assertTrue(allResourcesPage.isHeaderTitleDisplayed());
        Assert.assertEquals("Resource Center", allResourcesPage.getHeader());

    }

    @Test
    public void testFooterLinks() {
        // Test to verify footer links are present
        List<WebElement> footerLinks = footerComponent.getFooterLinks();
        Assert.assertFalse("No footer links found", footerLinks.isEmpty());
        for (WebElement link : footerLinks) {
            Assert.assertTrue("Footer link " + link.getText() + " is not displayed", link.isDisplayed());
        }
    }
}
