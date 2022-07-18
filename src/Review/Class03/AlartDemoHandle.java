package Review.Class03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartDemoHandle {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement alart1= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alart1.click();
        //handle the alart
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        //Handling the conformation box

}
}
