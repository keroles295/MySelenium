package com.syntax.class02selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));//get web element in return
        //performing action on the specific element
        username.sendKeys("Tester");

        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
       password.sendKeys("test");
        driver.findElement(By.className("button")).click();
        driver.manage().window().maximize();
        driver.quit();

    }
}
