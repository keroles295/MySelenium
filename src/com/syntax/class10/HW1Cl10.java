package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW1Cl10 {
    /*HW
       Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        click on leave
        click on leave list
          choose from "From calendar"
        choose from "To calendar"
          click only on cancelled and rejected checkboxes
         uncheck Pending Approval
        select IT support from DD
       click search
       quit the browser
 */
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static <TakingScreenShot> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        // click on leave
        WebElement leaveButton=driver.findElement(By.xpath("//b[text()='Leave']"));
        leaveButton.click();
        //click on leave list
        WebElement leaveListButton=driver.findElement(By.linkText("Leave List"));
        leaveListButton.click();

        // choose from "From calendar"
        WebElement fromCalendar=driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        WebElement monthDDF=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select1= new Select(monthDDF);
        select1.selectByVisibleText("May");
        WebElement yearDDF=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select2=new Select(yearDDF);
        select2.selectByVisibleText("2023");
        List<WebElement> daysFrom=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement dayFrom : daysFrom) {
            String dayFromText=dayFrom.getText();
            if(dayFromText.equals("27")){
                dayFrom.click();

                break;
            }
        }
        //choose from "To calendar"
        WebElement toCalender=driver.findElement(By.id("calToDate"));
        toCalender.click();

        WebElement monthDDTo=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select3=new Select(monthDDTo);
        select3.selectByVisibleText("Apr");

        WebElement yearDDTo=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select4=new Select(yearDDTo);
        select4.selectByVisibleText("2025");

        List<WebElement> daysToCalender=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement dayToCal: daysToCalender) {
            String datToText=dayToCal.getText();
            if (dayToCal.equals("19")){
                dayToCal.click();
                break;
            }
        }
        //click only on cancelled and rejected checkboxes
        WebElement pendingCheckBox=driver.findElement(By.id("leaveList_chkSearchFilter_1"));
        pendingCheckBox.click();


        WebElement cancelCheckBox=driver.findElement(By.id("leaveList_chkSearchFilter_0"));
        cancelCheckBox.click();
        WebElement rejectedCheckBox=driver.findElement(By.id("leaveList_chkSearchFilter_-1"));
        rejectedCheckBox.click();


        //select IT support from DD
        WebElement dubUnitDD=driver.findElement(By.id("leaveList_cmbSubunit"));
        Select select=new Select(dubUnitDD);
        select.selectByVisibleText("IT Support");
        //click search
        WebElement searchButton=driver.findElement(By.id("btnSearch"));
        searchButton.click();
        TakesScreenshot st=(TakesScreenshot)driver;
        File sccFile=st.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sccFile, new File("screenshots/SmartBear/HWSearchpage.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //       quit the browser
        driver.quit();































    }

}