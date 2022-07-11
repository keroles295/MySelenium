package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    //This for task2 class04
    //driver.get("https://www.google.com//");
    //        WebElement search=driver.findElement(By.xpath("//input[@aria-autocomplete='both']"));
    //        search.sendKeys("www.amazon.com");
    //        search.submit();
    //        driver.findElement(By.xpath("(//a[@href='https://www.amazon.com/'])[1]")).click();
    //TC 1: Amazon link count:
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.costcotravel.com/");
        WebElement cruises=driver.findElement(By.xpath("//a[text()= 'Cruises']"));
        cruises.click();
        Thread.sleep(2000);
        WebElement destination=driver.findElement(By.xpath("//select[@id='cruiseDestination']"));
        destination.click();
        Thread.sleep(2000);
        WebElement asian=driver.findElement(By.xpath("//option[contains(text(), 'Asia Africa')]"));
        asian.click();
        //Thread.sleep(2000);
        //System.out.println(asian.isSelected());
        //Thread.sleep(2000);
        WebElement departure= driver.findElement(By.cssSelector("select[aria-labelledby*='departureDate-label']"));
        departure.click();
        //Thread.sleep(2000);
        WebElement monthChoice=driver.findElement(By.xpath("//option[text()='September 2022']"));
        monthChoice.click();
        Thread.sleep(2000);

        //System.out.println(monthChoice.isSelected());
        WebElement cruiseLine=driver.findElement(By.xpath("//select[@aria-labelledby='cruiseLineLabel']"));
        cruiseLine.click();
        WebElement cruichoics=driver.findElement(By.xpath("//option[@value='hollandAmerica']"));
        cruichoics.click();
        WebElement duration= driver.findElement(By.cssSelector("select#cruiseLength"));
        duration.click();
        WebElement durChoice= driver.findElement(By.xpath("//option[contains(text(),'7-10 Nights')]"));
        durChoice.click();
        Thread.sleep(2000);
        WebElement findMyCruise= driver.findElement(By.xpath("//button[@data-hook='submit_cruises']"));
        findMyCruise.click();
        Thread.sleep(5000);










        driver.quit();








        //Thread.sleep(2000);
        //driver.quit();


    }
}
