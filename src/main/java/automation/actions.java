package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('txtUsername').value='Admin';");
		WebElement user=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		js.executeScript("arguments[0].value='admin123';",user);
		js.executeScript("document.getElementById('btnLogin').click()");
		Actions a= new Actions(driver);
		WebElement leave=driver.findElement(By.xpath("//b[text()='Leave']"));
		WebElement ent=driver.findElement(By.xpath("//a[text()='Entitlements']"));
		WebElement addEnt=driver.findElement(By.xpath("//a[text()='Add Entitlements']"));
		a.moveToElement(leave).moveToElement(ent).moveToElement(addEnt).click().build().perform();




	}

}
