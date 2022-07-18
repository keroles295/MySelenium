package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1C06 {
    public static String url ="https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
        //HW
        //Go to https://syntaxprojects.com/javascript-alert-box-demo.php
        //click on each button and handle the alert accordingly
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement jSABox= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        jSABox.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        String jSABoxText=alert.getText();
        System.out.println("jSABoxText = " + jSABoxText);
        alert.accept();
        WebElement jSCBox= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        jSCBox.click();
        Thread.sleep(2000);
        Alert alert1=driver.switchTo().alert();
       // alert1.accept();
        String jSCBoxText=alert1.getText();
        System.out.println("jSCBoxText = " + jSCBoxText);
        alert1.dismiss();
        WebElement promotBox= driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        promotBox.click();
        Thread.sleep(2000);
        Alert alert2=driver.switchTo().alert();
        String promotBoxText=alert2.getText();
        System.out.println("promotBoxText = " + promotBoxText);
        Thread.sleep(2000);
        //alert2.dismiss();
        alert2.accept();


    }
}
