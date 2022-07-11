package com.syntax.class01selen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class Myself {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().to("https://www.youtube.com/watch?v=pkAP0LJbff4");
        //Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.navigate().back();
        Thread.sleep(5000);
        driver.quit();



    }
}
