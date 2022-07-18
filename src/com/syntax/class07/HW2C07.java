package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HW2C07 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        //navigate to http://www.uitestpractice.com/Students/Contact
        //click on the link
        //get text
        //print out in the console
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement ajaxLink= driver.findElement(By.linkText("This is a Ajax link"));
        ajaxLink.click();
        String ajaxLinkText=driver.findElement(By.xpath("//div[@class='ContactUs']")).getText();
        System.out.println("ajaxLinkText = " + ajaxLinkText);
        

}
}