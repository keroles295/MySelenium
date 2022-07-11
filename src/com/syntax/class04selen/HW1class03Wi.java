package com.syntax.class04selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1class03Wi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/index.php");
        WebElement startpractingButton =driver.findElement(By.cssSelector("a#btn_basic_example"));
        startpractingButton.click();
        Thread.sleep(3000);
        WebElement simpleForDemo=driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a"));
        simpleForDemo.click();
        Thread.sleep(3000);
        WebElement testBox=driver.findElement(By.cssSelector("input[placeholder^='Please']"));
        testBox.sendKeys("Hrbana minha");
        Thread.sleep(3000);
        WebElement showMessageButton=driver.findElement(By.cssSelector("button[onclick *='show']"));
        showMessageButton.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
