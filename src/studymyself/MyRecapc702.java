package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MyRecapc702 {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainHandle= driver.getWindowHandle();
        WebElement fOIButton= driver.findElement(By.linkText("Follow On Instagram"));
        WebElement lOFButton= driver.findElement(By.linkText("Like us On Facebook"));
        WebElement fIFButton= driver.findElement(By.linkText("Follow Instagram & Facebook"));
        fOIButton.click();
        lOFButton.click();
        fIFButton.click();
        Set<String>allWindowHandled=driver.getWindowHandles();
        Iterator<String>iterator= allWindowHandled.iterator();
        while(iterator.hasNext()){
            String handle=iterator.next();
            if(!mainHandle.equals(handle)){
                driver.switchTo().window(handle);
                driver.manage().window().maximize();
                //Thread.sleep(2000);
                String tile=driver.getTitle();
                System.out.println("tile = " + tile);
                driver.close();

            }
        }
        driver.switchTo().window(mainHandle);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String mTitle=driver.getTitle();
        System.out.println("mTitle = " + mTitle);

        driver.close();

}
}
