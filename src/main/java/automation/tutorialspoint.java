package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.InvalidArgumentException;

public class tutorialspoint {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vansh");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Handa");
			driver.findElement(By.xpath("//input[@name='sex']")).click();
			WebElement male= driver.findElement(By.xpath("//input[@name='sex']"));
			
			System.out.println(male.isSelected());
			//male.click();
			driver.findElement(By.xpath("(//input[@name='exp'])[4]")).click();
			driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("02oct2021");
			WebElement user= driver.findElement(By.xpath("(//input[@name='profession'])[2]"));
			user.click();
			System.out.println(user.isEnabled());
			//driver.findElement(By.xpath("//input[@name='photo']")).click();
			driver.findElement(By.xpath("(//input[@name='tool'])[2]")).click();
			WebElement continents= driver.findElement(By.xpath("//select[@name='continents']"));
			Select s=new Select(continents);
			s.selectByVisibleText("Australia");
			WebElement browser= driver.findElement(By.xpath("//select[@name='selenium_commands']"));
			Select s1=new Select(browser);
			s1.selectByVisibleText("Browser Commands");
			driver.findElement(By.name("submit")).click();
			
	}

}
