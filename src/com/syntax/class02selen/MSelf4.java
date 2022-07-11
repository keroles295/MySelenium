package com.syntax.class02selen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MSelf4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //how to buit Css Selecter--
        //Class name ------> tagname.classname
        //Id----> tagname#id-->
        //tagmame[attribute='value']
        //for example <input type="text"placeholder="Username" value="">
        //Input[placeholder='Username']
        //to wait some time the resalte we can use this method
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//
        //Xpath--->//Tagname[@attribute='value']
        //Xpath--->//Tagname[@attribute='value'][index] in case of duplicate=========do not recommend to try the index way
        // Css-------tagmame[attribute='value']:nth-child()  in case of duplicate=========do not recommend to try the index way
        //Xpath----anthorway----->//tagname(parent)/tagname(child)[index]
        //Css-----anthorway------>.className
        //Css-----anthorway------>tagName(parent) tagName(child)
        // Css----------->tagName[attribute='atteribute_value'](or)[attribute='atteribute_value']
        //Css---------->[attribute^='Prefix_ofattribute_value']





    }
}
