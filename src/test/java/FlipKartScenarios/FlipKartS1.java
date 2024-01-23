package FlipKartScenarios;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartS1 {
	@Test
	public void flipKartS1() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ArrayList<String> list = new ArrayList<String>();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("phones"+Keys.ENTER);
		List<WebElement> allnames = driver.findElements(By.xpath("//div[@class='_3pLy-c row']/descendant::div[@class='_4rR01T']"));
		for (int i = 0; i < allnames.size(); i++) {
			String text = allnames.get(i).getText();
			list.add(text);
		}
		Collections.sort(list);
		for(String allist:list)
		{
			System.out.println(allist);
		}
		
	}
}

