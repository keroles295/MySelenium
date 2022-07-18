package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2C05 {
    //Go to facebook sign up page
    //Fill out the whole form
    //Click signup
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        //https://syntaxprojects.com/basic-select-dropdown-demo.php
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement creatNewAccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
        creatNewAccount.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Ibram");
        Thread.sleep(2000);
        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Magdy");
        Thread.sleep(2000);
        WebElement emailOrPhoneNumber= driver.findElement(By.xpath("//input[@name='reg_email__']"));
        emailOrPhoneNumber.sendKeys("ibrammagdy267@gmail.com");
        Thread.sleep(2000);
        WebElement remailPhone =driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        remailPhone.sendKeys("ibrammagdy267@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[contains(@autocomplete, 'new-password')]"));
        password.sendKeys("loptnert8965@@#!");
        Thread.sleep(2000);
        WebElement monthBirth=driver.findElement(By.xpath("//select[contains(@aria-label, 'Month')]"));
        Select select=new Select(monthBirth);
        select.selectByVisibleText("May");
        WebElement DayBirth=driver.findElement(By.name("birthday_day"));
        Select select1=new Select(DayBirth);
        select1.selectByValue("29");
        WebElement yearBirth= driver.findElement(By.id("year"));
        Select select2=new Select(yearBirth);
        select2.selectByVisibleText("1978");
        Thread.sleep(2000);
        WebElement gender= driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        gender.click();
        Thread.sleep(2000);
        WebElement signUpButton= driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUpButton.click();


    }
}