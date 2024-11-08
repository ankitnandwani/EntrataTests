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
import com.entrata.driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {
    protected WebDriver driver;
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
        Driver.initDriver();

        //Setup Pages
        components = new Components();
        homePage = new HomePage();
        scheduleDemoPage = new ScheduleDemoPage();
        headerComponent = new HeaderComponent();
        propertyManagementPage = new PropertyManagementPage();
        marketingAndLeasingPage = new MarketingAndLeasingPage();
        accountingPage = new AccountingPage();
        utilitiesPage = new UtilitiesPage();
        allSolutionsPage = new AllSolutionsPage();
        allResourcesPage = new AllResourcesPage();
        footerComponent = new FooterComponent();
    }

    @After
    public void tearDown() {
        // Close the browser
        Driver.quitDriver();
    }
}
