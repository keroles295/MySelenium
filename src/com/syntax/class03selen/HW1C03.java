package com.syntax.class03selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1C03 {
    public static void main(String[] args) throws InterruptedException {
        //Navigate to http://syntaxprojects.com
        //Click on start practicing
        //click on simple form demo
        //enter any text on first text box
        //click on show message
        //quit the browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement startPracticing=driver.findElement(By.xpath("//a[text()=' Start Practising ']"));
        startPracticing.click();
        Thread.sleep(3000);
        WebElement simpleFormDemo= driver.findElement(By.xpath("//a[contains(text(), 'Box Demo')]/preceding-sibling::a"));
        simpleFormDemo.click();
        Thread.sleep(3000);
        WebElement firstTextBox=driver.findElement(By.xpath("//label[contains(text(), 'Please enter')]"));
        firstTextBox.sendKeys("I will never walk alone");
        Thread.sleep(3000);

        WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();
        System.out.println("showMessage = " + showMessage);
        driver.quit();


    }
}
