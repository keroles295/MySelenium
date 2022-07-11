package com.syntax.class02selen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelf2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers.chrome.driver");
        WebDriver driver=new ChromeDriver();
        driver.get("");
    }
}
