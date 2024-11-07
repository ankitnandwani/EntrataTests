import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EntrataTests extends TestBase{

    @Test
    public void testHomePageTitle() {
        // Test to verify the title of the home page
        String title = driver.getTitle();
        Assert.assertTrue("Home page title does not contain 'Entrata'", title.contains("Entrata"));
    }

    @Test
    public void testNavigationToFeatures() {
        // Test to navigate to the Features page and verify the URL
        WebElement featuresLink = driver.findElement(By.linkText("Features"));
        featuresLink.click();
        Assert.assertTrue("Did not navigate to the Features page", driver.getCurrentUrl().contains("features"));
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
