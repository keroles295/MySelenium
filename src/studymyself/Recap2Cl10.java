package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Recap2Cl10 {
    public static String url = "http://www.delta.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement travelCalendar= driver.findElement(By.id("input_departureDate_1"));
        travelCalendar.click();

        WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
        WebElement monthCalender=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        String monthText=monthCalender.getText();
        while (!monthText.equals("October")){
            nextButton.click();
            monthText=monthCalender.getText();

        }
        List<WebElement> deparDates=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        for (WebElement deparDate : deparDates) {
            String depaDateText= deparDate.getText();
            if(depaDateText.equals("27")){
                deparDate.click();
                break;
            }
        }
        WebElement returnMonth=driver.findElement(By.className("dl-datepicker-month-1"));
        String retMonthText=returnMonth.getText();
        while (!retMonthText.equals("December")){
            nextButton.click();
            retMonthText=returnMonth.getText();
        }
        List<WebElement>retDays=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
        for (WebElement retDay : retDays) {
          String reDayText=retDay.getText();
          if(reDayText.equals("29")){
              retDay.click();
              break;
          }
        }
        WebElement doneButton=driver.findElement(By.xpath("//button[text()='done']"));
        doneButton.click();
        driver.quit();





    }
}
