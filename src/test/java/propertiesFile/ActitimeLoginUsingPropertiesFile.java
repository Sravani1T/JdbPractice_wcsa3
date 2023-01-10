package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLoginUsingPropertiesFile 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		Properties p = new Properties();
		p.load(fis);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url1"));
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username1"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password1"));
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		
		if(driver.getTitle().contains("actiTIME"))
		{
			System.out.println("login page displayed");
		}
		else
		{
			System.out.println("login page not displayed");
		}
		
		driver.quit();
			
			
		}
		
		
	}


