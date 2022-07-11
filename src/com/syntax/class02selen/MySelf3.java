package com.syntax.class02selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MySelf3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        driver.findElement(By.className("button")).click();
        driver.findElement(By.linkText("Order")).click();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Pietro Botros");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("126 Poly Zoj");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Winchester");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("VA");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("22602");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("3946532464337");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("23/3098");
        driver.findElement(By.className("btn_light")).click();

        driver.findElement(By.linkText("View all orders")).click();
        driver.findElement(By.linkText("Logout")).click();





















    }
}
