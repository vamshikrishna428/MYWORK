package FlipKartScenarios;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartS2 {
	@Test
	public void flipKartS2() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	

		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.setExperimentalOption("excludeswitches", new String[] {"enable-automation"});
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		ArrayList<String> list=new ArrayList<String>();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("phones"+Keys.ENTER);
		List<WebElement> allprices = driver.findElements(By.xpath("//div[@class='_3pLy-c row']/descendant::div[@class='_4rR01T']/parent::div[@class='col col-7-12']/following-sibling::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		List<Integer> price = new ArrayList<Integer>();
		for ( WebElement webElement : allprices) {
			String s = webElement.getText().substring(1);
			if(s.contains(","))
			{
				s=s.replace(",", "");
			}
			price.add(Integer.parseInt(s));
		}
		Collections.sort(price);
		System.out.println(price.size());
		for(Integer integer:price)
		{
			System.out.println(integer);
		}
		driver.quit();
		
		
	}
}


/*	
String s = "vamshi@9,499";
String[] s1 = s.split("@");
String s2 = s.substring(0,s.indexOf("@"));
System.out.println(s2);
*/


/*
String s = "vamshi@9,499";
String[] s1 = s.split("@");
String s2 = s.substring(1);

System.out.println(s2);	//9,499
*/

