package SalesForce.Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class create_account extends launchbrowser {

	public static void main(String[] args) throws Exception {
		
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
		
		
		WebElement accounts=driver.findElement(By.xpath("//a[.='Accounts']"));
		
		
			accounts.click();
			
			 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		WebElement elenew =driver.findElement(By.xpath("//input[contains(@value,'New')]"));
		elenew.sendKeys(Keys.ENTER);
		
		
		WebElement accname=driver.findElement(By.xpath("//input[@id='acc2']"));
		accname.clear();
		accname.sendKeys("dog");
		
		WebElement acctype=driver.findElement(By.xpath("//select[@id='acc6']"));
		Select type =new Select(acctype);
		type.selectByValue("Technology Partner");
		
		WebElement accpriority=driver.findElement(By.xpath("//select[@id='00N3t00000C9XaZ']"));
		Select priority= new Select(accpriority);
		priority.selectByIndex(1);
		
		WebElement accsave=driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"));
		accsave.sendKeys(Keys.ENTER);;
		
		
		
		
		
		
		
	}
}
