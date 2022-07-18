package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task {
    //http://syntaxprojects.com/dynamic-elements-loading.php
    public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement startButton= driver.findElement(By.xpath("//button[text()='Start']"));
        startButton.click();

        WebDriverWait driverWait=new WebDriverWait(driver, 20);
        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
        WebElement messageTest= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println("messageTest = " + messageTest.getText());
    }
}