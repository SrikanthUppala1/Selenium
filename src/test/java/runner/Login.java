package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws Exception
	{
		// Open browser and launch site..
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.almondhouse.com/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("uppalasrikanth1@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Srikanth@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		try
		{
			driver.findElement(By.xpath("//img[@alt='Almond Close']")).click();
		}
		catch (Exception ex)
		{
			System.out.println("Done");
		}
		driver.findElement(By.tagName("li")).click();
		driver.findElement(By.xpath("//div[@class='row']//div[@class='col-4 view-pop'][normalize-space()='VIEW ALL']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@class='link-items pl-0']")).click();
		
		
		

	}

}
