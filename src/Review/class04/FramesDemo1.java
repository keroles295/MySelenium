package Review.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesDemo1 {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //print the topic on the screen
        //we need to switch the fouce to this iframe by using index
        //switch to frame 1 which it index is 0
        driver.switchTo().frame(0);
        WebElement topic= driver.findElement(By.xpath("//b[@id='topic']"));
        String topicText=topic.getText();
        System.out.println("topicText = " + topicText);
        //go to drop down animals and select baby cat
        driver.switchTo().defaultContent();
        //switch to frame 2 which it index is 1
        driver.switchTo().frame(1);
        WebElement ddAnimails= driver.findElement(By.xpath(" //select[@id='animals']"));
        Select select=new Select(ddAnimails);
        select.selectByIndex(2);
        //click on Check box //input[@id='a']
        driver.switchTo().defaultContent();
        //switch to iframe 1 using webelement method
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        //OR// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
        //switch to iframe 3 by name or id
        driver.switchTo().frame("frame3");
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

}
}
