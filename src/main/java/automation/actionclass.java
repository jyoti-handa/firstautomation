package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.udemy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		WebElement categories=driver.findElement(By.xpath("//span[text()='Categories']"));
		a.moveToElement(categories).click().build().perform();

		WebElement dev=driver.findElement(By.xpath("//div[text()='Development']"));
		a.moveToElement(dev).click().build().perform();
		WebElement block=driver.findElement(By.xpath("//div[text()='Web Development']"));
		a.moveToElement(block).click().build().perform();
		WebElement chain=driver.findElement(By.xpath("//div[text()='JavaScript']"));
		a.moveToElement(chain).click().build().perform();
*/
		
		driver.get("https://www.medplusmart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		WebElement box=driver.findElement(By.id("enterval"));
		Actions a= new Actions(driver);
		a.moveToElement(box).sendKeys("dolo650").perform();


	}

}

