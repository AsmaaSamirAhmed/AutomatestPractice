package firstProject;

import TestBase.BaseOfTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LinkCheckTest extends BaseOfTest
{
    @Test
    public void checkSeleniumLink() {
        WebElement searchBox = driver.findElement(By.id("searchbox_input"));
        searchBox.sendKeys("Selenium WebDriver");
        // Set up the wait utility (up to 10 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until visible and grab the element
        WebElement firstChoice = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='suggestions-list_suggestion__CScWc'][1]")));
        firstChoice.click();
        WebElement article = driver.findElement(By.id("r1-0"));
        WebElement link = article.findElement(By.cssSelector("a[data-testid='result-title-a']"));
        String href = link.getAttribute("href");
        System.out.println(href);
        Assert.assertEquals(href, "https://www.selenium.dev/documentation/webdriver/");
    }
}
