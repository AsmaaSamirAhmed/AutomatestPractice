package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseOfTest {
    public static WebDriver driver;
    @BeforeMethod
    public void setUp() {
        // Set the path to the ChromeDriver executable
       // if(driver.equals("Chrome")){
            driver = new ChromeDriver(getOptimizedChromeOptions());
        //} else if (driver.equals("Firefox")) {
            // Initialize Firefox driver (if needed)
         //   driver=new FirefoxDriver();
        //}
        driver.navigate().to("https://duckduckgo.com/");
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

