package com.syntax.class04selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Cl04 {
    //Task
    //Open chrome browser
    //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    //Enter valid username and password (username - Admin, password - Hum@nhrm123)
    //Click on login button
    //Then verify Syntax Logo is displayed.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.cssSelector("input[id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton= driver.findElement(By.cssSelector("input[id='btnLogin']"));
        loginButton.click();
        WebElement logo=driver.findElement(By.cssSelector("img[alt='OrangeHRM']"));
        if(logo.isDisplayed()){
            System.out.println("Yes, It is displayed");
        }else{
            System.out.println("It is not displayed");
        }




    }

}
