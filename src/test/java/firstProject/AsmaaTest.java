package firstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AsmaaTest {
    @Test
    public void testScenario() {
        WebDriver driver ;
        driver= new ChromeDriver();
        // Your test steps here
        driver.quit();
    }
}
