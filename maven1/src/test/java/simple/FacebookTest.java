package simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class FacebookTest extends BaseBrowser {
	@Test(priority = 1)
	public void TitleCheck(){
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		String expTitle ="Welcome to Facebook - Log In, Sign Up or Learn More";
		
		
		Assert.assertEquals(driver.getTitle(), expTitle);
	
		//driver.findElement(By.id("gs_htif0")).sendKeys("selenium");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		}
	@Test (priority = 2)
	public void enterTextbox() throws Exception{
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String usrname = GenericExcelRead.getCellValue("C:\\new.xls","Sample sheet",9,0);
		String pswd = GenericExcelRead.getCellValue("C:\\new.xls","Sample sheet",9,1);
		driver.findElement(By.name("firstname")).sendKeys(usrname);
		driver.findElement(By.name("lastname")).sendKeys(pswd);
		
		String expTitle ="Welcome to Facebook - Log In, Sign Up or Learn More";
		
		
		Assert.assertEquals(driver.getTitle(), expTitle);
	
		
		
		}
	@Test (priority = 3)
	public void chooseBday() throws Exception{
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String month = GenericExcelRead.getCellValue("C:\\new.xls","Sample sheet",10,0);
		String day = GenericExcelRead.getCellValue("C:\\new.xls","Sample sheet",10,1);
		String year = GenericExcelRead.getCellValue("C:\\new.xls","Sample sheet",10,2);
		
		Select dropdownMonth = new Select(driver.findElement(By.name("birthday_month")));
		Select dropdownDay = new Select(driver.findElement(By.name("birthday_day")));
		Select dropdownYear = new Select(driver.findElement(By.name("birthday_year")));
		
		dropdownMonth.selectByVisibleText(month);
		dropdownDay.selectByVisibleText(day);
		dropdownYear.selectByVisibleText(year);
		
		
		
		
		String expTitle ="Welcome to Facebook - Log In, Sign Up or Learn More";
		
		
		Assert.assertEquals(driver.getTitle(), expTitle);
	
		
		
		}
	@Test (priority = 4)
	public void selectSex() throws Exception{
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String x = GenericExcelRead.getCellValue("C:\\new.xls","Sample sheet",11,0);
		
		driver.findElement(By.id("u_0_e")).click();
		
		String expTitle ="Welcome to Facebook - Log In, Sign Up or Learn More";
		
		
		Assert.assertEquals(driver.getTitle(), expTitle);
	}
	
	@Test (priority = 5)
	public void selectchkbox() throws Exception{
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		driver.findElement(By.name("persistent")).click();
		
		String expTitle ="Welcome to Facebook - Log In, Sign Up or Learn More";
		
		
		Assert.assertEquals(driver.getTitle(), expTitle);
	}

	@Test (priority = 6)
	public void navigateLink() throws Exception{
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		WebElement link1= driver.findElement(By.linkText("People"));
		link1.click();
		
		Thread.sleep(3000);
		
		String acttext= driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div[1]/div[1]/h2")).getText();
		
	
		Assert.assertEquals(acttext,"Browse by Name");
		
		String searchPage  = GenericExcelRead.getCellValue("C:\\new.xls","Sample sheet",12,0);
		
		driver.findElement(By.id("q_dashboard")).sendKeys(searchPage);
		
		WebElement link2= driver.findElement(By.linkText("Search"));
		link2.click();
		driver.findElement(By.id("q_dashboard")).sendKeys(searchPage);
		
		
	}
	
		

@Test (priority = 7)
public void validLogin() throws Exception{
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	String email = GenericExcelRead.getCellValue("C:\\new.xls","Sample sheet",13,0);
	String passowrd = GenericExcelRead.getCellValue("C:\\new.xls","Sample sheet",13,1);
	
	
	
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(email);
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(passowrd);
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	
	String actWlcomeName=driver.findElement(By.xpath(".//*[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]")).getText();
	

	Assert.assertEquals(actWlcomeName,"Rohan Baraskar");
	
	
	
	
}
	
}
