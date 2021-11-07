package automation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		loop1:
		for(int i=1;i<rows.size();i++)
		{
		List<WebElement> coloumns=rows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<coloumns.size();j++)
		{
		String company=coloumns.get(0).getText();
		if(company.equals("Island Trading"))
		{
		System.out.println(coloumns.get(1).getText());
		break loop1;
		}
		}
		}

	}

}
