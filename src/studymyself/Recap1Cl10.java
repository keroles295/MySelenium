package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Recap1Cl10 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // login actions
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement leaveButton=driver.findElement(By.xpath("//b[text()='Leave']"));
        leaveButton.click();
        WebElement fromCalender=driver.findElement(By.id("calFromDate"));
        fromCalender.click();
        WebElement yearDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1=new Select(yearDD);
        select1.selectByVisibleText("2022");
        WebElement monthDD= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(monthDD);
        select.selectByVisibleText("Sep");

        List<WebElement> fromCalenderDaysDD=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement daySelf : fromCalenderDaysDD) {
            String day= daySelf.getText();
            System.out.println("day = " + day);
            if(day.equals("24")){
                daySelf.click();
                break;
            }
        }

}
}
