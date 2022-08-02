package Review.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args)   {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //open privay help terms
        WebElement helpButton=driver.findElement(By.linkText("Help"));
        WebElement privacyButton=driver.findElement(By.linkText("Privacy"));
        WebElement termsButton=driver.findElement(By.linkText("Terms"));
        helpButton.click();
        privacyButton.click();
        termsButton.click();
        //get the handle of the main page and print it
        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        //get the title from privacy Tab
        //so we first we need to get alll windows handles
        Set<String> allHandles=driver.getWindowHandles();
        //second make an iterator
        Iterator<String> iterator= allHandles.iterator();
        //Third the while loop
        while (iterator.hasNext()){
        //Forth getting the first handle from the set
            String windowHandle=iterator.next();
        //switch to this particural and handle
            driver.switchTo().window(windowHandle);
        //make sure that this handle is the privacy one
            String handleTitle=driver.getTitle();
        //make sur the title is that of the privacy page
            if(handleTitle.contains("Privacy")){
                System.out.println("handleTitle = " + handleTitle);
                break;
            }


        }

}
}
