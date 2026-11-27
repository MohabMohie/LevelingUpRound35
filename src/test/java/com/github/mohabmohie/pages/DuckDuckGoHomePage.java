package com.github.mohabmohie.pages;

import org.openqa.selenium.WebDriver;

/**
 * Services offered by the DuckDuckGo home page.
 */
public final class DuckDuckGoHomePage {

    private static final String URL = "https://duckduckgo.com/";

    private final WebDriver driver;

    public DuckDuckGoHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DuckDuckGoHomePage open() {
        driver.get(URL);
        return this;
    }

    public String title() {
        return driver.getTitle();
    }
}
