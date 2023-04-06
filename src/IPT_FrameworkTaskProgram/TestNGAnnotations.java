package IPT_FrameworkTaskProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	public WebDriver driver;
	
	//@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	@Test(priority =1)
	public void intialProcessMethod1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Overview')])[1]")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority =3)
	public void intialProcessMethod2() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Overview')])[1]")).click();
		Thread.sleep(2000);
	}
	@Test(priority =2,dependsOnMethods="intialProcessMethod1")
	public void intialProcessMethod3() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Overview')])[1]")).click();
		Thread.sleep(1000);
	}
	@AfterMethod
	public void logoff() {
		driver.close();
	}
	
	

}
