package chromeOptions;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveAutomationMsgBar 
{
	
	@Test
	public void demo() throws InterruptedException 
	{
	ChromeOptions option = new ChromeOptions();  
    
	option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(option);
	
    driver.manage().window().maximize();
	driver.get("https://www.ajio.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	driver.quit();
	}


}
