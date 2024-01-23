package FlipKartScenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorsHub {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,800);");

		driver.switchTo().frame("pact");

		//ref=document.querySelector("#snacktime").shadowRoot.querySelector("#tea").value='vamshi krishna';

		//		Shadow github=new Shadow(driver);
		//		WebElement element = shadow.findElement("return document.querySelector('#snacktime').shadowRoot.querySelector('#tea');");
		//		System.out.println(element.getText());

		WebElement search_box = (WebElement) js.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('#tea').value=('vamshi');");
		js.executeScript("arguments[0]", search_box);	// only this method works 
		driver.switchTo().defaultContent();
		//.value='yes's
		Thread.sleep(3000);
		//		String jse = "arguments[0].setAttribute('value','pdf')";
		//        ((JavascriptExecutor) driver).executeScript(jse, search_box);

		js.executeScript("window.scrollTo(0,800);");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./test-output/ss.png");
		FileUtils.copyFile(src, dest);

		driver.quit();

	}


}
