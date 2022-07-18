package Review.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutDropDown {
    public static String url = "https://demoqa.com/select-menu";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //check the drop is multpe or not
        WebElement muldd= driver.findElement(By.xpath("//select[@id='cars']"));
        Select select=new Select(muldd);
        boolean isMultiple =select.isMultiple();
        System.out.println("The DD isMultiple = " + isMultiple);
        select.selectByIndex(0);
        Thread.sleep(2000);
        select.selectByValue("opel");
        Thread.sleep(2000);
        select.selectByVisibleText("Volvo");

}
}