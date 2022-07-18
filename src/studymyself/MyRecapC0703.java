package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MyRecapC0703 {
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainHandle = driver.getWindowHandle();
        WebElement newTab = driver.findElement(By.id("tabButton"));
        WebElement newWindow = driver.findElement(By.id("windowButton"));
        WebElement newWMessage = driver.findElement(By.id("messageWindowButton"));
        newTab.click();

        newWindow.click();

        newWMessage.click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String handleItSelf = iterator.next();
            if (!mainHandle.equals(handleItSelf)) {
                driver.switchTo().window(handleItSelf);
                String text=driver.findElement(By.xpath("//body")).getText();
                System.out.println(text);
                String title = driver.getTitle();
                if (title.isEmpty()){
                    System.out.println("There in no title available");
                }else{
                    System.out.println(title);

                }
                driver.close();


            }
        }
        driver.switchTo().window(mainHandle);
        driver.close();
    }
}