import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EntrataTests extends TestBase{

    @Test
    public void testCookiesPopup() {
        // Test to verify the title of the home page
        String title = driver.getTitle();
        Assert.assertTrue("Home page title does not contain 'Entrata'", title.contains("Entrata"));
        Assert.assertTrue("Popup not found", components.verifyCookiePopupIsVisible());
        components.declineCookies();
        Assert.assertFalse("Popup found", components.verifyCookiePopupIsVisible());
    }

    @Test
    public void testNavigationToScheduleYourDemoPage() {
        // Test the navigation and form on Schedule Your Demo page
        homePage.navigateToScheduleDemoPage();
        Assert.assertTrue(scheduleDemoPage.isHeaderTitleDisplayed());
    }

    @Test
    public void testInteractWithSearchBar() {
        // Test to interact with the search bar without submitting
        WebElement searchBar = driver.findElement(By.name("search"));
        searchBar.sendKeys("Property Management");
        Assert.assertEquals("Search bar value does not match", "Property Management", searchBar.getAttribute("value"));
    }

    @Test
    public void testDynamicContentVerification() {
        // Test to verify dynamic content on the home page
        // Wait for dynamic content to load
        WebElement dynamicElement = driver.findElement(By.className("dynamic-class"));
        Assert.assertTrue("Dynamic content is not displayed", dynamicElement.isDisplayed());
    }

    @Test
    public void testFooterLinks() {
        // Test to verify footer links are present
        List<WebElement> footerLinks = driver.findElements(By.cssSelector("footer a"));
        Assert.assertFalse("No footer links found", footerLinks.isEmpty());
        for (WebElement link : footerLinks) {
            Assert.assertTrue("Footer link " + link.getText() + " is not displayed", link.isDisplayed());
        }
    }
}
