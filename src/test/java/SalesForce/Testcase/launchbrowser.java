package SalesForce.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {
	
	public static WebDriver driver=null;
	public static WebDriver launchsalesforce(String sbrowser) throws Exception{
		switch (sbrowser) {
		case "ch":
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com/");
			//waitsecond(driver.findElement(By.xpath("//input[@id='username']")),10);
			WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
			username.clear();
			username.click();
			username.sendKeys("hema@abc.com");
			WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
			password.clear();
			password.click();
			password.sendKeys("adrive78");
			WebElement login= driver.findElement(By.xpath("//input[@id='Login']"));
			login.click();
		
			 
			break;

		default:
			break;
		}
		return driver;
		
	}
	public static void  waitsecond(WebElement ele,int itime) {
		 WebDriverWait wait=new WebDriverWait(driver,itime);
			wait.until(ExpectedConditions.visibilityOf(ele));
	}

}
