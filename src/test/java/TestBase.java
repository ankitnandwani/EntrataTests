import com.entrata.Repo.AccountingPage;
import com.entrata.Repo.AllResourcesPage;
import com.entrata.Repo.AllSolutionsPage;
import com.entrata.Repo.Components;
import com.entrata.Repo.FooterComponent;
import com.entrata.Repo.HeaderComponent;
import com.entrata.Repo.HomePage;
import com.entrata.Repo.MarketingAndLeasingPage;
import com.entrata.Repo.PropertyManagementPage;
import com.entrata.Repo.ScheduleDemoPage;
import com.entrata.Repo.UtilitiesPage;
import com.entrata.config.ConfigFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String baseUrl;
    protected Components components;
    protected HomePage homePage;
    protected ScheduleDemoPage scheduleDemoPage;
    protected HeaderComponent headerComponent;
    protected PropertyManagementPage propertyManagementPage;
    protected MarketingAndLeasingPage marketingAndLeasingPage;
    protected AccountingPage accountingPage;
    protected UtilitiesPage utilitiesPage;
    protected AllSolutionsPage allSolutionsPage;
    protected AllResourcesPage allResourcesPage;
    protected FooterComponent footerComponent;

    @Before
    public void setUp() {
        // Set up the WebDriver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        components = new Components(driver);
        homePage = new HomePage(driver);
        scheduleDemoPage = new ScheduleDemoPage(driver);
        headerComponent = new HeaderComponent(driver);
        propertyManagementPage = new PropertyManagementPage(driver);
        marketingAndLeasingPage = new MarketingAndLeasingPage(driver);
        accountingPage = new AccountingPage(driver);
        utilitiesPage = new UtilitiesPage(driver);
        allSolutionsPage = new AllSolutionsPage(driver);
        allResourcesPage = new AllResourcesPage(driver);
        footerComponent = new FooterComponent(driver);
        driver.get(ConfigFactory.getConfig().url());
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            //driver.quit();
        }
    }
}
