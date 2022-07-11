package com.syntax.class02selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        //navigate to fb.com
        //click on create new account
        //fill up all the textboxes
        //click on sign up button
        //close the pop up
        //close the browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//A[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Mikool");
        driver.findElement(By.xpath("//Input[@aria-label='Last name']")).sendKeys("Negam");
        driver.findElement(By.cssSelector("Input[aria-label='Mobile number or email']")).sendKeys("548-987-8954");
        driver.findElement(By.id("password_step_input")).sendKeys("Popo89423$%$");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//Select[@aria-label='Month']")).sendKeys("Jan");
        driver.findElement(By.xpath("//Select[@aria-label='Day']")).sendKeys("25");
        driver.findElement(By.xpath("//Select[@aria-label='Year']")).sendKeys("1940");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//input[@value='2'])[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//Button[@name='websubmit']")).click();
        driver.findElement(By.xpath("//Img[@class='_8idr img']")).click();












    }
}
