package SalesForce.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_forgotpassword {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		
		
		WebElement forgotpwd= driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		forgotpwd.click();
		WebElement username= driver.findElement(By.xpath("//input[@id='un']"));
				username.clear();
				username.click();
				username.sendKeys("hema@abc.com");
		WebElement continuebtn= driver.findElement(By.xpath("//input[@id='continue']"));
		continuebtn.click();
				
				
				
				
				
				
				
	}

}
