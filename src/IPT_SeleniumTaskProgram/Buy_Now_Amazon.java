package IPT_SeleniumTaskProgram;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buy_Now_Amazon {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\User\\Document\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver",
//				"D:\\User\\Document\\Drivers\\geckodriver.exe");
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	
	searchbox.sendKeys("Bangles"+Keys.ENTER);
	
	driver.findElement(By.xpath("//span[text()='Jewellery Bracelets for Women Stylish Rose Gold Plated Crystal Bracelet Bangle Jewellery for Girls and Women']")).click();
	
	Thread.sleep(3000);
	System.out.println("Window 1 Title  : " + driver.getTitle());
	String mainWindow = driver.getWindowHandle();
	Set<String>windowTab=driver.getWindowHandles();
	 Iterator<String> iterator =windowTab.iterator();
	 while(iterator.hasNext()) {
		 String childwindow =iterator.next();
		 if(!childwindow.equalsIgnoreCase(mainWindow)){
			 driver.switchTo().window(childwindow);
		 }
	 }
	 System.out.println("Window 2 Title  : " + driver.getTitle());
	 Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	
//	TakesScreenshot ts = (TakesScreenshot) driver;
//	File source = ts.getScreenshotAs(OutputType.FILE);
//	File destination = new File("C:\\Users\\Jenes_raj\\eclipse-workspace\\selenium_Ipt\\Screenshot\\adactin.png");
//	FileUtils.copyFile(source, destination);
	
	}

}
