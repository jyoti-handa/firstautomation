
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript1 {

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
		
		//to get url
		String urlvalue=js.executeScript("return document.URL;").toString();
		System.out.println(urlvalue);
		// to hit url
		//to scroll up and down
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(document.body.scrollHeight,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-3000,0)");
		//to refresh
Thread.sleep(2000);
		js.executeScript("history.go(0)");
		js.executeScript("window.location ='https://www.softwaretestingmaterial.com");
	}

}