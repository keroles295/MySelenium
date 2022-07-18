package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW3CLass05 {
    //Go to ebay.com
    //get all the categories and print them in the console
    //select Computers/Tables & Networking
    //click on search
    //verify the header
    public static String url = "https://www.ebay.com";

    public static void main(String[] args) throws InterruptedException {
        //https://syntaxprojects.com/basic-select-dropdown-demo.php
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement allCtegories= driver.findElement(By.xpath("//select[@class='gh-sb ']"));
        Select select=new Select(allCtegories);
        List<WebElement> allcategrioesOptions=select.getOptions();
        for(WebElement allcatOption:allcategrioesOptions){
            String optiontext=allcatOption.getText();
            System.out.println("optiontext = " + optiontext);
        }
         select.selectByVisibleText("Computers/Tablets & Networking");
        WebElement searchbutton= driver.findElement(By.xpath("//input[@value='Search']"));
        searchbutton.click();
      WebElement header= driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
      boolean isHeaderDisplay=header.isDisplayed();
      if(isHeaderDisplay==true){
          System.out.println("The header has been verified successfully ");
      }else{
          System.out.println("The header is different about the expected ");
      }

        

    }
}