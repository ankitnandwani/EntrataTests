import Repo.Components;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String baseUrl;
    protected Components components;

    @Before
    public void setUp() {
        // Load properties from the config file
        Properties properties = new Properties();
        try {
            FileInputStream input = new FileInputStream("src/main/resources/config.properties");
            properties.load(input);
            baseUrl = properties.getProperty("base.url");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set up the WebDriver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        components = new Components(driver);
        driver.get(baseUrl);
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
