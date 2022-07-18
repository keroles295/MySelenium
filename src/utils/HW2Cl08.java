package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2Cl08 {
    //create a package and name it as utils
    //create a class and name as CommonMethods
    //create functions (methods) to open and quit the browsers
    //open method has to accept a url as a parameter
}
class CommonMethods{
    WebDriver driver=new ChromeDriver();
    public void openBrowser(String url){
        driver.get(url);
    }
    public void quiteBrowser(){
        driver.quit();
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        CommonMethods commonMethods=new CommonMethods();
        commonMethods.openBrowser("https://www.fb.com");
        commonMethods.quiteBrowser();
    }

}
