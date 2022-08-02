package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RecapPaginationTable {
    public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) throws InterruptedException {
        //bring all of the data from the table and print
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement>rowsData=driver.findElements(By.xpath("//tbody[@id='myTable']"));
        WebElement nextButton=driver.findElement(By.xpath("//a[@class='next_link']"));
        boolean nextShowPage=true;
        while (nextShowPage){
            for (WebElement rowsDatum : rowsData) {
                String rowText = rowsDatum.getText();
                if (rowText.contains("Bob V")) {
                    System.out.println("rowText = " + rowText);
                    nextShowPage = false;
                    break;
                }
            }
            if (nextShowPage) {
                    nextButton.click();
                }

        }




















}
}
