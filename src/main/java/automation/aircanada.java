package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aircanada {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aircanada.com/ca/en/aco/home.html#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@id='tripTypeField']/following::span")).click();
		 List<WebElement>list =driver.findElements(By.xpath("//ul[@id='tripTypeId']/li"));

	       for (WebElement element : list)
		      {
		         if(element.getText().equals("One-way"))
		         {
		            element.click();
		            Thread.sleep(3000);
		            System.out.println("Element Clicked");
		            break;
		       
		      }
	
	}

}
}
