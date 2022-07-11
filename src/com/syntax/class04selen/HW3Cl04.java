package com.syntax.class04selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3Cl04 {
    //HRMS Application Negative Login:
    //Open chrome browser
    //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    //Enter valid username
    //Leave password field empty
    //Click on login button
    //Verify error message with text "Password cannot be empty" is displayed.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName= driver.findElement(By.cssSelector("input[type='text']"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys(" ");
        WebElement loginButton=driver.findElement(By.xpath("//input[@value='LOGIN']"));
        loginButton.click();
        WebElement errorLoginMessage= driver.findElement(By.xpath("//span[@id='spanMessage']"));
        if(errorLoginMessage.isDisplayed()){
            System.out.println("It is displayed");
        }else{
            System.out.println("It is not displayed");
        }
        String textOfError=errorLoginMessage.getText();
        System.out.println("textOfError = " + textOfError);


    }
}
