package ProjectTests;

import TestBase.BaseOfTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitleCheckTest extends BaseOfTest {
    @Test(priority = 1)
    public void checkPageTitle() {
        // Your test steps here
        String title = driver.getTitle();
        Assert.assertEquals(title, "DuckDuckGo - Protection. Privacy. Peace of mind.");
    }

}
