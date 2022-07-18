package studymyself.My;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RecapForClass05 {
    public static String url = "http://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> options=driver.findElements(By.className("cb1-element"));
        int size= options.size();
        System.out.println("size = " + size);
        for(WebElement option:options){
           // option.click();
            String optionValue=option.getAttribute("value");
            //System.out.println("optionValue = " + optionValue);
            if(optionValue.equals("Option-3")){
                option.click();
                break;
            }


        }
        Thread.sleep(5000);
        url="https://syntaxprojects.com/basic-select-dropdown-demo.php";
        driver.get(url);
        WebElement selectDD= driver.findElement(By.id("select-demo"));
        Select select=new Select(selectDD);
        //select.selectByIndex(2);
        //Thread.sleep(2000);
       // select.selectByValue("Tuesday");
       // Thread.sleep(2000);
       // select.selectByVisibleText("Wednesday");
        List<WebElement> alloption=select.getOptions();
        int sizee=alloption.size();
        System.out.println("alloption = " + sizee);
        //for(WebElement option:alloption){
           // String optionText= option.getText();
           // System.out.println("optionText = " + optionText);
           // select.selectByVisibleText(optionText);
           // Thread.sleep(1000);
        //}
        for(int i=1; i<sizee; i++){
            String optionn=alloption.get(i).getText();
            System.out.println("optionn = " + optionn);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }
        url="https://www.target.com/";
        driver.get(url);
        WebElement allDepartement=driver.findElement(By.xpath("//a[@aria-label='Categories']"));
        allDepartement.click();
        Select selectW=new Select(allDepartement);
        List<WebElement> departementW=selectW.getOptions();
        for(WebElement departementName:departementW){
            String departName=departementName.getText();
            System.out.println("departName = " + departName);
        }



    }
}