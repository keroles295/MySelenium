package studymyself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RecapHandlingPaginationsTable {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
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
        WebElement pimButton=driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();
        WebElement addEmployee= driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
        addEmployee.click();
        WebElement firstName=driver.findElement(By.id("firstName"));
        firstName.sendKeys("P");
        WebElement midleName=driver.findElement(By.id("middleName"));
        midleName.sendKeys("K");
        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys("BB");
        WebElement empID=driver.findElement(By.id("employeeId"));

        String empIDFieled= empID.getAttribute("value");
        System.out.println("empIDFieled = " + empIDFieled);
        WebElement saveButton=driver.findElement(By.id("btnSave"));
        saveButton.click();
        WebElement employeeList=driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeList.click();
        List<WebElement> rowsData=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        boolean employeeNotFound=true;
        for(int i=0; i< rowsData.size(); i++){
           String rowText= rowsData.get(i).getText();
           employeeNotFound=false;
           if(rowText.contains(empIDFieled)){
               WebElement checkBox=driver.findElement(By.xpath(
                       "//table[@id='resultTable']/tbody/tr["+i+"]/td[1]"));
               checkBox.click();
               WebElement deletEmployee=driver.findElement(By.id("btnDelete"));
               deletEmployee.click();
               WebElement cofirmButton=driver.findElement(By.id("dialogDeleteBtn"));
               cofirmButton.click();

               break;
           }
        }
        if(employeeNotFound){
            WebElement nextButton=driver.findElement(By.linkText("Next"));
            nextButton.click();
        }









}
}
