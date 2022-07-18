package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1C05 {
    //TC 1: Facebook dropdown verification
    //Open chrome browser
    //Go to "https://www.facebook.com"
    //click on create new account
    //Verify:
    //month dd has 12 month options
    //day dd has 31 day options
    //year dd has 115 year options
    //Select your date of birth
    //Quit browser
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        //https://syntaxprojects.com/basic-select-dropdown-demo.php
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement creatNewAccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
        creatNewAccount.click();
        Thread.sleep(2000);
        WebElement monthsDD=driver.findElement(By.name("birthday_month"));
        Select select=new Select(monthsDD);
        List<WebElement> monthsOptions=select.getOptions();
        int size= monthsOptions.size();
        //System.out.println("size = " + size);
        if(size==12){
            System.out.println("Months DD has "+size+" months");
        }else{
            System.out.println("Months DD does have 12 months");
        }
        select.selectByVisibleText("Jul");
        //for(WebElement monthoption:monthsOptions){
            //String monthValue=monthoption.getText();
           // System.out.println("monthValue = " + monthValue);
        //}
        WebElement dayDD= driver.findElement(By.xpath("//select[@id='day']"));
        Select select1=new Select(dayDD);
        List<WebElement> dayOptions=select1.getOptions();
        int size1=dayOptions.size();
        //for(WebElement dayoption:dayOptions){
            //String dayValue=dayoption.getText();
            //System.out.print("dayoption = " +dayValue+" ");
       // }
       // System.out.println("size1 = " + size1);
        if(size1==31){
            System.out.println("Days DD has "+size1+" days");
        }else{
            System.out.println("Days DD does have 31 days");
        }
        select1.selectByValue("22");
        WebElement yearDD= driver.findElement(By.xpath("//select[@aria-label='Year']"));
        Select select2=new Select(yearDD);
        List<WebElement> yearoPtions=select2.getOptions();
        int size2=yearoPtions.size();
       // System.out.println("size2 = " + size2);
        if(size2==118){
            System.out.println("Years DD has "+size2+" years");
        }else{
            System.out.println("Years DD does have 118 years");
        }
        select2.selectByVisibleText("1971");
        Thread.sleep(3000);
        driver.quit();



        
        


    }
}