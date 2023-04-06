package IPT_FrameworkTaskProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base_ClassProgram.BaseClass;

public class TestNGAnnotationsCrossBrowserTest extends BaseClass{
	public WebDriver driver;
	
	@Parameters({"userBrowser"})
	@BeforeClass
	public void login(String userDesiredBrowser) {
		BaseClass.launchBrowserMethod(userDesiredBrowser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	@Test
	public void loginMethod1() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("userName");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("passWord");
		Thread.sleep(1000);
	}
   @AfterClass
	public void logoff() {
		driver.close();
	}
}
