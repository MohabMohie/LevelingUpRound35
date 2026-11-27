package com.github.mohabmohie;

import com.github.mohabmohie.pages.DuckDuckGoHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DuckDuckGoTitleTest {

    private WebDriver driver;

    @BeforeMethod
    public void openChrome() {
        driver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void closeChrome() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void pageTitleIsGoogle() {
        DuckDuckGoHomePage page = new DuckDuckGoHomePage(driver).open();
        assertEquals(page.title(), "Google");
    }
}
