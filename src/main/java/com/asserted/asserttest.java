package com.asserted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class asserttest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String url="https://opensource-demo.orangehrmlive.com/";
		//Assert.assertTrue(driver.getCurrentUrl().equals(url));
		SoftAssert a =new SoftAssert();
		//a.assertTrue(driver.getCurrentUrl().equals(url));
		//a.assertEquals(driver.getCurrentUrl().equals(url), url);
		a.assertNotSame(driver.getCurrentUrl().equals(url), url);
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");

}
}