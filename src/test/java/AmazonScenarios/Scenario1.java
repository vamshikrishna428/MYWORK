package AmazonScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1 {
	@Test
	public void scenario() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		int index=3;
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics' and contains(.,'Electronics')]")).click();
		Thread.sleep(5000);
		List<WebElement> tags = driver.findElements(By.xpath("//button"));
		int count = tags.size();
		System.out.println(count);
		for (int i = 0; i <tags.size(); i++) {
			String links = tags.get(i).getText();
			System.out.println(links);
		}
		if(index<=count)
		{
			tags.get(index).click();
		}
		else
		{
			System.out.println("your entered index is greather than the count present");
		}
		
	}
}
