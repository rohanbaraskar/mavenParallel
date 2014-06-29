package simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 extends BaseBrowser {
	@Test
	public void Test1(){
		
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.close();
		driver.quit();
		
	}

}
