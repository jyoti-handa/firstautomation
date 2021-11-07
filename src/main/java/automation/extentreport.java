package automation;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class extentreport {
	public static ExtentReports report;
	public static ExtentTest test;
	public static int i=0;
	public static ChromeDriver driver;
	@BeforeSuite
	public void start()
	{
	report=new ExtentReports(".//reports//FirstBatch.html",true);
	report.addSystemInfo("US1060","OranageHRMLoginPage");
	report.addSystemInfo("Author","ramarao");
	report.addSystemInfo("Environment","QA");
	test=report.startTest("To verify the OrangeHRMLoginpageValidation");
	}
	
	@Test
public void orangeLogin() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Desktop\\jyoti_training//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	test.log(LogStatus.PASS, "Webpage is loaded"+test.addScreenCapture(snap()));
	driver.manage().window().maximize();
	test.log(LogStatus.PASS, "OrangeHRMWebsite is maximized"+test.addScreenCapture(snap()));
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	test.log(LogStatus.PASS, "Entered Username"+test.addScreenCapture(snap()));
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	test.log(LogStatus.PASS, "EnteredPassword"+test.addScreenCapture(snap()));
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	test.log(LogStatus.PASS,"User clicked on Login button and seeing homepage"+test.addScreenCapture(snap()));
}
	@AfterSuite
	public void finsh()
	{
		report.endTest(test);
		report.flush();
	}
	
	public String snap() throws IOException
	{
		Random r=new Random();
		String dummy=null;
		if(r.nextInt()!=0)
		{
			i=i+1;
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File(".//pics//img"+i+".png");
			FileUtils.copyFile(src, dest);
			dummy=dest.getAbsolutePath();
			
		}
		return dummy;
	}
	
}