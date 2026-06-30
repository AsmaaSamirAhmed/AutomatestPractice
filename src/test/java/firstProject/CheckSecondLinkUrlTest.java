package firstProject;

import TestBase.BaseOfTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckSecondLinkUrlTest extends BaseOfTest {
    @Test(priority = 5)
    public void checkSecondLink() {
        WebElement searchBox = driver.findElement(By.id("searchbox_input"));
        searchBox.sendKeys("Cucumber IO");
        // Set up the wait utility (up to 10 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until visible and grab the element
        WebElement firstChoice = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='suggestions-list_suggestion__CScWc'][1]")));
        firstChoice.click();
        WebElement article = driver.findElement(By.id("r1-0"));

    }
}
