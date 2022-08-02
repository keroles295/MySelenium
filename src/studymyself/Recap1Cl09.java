package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Recap1Cl09 {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("tester");
        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
      /*  List<WebElement>rowsData=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

        for(int i=1; i< rowsData.size(); i++){
            String rowItSelf=rowsData.get(i).getText();
            System.out.println("rowItSelf = " + rowItSelf);
            if(rowItSelf.contains("MasterCard")){
                List<WebElement>checkBoxes=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
                WebElement checkBox=checkBoxes.get(i-1);
                checkBox.click();

            }
        }



}
}

       */
        List<WebElement>rowData=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        List<WebElement>checkBoxes=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
        for (int i=0; i< rowData.size(); i++){
            String rowDataSelf=rowData.get(i).getText();
            if(rowDataSelf.contains("VISA")){
               WebElement checkBox=checkBoxes.get(i-1);
               checkBox.click();
            }
        }
    }}
