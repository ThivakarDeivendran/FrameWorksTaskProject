package IPT_FrameworkTaskProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGAnnotationsGrouping {
	public WebDriver driver;
	
	@Test(groups={"randomTesting","functionalTesting"})
	public void login() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	@Test(priority=1,groups ={"functionalTesting"})
	public void intialProcessMethod1() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Overview')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[1]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=2,groups={"randomTesting"})
	public void logoff() {
		driver.close();
	}
	
	

}
