package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class ReCap11C08 {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        //bring all of the data from the table and print
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowsData=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        int rowsSize= rowsData.size();
        System.out.println("rowsSize = " + rowsSize);
        Iterator<WebElement>iterator= rowsData.iterator();
        
        while (iterator.hasNext()){
            WebElement rowData= iterator.next();
           String rowDatatText= rowData.getText();
            System.out.println("rowData = " + rowDatatText);
        }
        List<WebElement>cellsData=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td"));
        int cellsSize= cellsData.size();
        for (WebElement cellsDatum : cellsData) {
            String cellDataText= cellsDatum.getText();
            System.out.println("cellDataText = " + cellDataText);
        }

    }
}
