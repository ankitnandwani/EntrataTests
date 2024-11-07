import com.entrata.Repo.Components;
import com.entrata.Repo.HomePage;
import com.entrata.Repo.ScheduleDemoPage;
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

    @Before
    public void setUp() {
        // Set up the WebDriver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        components = new Components(driver);
        homePage = new HomePage(driver);
        scheduleDemoPage = new ScheduleDemoPage(driver);
        driver.get(ConfigFactory.getConfig().url());
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
