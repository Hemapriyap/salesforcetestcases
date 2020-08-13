package SalesForce.Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Account_Merge {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
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
		
		
		WebElement accounts=driver.findElement(By.xpath("//a[.='Accounts']"));		
			accounts.click();
			
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
			WebElement merge=driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));		
			merge.sendKeys(Keys.ENTER);	
			
			
			
			WebElement mergerecords=driver.findElement(By.xpath("//input[@id='srch']"));
			mergerecords.clear();
			mergerecords.sendKeys("Au");
			
			
			WebElement fndrecords=driver.findElement(By.xpath("//input[@value='Find Accounts']"));
			fndrecords.click();
			
			
			WebElement clknext=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]"));
			clknext.click();
			
			
			
			WebElement merged=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
			merged.click();
			
			Alert al = driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
			
	}

}
