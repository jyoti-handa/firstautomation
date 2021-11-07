package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationclass {

	public static void main(String[] args) {
		

		launcher();
	}
	public static void launcher()
	{
			System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/text-box");
			WebElement fullName=driver.findElement(By.id("userName"));
			fullName.sendKeys("Jyoti");
			WebElement sb=driver.findElement(By.xpath("//button[@id='submit']"));
			sb.click();
			
	}
}

