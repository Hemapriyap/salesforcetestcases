package SalesForce.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_CheckRemeberme {

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
		
		
		WebElement rememberme= driver.findElement(By.xpath("//input[@id='rememberUn']"));
		rememberme.click();
		
		WebElement login= driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		
		
		WebElement dropdown= driver.findElement(By.id("userNav-arrow"));
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userNav-arrow"))));
		dropdown.click();
		
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
	}

}
