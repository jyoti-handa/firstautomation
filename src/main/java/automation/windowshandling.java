package automation;
	import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class windowshandling {
		public static String parent,linkeIn,facebook;
		private static Set<String> all;
		public static Iterator<String> i;
		

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.manage().window().maximize();
			parent=driver.getWindowHandle();
			System.out.println(parent);
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//img[@alt=\"LinkedIn OrangeHRM group\"]")).click();
			all=driver.getWindowHandles();
			i=all.iterator();
			while(i.hasNext())   for(;i.hasNext();)
				{
						linkeIn=i.next();
						if(!parent.equals(linkeIn))
						{
							System.out.println(linkeIn);
							driver.switchTo().window(linkeIn);
						}
				}
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.id("email-address")).sendKeys("Admin");
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.xpath("//img[@alt=\"OrangeHRM on Facebook\"]")).click();
			System.out.println(driver.getTitle());
			all=driver.getWindowHandles();
			i=all.iterator();
			while(i.hasNext())
				{
						facebook=i.next();
						if(!parent.equals(facebook))
						{
							System.out.println(facebook);
							driver.switchTo().window(facebook);
						}
				}
			System.out.println(driver.getTitle());
			driver.switchTo().window(linkeIn);
			driver.findElement(By.id("password")).sendKeys("Admin");
			driver.switchTo().window(facebook);
			driver.findElement(By.id("email")).sendKeys("Admin");
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//input[contains(@name,'Submit')]")).click();
			driver.switchTo().window(facebook);
			driver.findElement(By.id("pass")).sendKeys("Admin");
	}
		
	}


