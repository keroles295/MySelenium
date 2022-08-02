package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        //bring all of the data from the table and print
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement userName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("tester", Keys.TAB);
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test", Keys.ENTER);
       // WebElement loginButton=driver.findElement(By.xpath("//input[@class='button']"));
        //loginButton.click();
}
}
