package automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testihg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("firstName")).sendKeys("Vansh");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vansh");
		driver.findElement(By.id("lastName")).sendKeys("Handa");
		driver.findElement(By.id("email")).sendKeys("handavansh@gmail.com");
		driver.findElement(By.id("confirmEmail")).sendKeys("handavansh@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Handavansh$");
		driver.findElement(By.id("confirmPassword")).sendKeys("Handavansh$");
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select s=new Select(country);
		s.selectByValue("CA");
		List<WebElement> all = s.getOptions();
		Iterator<WebElement> i = all.iterator();
		while(i.hasNext())
		{
			String name=i.next().getText();
			System.out.println("Country name is"+name);
		}
		System.out.println("Total Countries"+all.size());
	    //s.selectByVisibleText("Canada");
		//Select drpCountry=new Select(driver.findElement(By.id("country")));
		//drpCountry.selectByVisibleText("Canada");
		//driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.id("address1")).sendKeys("51");
		driver.findElement(By.id("address2")).sendKeys("Herdwick street");
		driver.findElement(By.id("city")).sendKeys("Brampton");
		driver.findElement(By.id("stateList")).sendKeys("Ontario");
		driver.findElement(By.id("zipCode")).sendKeys("L6S 6L6");
		driver.findElement(By.className("filterCheckboxRect")).click();
		driver.findElement(By.xpath("//input[@className='filterCheckboxRect']")).click();
		driver.findElement(By.className("hThree w-100t")).click();
		
		
	}

}
//*[@id="Layer_1"]//*[@id="Layer_1"]