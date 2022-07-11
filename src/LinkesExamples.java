import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinkesExamples {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
        //go and get all the links
        List<WebElement>links=driver.findElements(By.tagName("a"));
        for(WebElement lks:links){
            String text=lks.getText();
            System.out.println("text = " + text);
        }
        

    }
}
