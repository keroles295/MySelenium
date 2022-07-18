package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MyCap2 {
    public static String url="https://www.ebay.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement allCategries=driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
       // allDepartement.click();
       Select select=new Select(allCategries);
       List<WebElement> categryOptions=select.getOptions();
       for(WebElement categryoption:categryOptions){
           String categryText=categryoption.getText();
           System.out.println("categryText = " + categryText);
       }
    }
}
