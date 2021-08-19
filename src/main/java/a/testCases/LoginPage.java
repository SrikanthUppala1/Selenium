package a.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='header-bdb']//a[2]")
	@CacheLookup
	WebElement clcicksignin;
	
	@FindBy(xpath="//input[@placeholder='Enter Email ID']")
	@CacheLookup
	WebElement enteremailid;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement enterpassword;
	
	@FindBy(xpath="//button[normalize-space()='LOGIN']")
	@CacheLookup
	WebElement clicklogin;
	
	@FindBy(xpath="//li[normalize-space()='SHOP']")
	@CacheLookup
	WebElement clickshop;	
	
	@FindBy(css="div[class='row'] div[class='col-4 view-pop']")
	@CacheLookup
	WebElement clickviewall;
	
	public void clickOnSignIn() throws InterruptedException
	{
		Thread.sleep(5000);
		clcicksignin.click();
	}
	
	public void enterOnEmailId() throws InterruptedException
	{
		Thread.sleep(2000);
		enteremailid.sendKeys("uppalasrikanth1@gmail.com");
	}
	
	public void enterOnPassword() throws InterruptedException
	{
		Thread.sleep(1000);
		enterpassword.sendKeys("Sri@8008");
	}
	
	public void clickOnLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		clicklogin.click();
		
	}
	public void closeBanner() throws InterruptedException
	{
		Thread.sleep(9000);
	try
	{
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
    }
	public void clickOnShop() throws InterruptedException
	{
		Thread.sleep(5000);
		clickshop.click();
	}
	public void clickOnViewAll() throws InterruptedException
	{
		Thread.sleep(5000);
		clickviewall.click();
	}

}
