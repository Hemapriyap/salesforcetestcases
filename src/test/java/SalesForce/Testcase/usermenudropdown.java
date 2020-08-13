package SalesForce.Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usermenudropdown extends launchbrowser {

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
		
		WebElement dropdown= driver.findElement(By.id("userNav-arrow"));
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userNav-arrow"))));
		dropdown.click();
		
	WebElement myprofile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
	myprofile.click();
	 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
	 
	WebElement editicon=driver.findElement(By.xpath("//img[@src='/img/func_icons/util/pencil12.gif']"));
	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	editicon = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/img/func_icons/util/pencil12.gif']\"")));
	
	editicon.click();
	
	
	//Web=
	WebElement abouttab=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']//a[contains(text(),'About')]"));
	Thread.sleep(1000);
	
	//driver.switchTo().alert().sendKeys(abouttab);;
	
	//WebElement abouttab=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
	//abouttab.click();
	
	}

}
 