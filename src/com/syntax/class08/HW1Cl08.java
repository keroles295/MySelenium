package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1Cl08 {
    //go to https://the-internet.herokuapp.com/dynamic_controls
    //click on checkbox and click on remove
    //verify the text
    //click on enable verify the textbox is enabled
    //enter text and click disable
    //verify the textbox is disabled
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        //bring all of the data from the table and print
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement checkboxone=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkboxone.click();
        WebElement removeButton=driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();
        WebDriverWait driverWait=new WebDriverWait(driver, 20);
        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
        WebElement messageAfterRemove= driver.findElement(By.xpath("//p[@id='message']"));
        String expectedMessage="It's gone!";
        String messageText= messageAfterRemove.getText();
        if(messageText.equalsIgnoreCase(messageText)){
            System.out.println("The message has been verified");
       }else{
            System.out.println("We can not verify the message text, please check again");
        }
        WebElement enableButton=driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();
        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
        WebElement textAfterEnableClick=driver.findElement(By.xpath("//p[@id='message']"));
        boolean textIsEnble=textAfterEnableClick.isEnabled();
        System.out.println("Text Of Enable = " + textIsEnble);

        WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("Pietro is 22 years old");
        textBox.click();
        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
        WebElement textAfterDisEnabledClick=driver.findElement(By.xpath("//p[@id='message']"));
        boolean isdisable=textAfterDisEnabledClick.isEnabled();
        System.out.println("isdisEnable = " + isdisable);
        driver.quit();

        














    }
}