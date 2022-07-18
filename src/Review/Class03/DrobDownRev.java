package Review.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DrobDownRev {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement creatNAButton= driver.findElement(By.xpath("//a[text()='Create new account']"));
        creatNAButton.click();
        Thread.sleep(2000);
        //select the birth day from drop down
        WebElement dayDD=driver.findElement(By.xpath("//select[@id='day']"));
        //select class to deel with drop down
        Select select = new Select(dayDD);
        List<WebElement>avaliableDays=select.getOptions();
       int size= avaliableDays.size();
        //for (WebElement avaliableDay : avaliableDays) {
           // System.out.println(avaliableDay.getText());
        //}
      //  for(int i=0; i<size; i++){
        //    System.out.println(avaliableDays.get(i).getText());
        //    select.selectByIndex(i);
        //    Thread.sleep(1000);
      //  }
        //select by index the day 3
        select.selectByIndex(2);
        Thread.sleep(2000);
        //select by the value the day 22
        select.selectByValue("22");
        Thread.sleep(2000);
        //select by the visable text value the day 16
        select.selectByVisibleText("16");
        Thread.sleep(2000);












}
}
