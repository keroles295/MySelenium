package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MyRecapC7 {

        public static String url = "http://accounts.google.com/signup";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            String mainHandle=driver.getWindowHandle();
            System.out.println("mainHandle = " + mainHandle);
            WebElement helpButton=driver.findElement(By.linkText("Help"));
            helpButton.click();
            Set<String> allWindowHandles=driver.getWindowHandles();
            System.out.println("allwindow size"+ allWindowHandles.size());
            Iterator<String>iterator= allWindowHandles.iterator();
            while(iterator.hasNext()){
                mainHandle=iterator.next();
                String childHandle= iterator.next();
                System.out.println("childHandle = "+ childHandle);
                driver.switchTo().window(childHandle);
                driver.close();
                driver.switchTo().window(mainHandle);
                driver.close();
            }




        }
    }
