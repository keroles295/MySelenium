package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo1 {
    public static String url="http://syntaxprojects.com/basic-checkbox-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        ////input[@class='cb1-element']
        List<WebElement> optioncheckboxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        int size=optioncheckboxes.size();
        System.out.println(size);
        for(WebElement option:optioncheckboxes ){
           // option.click();
            String checkboxValue=option.getAttribute("value");
            if(checkboxValue.equals("Option-2")) {
               option.click();
               break;
            }
           }
    }
}
