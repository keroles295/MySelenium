package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();

        WebElement insgButton= driver.findElement(By.linkText("Follow On Instagram"));//we should to delete the spaces in the
        // link text int the front and the end like  " koko " should to be "koko"
        //But in the xpath we need to keep it
        WebElement faceBButon= driver.findElement(By.linkText("Like us On Facebook"));
        WebElement followInAFacButton= driver.findElement(By.linkText("Follow Instagram & Facebook"));

        insgButton.click();
        faceBButon.click();
        followInAFacButton.click();
        Set<String>allWindowHandles =driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String>iterator=allWindowHandles.iterator();
        while (iterator.hasNext()) { // start iterating through the handles (tabs)
            String hadleItSelf = iterator.next();// get one handle (tab)
            if (!mainPageHandle.equals(hadleItSelf)) { // set a condition where main page is not equal to the handle
                driver.switchTo().window(hadleItSelf);// switch to that specific handle
                driver.manage().window().maximize();
                String title = driver.getTitle();// get the title
                System.out.println(title);
            }
        }
        driver.switchTo().window(mainPageHandle);
        insgButton.click();


    }
}