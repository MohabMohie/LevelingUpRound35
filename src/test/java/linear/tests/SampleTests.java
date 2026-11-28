package linear.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTests {
    WebDriver driver;
    /**
     * Open Google Chrome
     * Navigate to [https://duckduckgo.com/]
     * Assert that the page title is [Google]
     * Close Google Chrome
     */
    @Test
    public void assertThePageTitle() {
        driver.get("https://duckduckgo.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
    }

    /**
     * Open Google Chrome
     * Navigate to [https://duckduckgo.com/]
     * Assert that the DuckDuckGo logo is displayed
     * Close Google Chrome
     */
    @Test
    public void assertTheDuckDuckGoLogoIsDisplayed() {
        driver.get("https://duckduckgo.com");
        By logoImage = By.id("logo_homepage");
        boolean isLogoDisplayed = driver.findElement(logoImage).isDisplayed();
        Assert.assertTrue(isLogoDisplayed, "DuckDuckGo logo is not displayed on the page.");
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
