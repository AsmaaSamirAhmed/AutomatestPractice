package ProjectTests;

import TestBase.BaseOfTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ImageUploadTest extends BaseOfTest {
    @Test
    public void checkImageUpload() {
        driver.findElement(By.cssSelector("a[href='/upload']")).click();
driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\User\\Pictures\\image.jpg");
        driver.findElement(By.id("file-submit")).click();
    }
}
