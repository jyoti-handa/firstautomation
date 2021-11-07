package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement From=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement To=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);					
        act.dragAndDrop(From, To).build().perform();	
        */
		/*driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='impressiveRadio']/parent::div/label")).click();
		*/
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("firstName")).sendKeys("Vansh");
		driver.findElement(By.id("lastName")).sendKeys("Handa");
		driver.findElement(By.id("userEmail")).sendKeys("handa140@gmail.com");
		driver.findElement(By.xpath("//label[text()=\"Male\"]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9059652076");
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement month= driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s=new Select(month);
		s.selectByVisibleText("May");
		WebElement year= driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s1=new Select(year);
		s1.selectByVisibleText("2014");
        driver.findElement(By.xpath("(//div[@class='react-datepicker__week'])[2]/div[5]")).click();
	
		
	}
	

}
