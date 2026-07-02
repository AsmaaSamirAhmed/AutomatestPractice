package TestBase;

import Utils.UrlReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseOfTest {
    public static WebDriver driver;
    @BeforeMethod
    public void setUp() {
        String Url=UrlReader.getUrl("HerokuUrl");
            driver = new ChromeDriver(getOptimizedChromeOptions());
            driver.navigate().to(Url);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static ChromeOptions getOptimizedChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        // Add arguments
        options.addArguments("--no-sandbox");
        options.addArguments("--start-maximized");
        options.addArguments("--window-size=1920,1080");
        return options;
    }

}

