package com.syntax.class02selen;

import com.sun.tools.javac.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        //HW
        //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form
        //click on register
        //close the browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.cssSelector("Input[name='customer.firstName']")).sendKeys("Pito");
        driver.findElement(By.cssSelector("Input[name='customer.lastName']")).sendKeys("Halim");
        driver.findElement(By.xpath("//Input[@id='customer.address.street']")).sendKeys("123 Tevis St");
        driver.findElement(By.xpath("//Input[@name='customer.address.city']")).sendKeys("Winchester");
        driver.findElement(By.cssSelector("Input[name='customer.address.state']")).sendKeys("VA");
        driver.findElement(By.xpath("//Input[@id='customer.address.zipCode']")).sendKeys("22601");
        driver.findElement(By.cssSelector("Input[name='customer.phoneNumber']")).sendKeys("520-987-9865");
        driver.findElement(By.xpath("//Input[@id='customer.ssn']")).sendKeys("6780961234");
        driver.findElement(By.id("customer.username")).sendKeys("Lopha234");
        driver.findElement(By.name("customer.password")).sendKeys("Hlljlx875#$#$");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Hlljlx875#$#$");
        driver.findElement(By.xpath("//Input[@value='Register']")).click();
        driver.quit();













    }
}
