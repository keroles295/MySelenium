package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenShots {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static  void main(String[] args) throws InterruptedException {
        //bring all of the data from the table and print
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement userName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));// gettin webelement in return
        userName.sendKeys("tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginButton=driver.findElement(By.xpath("//input[@class='button']"));
        loginButton.click();

        //down-casting to driver in order to interact with web page
        TakesScreenshot ts= (TakesScreenshot) driver;
        File scFile=ts.getScreenshotAs(OutputType.FILE);// the screenshotis taken

        try {
            //copy the file and, pasted in the new location as png file
            // commons.io jar file is needed for this
            FileUtils.copyFile(scFile, new File("screenshots/SmartBear/adminPage.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
