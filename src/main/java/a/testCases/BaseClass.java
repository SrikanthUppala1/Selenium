package a.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;

	@BeforeClass
	public void setUp() //String browser (using diff brs iniate with "String browser")
	{
//		if(browser.equals("chrome")) 
//		{
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		else if(browser.equals("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}
//		else if(browser.equals("ie"))
//		{
//			WebDriverManager.iedriver().setup();
//			driver = new InternetExplorerDriver();
//		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.almondhouse.com/");
		try
		{
			driver.findElement(By.xpath("//img[@alt='Almond Close']")).click();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
