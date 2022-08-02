package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RecapDynaicTable {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        //bring all of the data from the table and print
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement userName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton=driver.findElement(By.xpath("//input[@class='button']"));
        loginButton.click();
        List<WebElement>rowsData=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        List<WebElement>checkBoxes=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
        for (int i=0; i<rowsData.size(); i++){
            WebElement rowdata=rowsData.get(i);
            String rowDataText= rowdata.getText();
            if(rowDataText.contains("MasterCard")){
               WebElement checkBox=checkBoxes.get(i-1);
               checkBox.click();
            }
        }









    }
}
