package ProjectTests;

import TestBase.BaseOfTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoCheckTest extends BaseOfTest {
    // This class is currently empty and can be used for future tests related to logo checking.
    @Test
    public void CheckPageLogo() {
        boolean isLogoDisplayed = driver.findElement(By.xpath("//section[@class='header_headerLeft__n53WM header_headerSection___Ammb shrink']")).isDisplayed();
        Assert.assertTrue(isLogoDisplayed);
    }
}
