package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAlrt {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement simpleAlartButton= driver.findElement(By.xpath("//button[@id='alert']"));
        simpleAlartButton.click();
        Thread.sleep(3000);
        Alert simpleAlert =driver.switchTo().alert();
        simpleAlert.accept();

        WebElement cofirmAlertButton= driver.findElement(By.id("confirm"));
        cofirmAlertButton.click();
        Thread.sleep(3000);
        Alert confirmAlert=driver.switchTo().alert();
        //to get the text of the alart should to be before the dismiss
        String confirmAlertText=cofirmAlertButton.getText();
        System.out.println("confirmAlertText = " + confirmAlertText);
        confirmAlert.dismiss();

        WebElement promptAlertButton=driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Yooooooooooou");
        promptAlert.accept();


    }
}
