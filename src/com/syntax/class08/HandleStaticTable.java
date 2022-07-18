package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticTable {

    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        //bring all of the data from the table and print
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement>rowData=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowData.size());
        Iterator<WebElement> it= rowData.iterator();
        while (it.hasNext()){
            WebElement row= it.next();
            String rowText=row.getText();
            System.out.println("rowText = " + rowText);
        }
        System.out.println("_____________________________________");
        List<WebElement>colmsData=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        for (WebElement colmsDatum : colmsData) {
            String colDatumTest=colmsDatum.getText();
            System.out.println("colDatumTest = " + colDatumTest);
        }


}
}