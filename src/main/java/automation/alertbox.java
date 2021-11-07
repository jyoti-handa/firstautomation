package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class alertbox {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
		getScreenshot(driver);
		alert.dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		alert.sendKeys("yes");
		alert.accept();
	}

	private static void getScreenshot(WebDriver driver)throws IOException
	
	{
		// TODO Auto-generated method stub
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("C:\\Users\\Rohit\\Desktop\\vansh\\screenshot.png"));
		
	}

}
