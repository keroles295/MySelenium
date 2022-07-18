package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SimpleWindowHandling {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //to get the widow handle
        String mainPageHandle =driver.getWindowHandle();// get window handle for the main page
        System.out.println("mainPageHandles = " + mainPageHandle);

        WebElement helpLink= driver.findElement(By.linkText("Help"));
        helpLink.click();
        Set<String>allWindowHandles =driver.getWindowHandles();//store all the handles inside the set
        System.out.println("allWindowHandles size = " + allWindowHandles.size());

        Iterator<String> it=allWindowHandles.iterator();//have an iteroter in order to iterate through the handles
        mainPageHandle=it.next();//take the first step and assign the main page handle

        String childHandle= it.next(); // take the second step and have a child handle
        System.out.println("childHandle = " + childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(childHandle);
        driver.close();
        driver.switchTo().window(mainPageHandle);
        helpLink.click();
        driver.quit();


    }
}
