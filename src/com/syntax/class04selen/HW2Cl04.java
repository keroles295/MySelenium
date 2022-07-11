package com.syntax.class04selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class HW2Cl04 {
    //Open chrome browser
    //Go to "https://www.amazon.com/"
    //Get all links
    //Get number of links that has text
    //Print to console only the links that has text
    //
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com//");
        List<WebElement> linksAmzon=driver.findElements(By.tagName("a"));
        int num=0;
        for(WebElement links:linksAmzon){
           String linkText=links.getText();
           String fullLink=links.getAttribute("href");

           if(!linkText.isEmpty()){
               System.out.println(fullLink);
               num++;
           }
        }
        System.out.println("Number of linkes which have text = "+num);



    }
}
