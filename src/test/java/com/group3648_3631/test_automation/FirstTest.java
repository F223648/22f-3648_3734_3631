package com.group3648_3631.test_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        // Set path for ChromeDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cd Inn\\Desktop\\chromedriver.exe");

        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        // Get the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        // Close the browser
        driver.quit();
    }
}

