package com.syntax.class02selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelf {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        driver.findElement(By.className("button")).click();
        String title=driver.getTitle();
        String expectTitle="Web orders";
        if (title.equals(expectTitle)){
            System.out.println("This is the correct title");
        }else{
            System.out.println("This is the wrong title");
        }
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Logout")).click();
        driver.quit();




    }
}
