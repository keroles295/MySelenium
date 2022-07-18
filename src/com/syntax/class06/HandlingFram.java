package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFram {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //we need to switch to fram and then locat your element
        driver.switchTo().frame( 0);
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Batch 13");
        //we will to click on alert so we need to get out of the frame
        //which meens that we need come back to the normal(main html)
        driver.switchTo().defaultContent();
        WebElement alertButton= driver.findElement(By.id("alert"));
        alertButton.click();

        Alert alert=driver.switchTo().alert();
        alert.accept();
        //when we done with alert it automaticlly regain to the normal
        //but

        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("We back to the Frame");

        driver.switchTo().defaultContent();

        WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("Webelement way for Frame");


    }
}
