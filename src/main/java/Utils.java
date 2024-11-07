import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {
    public static void explicitWait(WebDriver driver, Duration time, WebElement element){
        (new WebDriverWait(driver, time)).until(ExpectedConditions.visibilityOf(element));
    }
}
