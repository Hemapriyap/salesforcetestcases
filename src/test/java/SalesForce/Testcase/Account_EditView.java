package SalesForce.Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Account_EditView {

	public static void main(String[] args) throws Exception {
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
		    WebElement elenew =driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
			elenew.sendKeys(Keys.ENTER);
			//input[2id='fname']
			
			WebElement viewname=driver.findElement(By.xpath("//input[@id='fname']"));
			System.out.println(viewname.getText());
			viewname.clear();
			viewname.sendKeys("August2020");
			
			
			
			WebElement uniqueView=driver.findElement(By.xpath("//input[@id='devname']"));
			System.out.println(uniqueView.getText());
			uniqueView.clear();
			uniqueView.sendKeys("Aug2020");
			
			
			WebElement field=driver.findElement(By.xpath("//select[@id='fcol1']"));
			Select selfield=new Select (field);
			selfield.selectByIndex(1);
			
			WebElement operator=driver.findElement(By.xpath("//select[@id='fop1']"));
			Select seloperator=new Select (operator);
			seloperator.selectByValue("c");
			
			//input[@id='fval1']
			WebElement selvalue=driver.findElement(By.xpath("//input[@id='fval1']"));
			selvalue.clear();
            selvalue.sendKeys("a");
			
         
            WebElement editsave=driver.findElement(By.xpath(" //div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]"));
            editsave.sendKeys(Keys.ENTER);
	}

}
