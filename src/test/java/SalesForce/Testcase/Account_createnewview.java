package SalesForce.Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Account_createnewview {

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
		    WebElement elenew =driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
			elenew.sendKeys(Keys.ENTER);
			
			
			WebElement viewname=driver.findElement(By.xpath("//input[@id='fname']"));
			viewname.clear();
			viewname.sendKeys("september");
			
			
			
			WebElement uniqueView=driver.findElement(By.xpath("//input[@id='devname']"));
			uniqueView.clear();
			uniqueView.sendKeys("sep");
			
			
			WebElement savebtn=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
			savebtn.sendKeys(Keys.ENTER);
			
           
	}

}
