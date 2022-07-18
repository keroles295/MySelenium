package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Recap0802 {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        //bring all of the data from the table and print
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement>headCol=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        for (WebElement st : headCol) {
            String colmtext=st.getText();
            System.out.println("colmtext = " + colmtext);
        }
        List<WebElement>rowTable=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        int rowTabelSize=rowTable.size();
        System.out.println("rowTabelSize = " + rowTabelSize);
        Iterator<WebElement> iterator=rowTable.iterator();
        while (iterator.hasNext()){
            WebElement rowitSelf= iterator.next();
            String rowText=rowitSelf.getText();
            System.out.println("rowText = " + rowText);
            
        }
        WebElement row4=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[4]"));
        String row4Text=row4.getText();
        System.out.println("row4Text = " + row4Text);


    }
}