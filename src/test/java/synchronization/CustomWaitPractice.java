package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaitPractice
{
	@Test
	public void demo()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		while(true)
		{
			try
			{
				driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				driver.findElement(By.id("loginButton")).click();
				break;
			}
			catch(Exception e)
			{
				System.out.println("Element not found");
			}
		}
		driver.quit();
	}
	
	}
	


