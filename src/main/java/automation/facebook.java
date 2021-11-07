package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vansh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Handa");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9059652076");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9059652076");
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		s.selectByVisibleText("May");
		WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1=new Select(day);
		s1.selectByVisibleText("8");
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2014");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
}
}