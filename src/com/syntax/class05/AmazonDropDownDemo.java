package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropDownDemo {
    public static String url="https://www.amazon.com/";
    public static void main(String[] args) throws InterruptedException {
        //https://syntaxprojects.com/basic-select-dropdown-demo.php
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categores= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(categores);
        List<WebElement>options=select.getOptions();
        for(WebElement option:options){
           String optionTest= option.getText();
            System.out.println("optionTest = " + optionTest);
        }
        select.selectByValue("search");
    }
}
