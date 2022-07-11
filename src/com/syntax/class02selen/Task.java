package com.syntax.class02selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //driver.findElements(By.id("ctl00_MainContent_username")).sendk
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //driver.findElements(By.id("ctl00_MainContent_password"))
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        String title=driver.getTitle();
        String expectedTitle="Web Orders";
        if (title.equals(expectedTitle)){
            System.out.println("Title is Correct");
           
        }else{
            System.out.println("Title is not Correct");

        }
        driver.findElement(By.partialLinkText("Logout")).click();




    }
}
