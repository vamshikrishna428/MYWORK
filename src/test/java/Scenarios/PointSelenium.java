package Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PointSelenium {
	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.t20worldcup.com/");
//		Point p=new Point(300, 200); 
//		driver.manage().window().setPosition(p); 
//		driver.get("https://www.flipkart.com/");
		
		
		
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		//	Point p=new Point(300, 200); 
		//	driver.manage().window().setPosition(p); 
		//	Thread.sleep(2000);

	}
}

