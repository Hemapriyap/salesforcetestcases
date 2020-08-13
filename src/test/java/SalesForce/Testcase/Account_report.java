package SalesForce.Testcase;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Account_report {

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
		    WebElement reportlastactivity =driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		    reportlastactivity.sendKeys(Keys.ENTER);
		    
		    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		    WebElement showacc=driver.findElement(By.id("scope-ext-gen18"));
		    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    showacc.click();
		    showacc.sendKeys(Keys.DOWN);
		    showacc.sendKeys(Keys.DOWN);
		    showacc.sendKeys(Keys.DOWN);
		    showacc.sendKeys(Keys.ENTER);
		   
		    WebElement datefield=driver.findElement(By.id("ext-gen148"));
		    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    datefield.click();
		    Thread.sleep(2000);
		    Robot rbdate=new Robot();
		    rbdate.keyPress(KeyEvent.VK_DOWN);
		    rbdate.keyRelease(KeyEvent.VK_DOWN);
		    //rbdate.keyPress(KeyEvent.VK_DOWN);
		    //rbdate.keyRelease(KeyEvent.VK_DOWN);
		    rbdate.keyPress(KeyEvent.VK_ENTER);
		    rbdate.keyRelease(KeyEvent.VK_ENTER);
		    
		    
		    WebElement from=driver.findElement(By.id("ext-gen152"));
		    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    from.click();
		    Thread.sleep(3000);
		    Robot rbfrom=new Robot();
		    rbfrom.keyPress(KeyEvent.VK_CONTROL);
		    //rbfrom.keyPress(KeyEvent.VK_DOLLAR);
		    rbfrom.keyPress(KeyEvent.VK_SPACE);
		    rbfrom.keyRelease(KeyEvent.VK_SPACE);
		    rbfrom.keyRelease(KeyEvent.VK_CONTROL);
		   
		    
		    WebElement to=driver.findElement(By.id("ext-gen154"));
		    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    Thread.sleep(3000);
		    to.click();
		    
		    
		    Thread.sleep(3000);
		    rbfrom.keyPress(KeyEvent.VK_CONTROL);
		    rbfrom.keyPress(KeyEvent.VK_SPACE);
		    rbfrom.keyRelease(KeyEvent.VK_SPACE);
		    rbfrom.keyRelease(KeyEvent.VK_CONTROL);
		    
		    WebElement save=driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    Thread.sleep(3000);
		    save.click();
		    
		    WebElement reportname=driver.findElement(By.id("saveReportDlg_reportNameField"));
		    reportname.sendKeys("Test Selenium");
		    
		    
		    WebElement uniquename=driver.findElement(By.id("saveReportDlg_DeveloperName"));
		    uniquename.clear();
		    uniquename.sendKeys("Test");
		    
		  
		    
		    WebElement saveandrun=driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]"));
		    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    Thread.sleep(3000);
		    saveandrun.click();
		    
		   

		    
		    
		    
		    
		  
		    
		  
		    
		    
		    
		    

	}

}
