package com.syntax.class02selen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("htttps://www.facebook.com");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        String expexctedTiltle="Facebook - log in or sign up";
        if(title.equals(expexctedTiltle)){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is not correct");
        }
        driver.quit();

    }
}
