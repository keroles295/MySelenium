package Review.sele02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {
    public static String url="https://demo.guru99.com/insurance/v1/register.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //access the text box by using absoulte xpath
        WebElement surname= driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        surname.sendKeys("Botros");
        //accessing the first name using xpath
        WebElement firstName= driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
        firstName.sendKeys("Pietro");
        //accessing the birth day date text
        WebElement dateOfBirth= driver.findElement(By.xpath("//label[text() = 'Date of Birth']"));
        String dateofBTest=dateOfBirth.getText();
        System.out.println("dateofBTest = " + dateofBTest);
        WebElement lisence= driver.findElement(By.xpath("//label[contains(@for,'user_licenceperiod')]"));
        System.out.println(lisence.getText());
        //access radio button
        WebElement radiobuton=driver.findElement(By.xpath("//label[contains(text(),'Full')]/following-sibling::label"));
        radiobuton.click();
        //access phone number
        WebElement phoneNum= driver.findElement(By.cssSelector("input#user_phone"));
        phoneNum.sendKeys(")128648679");
        //access adrees
        WebElement address =driver.findElement(By.cssSelector("input[id*='user_address_attributes_street']"));
        address.sendKeys("Egypt is history of the history");


    }
}
