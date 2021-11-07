package automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@class=\"rct-collapse rct-collapse-btn\"]")).click();
		driver.findElement(By.xpath("(//button[@class=\"rct-collapse rct-collapse-btn\"])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Commands']")).click();

	   
	}

}
