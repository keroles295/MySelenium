package Review.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static String url = "https://www.ironspider.ca/forms/checkradio.htm";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //Select the Purple color
        //getall of the check boxes in alist
        List<WebElement> elementsList =driver.findElements(By.xpath("//input[@type='checkbox']"));
        //loop through
        for(WebElement checkBox:elementsList){
            String color=checkBox.getAttribute("value");
            //System.out.println("color = " + color);
            if(color.equalsIgnoreCase("Purple")){
                checkBox.click();
            }

        }

}
}