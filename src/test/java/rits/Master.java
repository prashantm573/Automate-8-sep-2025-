package rits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Master {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
      WebDriver driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
      driver.get("http://192.168.4.57/rits/userLogin");
      
     // Login 
      WebElement  Login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='normal_login_email']")));
    		Login.sendKeys("its.ayushb@icyberpro.in");
      driver.findElement(By.xpath("//input[@id='normal_login_password']")).sendKeys("Abcd@1234");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      
      String title   =  driver.getTitle();
      if (title.equalsIgnoreCase("RITS")) {
    	  System.out.println("DashboardLoaded");
      }
      else {
    	  System.out.println("Test Failed");
      }
     // Thread.sleep(5000);
      driver.findElement(By.xpath("//i[text()='edit']")).click();
     // Thread.sleep(5000);
      driver.findElement(By.xpath("//a[text()='Incident']")).click();
   //   Thread.sleep(3000);
      driver.findElement(By.xpath("//span[text()='SMS']")).click();
      driver.findElement(By.xpath("//span[text()='Enterprise']")).click();
    //  Thread.sleep(5000);
      driver.findElement(By.xpath("//button[@class='ant-btn text-uppercase text-white flex-align-center-center float-right ant-btn-primary']")).click();
         WebElement text = driver.findElement(By.xpath("//h6[text()='Create New Incident']"));
 
         if (text.isDisplayed()) {
        	 System.out.println("Enter Reporters Details");
         }
         
         else {
        	 System.out.println("Failed");
         }
         driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("Testautom@icybepro.in");
         driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("YOCO.PVT.LTD");
         driver.findElement(By.xpath("//input[@id='company_url']")).sendKeys("WWW.YOCOfoods.com");
         driver.findElement(By.xpath("//input[@id=\"company_individual_address\"]")).sendKeys("R.K. Puram, Delhi,India");
        // String id =  driver.getWindowHandle();
         //System.out.println(id);
        
          }
           
       
    
	}


