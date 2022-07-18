package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1C7 {
    //HW
    //Go to https://demoqa.com/browser-windows
    //click on New Tab and print the text from new tab in the console
    //click on New Window and print the text from new window in the console
    //click on New Window Message and print the text from new window in the console
    //Verify (compare) the titles for each page
    //Print out the title of the all pages
    public static String url = " https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainHandle=driver.getWindowHandle();
        WebElement newTab= driver.findElement(By.xpath("//button[text()='New Tab']"));
        WebElement newWindow= driver.findElement(By.xpath("//button[text()='New Window']"));
        WebElement newWMessage= driver.findElement(By.xpath("//button[text()='New Window Message']"));
        newTab.click();
       // String newTabText=newTab.getText();
       // System.out.println("newTabText = " + newTabText);
        newWindow.click();
       // String newWindText=newWindow.getText();
       // System.out.println("newWindText = " + newWindText);
        newWMessage.click();
       // String newMessageText=newWMessage.getText();
       // System.out.println("newMessageText = " + newMessageText);
        
        Set<String> allWindowHandles=driver.getWindowHandles();
        Iterator<String>iterator= allWindowHandles.iterator();
        while (iterator.hasNext()){
            String handleItSelf=iterator.next();
            if(!mainHandle.equals(handleItSelf)) {
                driver.switchTo().window(handleItSelf);
                String text=driver.findElement(By.xpath("//body")).getText();
                System.out.println("text = " + text);
                String title = driver.getTitle();
                if(title.isEmpty()){
                    System.out.println("The title is Empty");
                }else{
                    System.out.println(title);
                }
                //driver.close();
            }

        }
        driver.switchTo().window(mainHandle);
        driver.close();


    }
}