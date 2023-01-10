package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDisabledElement 
{
	@Test
	public void demo() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AMARSRAVANI/Desktop/Disabled.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.id("abc"));
		if(element.isEnabled())
		{
			System.out.println("Enabled");
			
		}
		else
		{
			System.out.println("Disabled");
		}

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('abc').value='Selenium'");
		Thread.sleep(3000);
		driver.quit();
				
	}
	

}
