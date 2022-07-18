package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenicationAlert {
    //to handel that we should to write the username and password inside the url after //
    //username:password@
    public static String url = "https://admin:admin@www.uitestpractice.com/Students/Switchto";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}