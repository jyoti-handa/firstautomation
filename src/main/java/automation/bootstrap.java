package automation;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap {

	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=14.0_1");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
		      List<WebElement>list =driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

		       for (WebElement element : list)
			      {
			         if(element.getText().equals("CSS"))
			         {
			            element.click();
			            Thread.sleep(3000);
			            System.out.println("Element Clicked");
			            break;
			         }
			         System.out.println(element.getText());
			      }
}
}
