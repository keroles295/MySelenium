package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2C06 {
    //Task
    //Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    //verify the header text Sorry, We Couldn't Find Anything For “Asksn” is displayed
    //verify enroll today button is enabled
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //driver.switchTo().frame(0);
        WebElement frame1= driver.findElement(By.name("FrameOne"));
        driver.switchTo().frame(frame1);

        WebElement hederText=driver.findElement(By.className("heading-13"));
        String headtxt= hederText.getText();
        String expectedHeadText="Sorry, We Couldn't Find Anything For “Asksn”";
        if(headtxt.equals(expectedHeadText)){
            System.out.println("The header is displayed");
        }else{
            System.out.println("Wrong header text or the header is not displayed");
        }
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.switchTo().frame("FrameTwo");
        WebElement enrollTodayButton=driver.findElement(By.xpath("//div[@class='text-block-2 lg']"));
        String enrollTodayText=enrollTodayButton.getText();
        String expectedEnrollTodayText="Enroll today";
        if(enrollTodayText.equals(expectedEnrollTodayText)){
            System.out.println("The Button is enabled");
        }else{
            System.out.println("The Button is not enabled");
        }


    }
}