package Review.sele02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
    public static String url = "https://demo.guru99.com/test/radio.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //accessing the webelement radiobutton option3
        WebElement option3= driver.findElement(By.xpath("//input[@value='Option 3']"));
        //check if the radio is selected
        boolean state=option3.isSelected();
        System.out.println("state of the radio button = " + state);
        //check if the radio button is displayed
        boolean displayed=option3.isDisplayed();
        System.out.println("Is the radio button is displayed = " + displayed);
        //check if the radio button is enabled
        boolean enabled=option3.isEnabled();
        System.out.println("Is radio button is enabled = " + enabled);


    }
}