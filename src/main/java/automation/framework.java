package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framework {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		//WebElement frameobj = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//driver.switchTo().frame(frameobj);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
	}
}
