package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandlingDDWithIterator {
    public static String url="https://www.amazon.com/";
    public static void main(String[] args) throws InterruptedException {
        //https://syntaxprojects.com/basic-select-dropdown-demo.php
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categores= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(categores);
        List<WebElement> options=select.getOptions();
        Iterator<WebElement> it=options.iterator();
        while(it.hasNext()){
            WebElement addOption=it.next();
            String optionText=addOption.getText();
            System.out.println("optionText = " + optionText);
        }
    }
}
