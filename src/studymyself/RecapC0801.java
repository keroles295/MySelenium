package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecapC0801 {

        //http://syntaxprojects.com/dynamic-elements-loading.php
        public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            WebElement clickButton=driver.findElement(By.id("startButton"));
            clickButton.click();
           WebDriverWait wait=new WebDriverWait(driver,20);
           wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[contains(text(), 'Welcome Syntax')]")));
           WebElement syntaxmessage=driver.findElement(By.xpath("//h4[contains(text(), 'Welcome Syntax')]"));
           String syntaxmessageText= syntaxmessage.getText();
            System.out.println("syntaxmessageText = " + syntaxmessageText);
           

    }
}
