package IPT_FrameworkTaskProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import Base_ClassProgram.BaseClass;

public class TestNGAnnotationsDataProvider extends BaseClass{
	public WebDriver driver;
	
	@BeforeClass
	public void login() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	@Test (dataProvider = "saucedemo" )
	public void intialProcessMethod1(@Optional("OptionalUserName")String userName,@Optional("OptionalPassword")String passWord) throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(passWord);
		Thread.sleep(1000);
	}
   @AfterClass
	public void logoff() {
		driver.close();
	}
	
	

}
