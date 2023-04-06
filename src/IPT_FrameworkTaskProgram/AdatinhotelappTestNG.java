package IPT_FrameworkTaskProgram;


import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AdatinhotelappTestNG {
	
	public static WebDriver hotelbooking;
	
	
	@BeforeSuite
	public static void systemProperty() {
		System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");		
	}
	
	@BeforeTest
	public static void browserlaunch() {
		hotelbooking =new ChromeDriver();
		hotelbooking.manage().window().maximize();
	}
	
	@BeforeClass
	public static void adatinURLLaunch() throws InterruptedException {
		hotelbooking.get("https://adactinhotelapp.com/");
		Thread.sleep(1000);
		System.out.println("Title of the hotelbookingApplication : " + hotelbooking.getTitle());
		
	}
	@BeforeMethod
	public static void adatinHotelLoginCredentials() throws InterruptedException{
		hotelbooking.findElement(By.xpath("//input[@id='username']")).sendKeys("Thivakar");
		Thread.sleep(1000);
		hotelbooking.findElement(By.xpath("//input[@id='password']")).sendKeys(new String (Base64.getDecoder().decode("VGhpdmFrYXIxMiFA".getBytes())));
		Thread.sleep(1000);
		hotelbooking.findElement(By.xpath("//input[@id='login']")).click();
		System.out.println("Title of the SearchHotel : " + hotelbooking.getTitle());
	}
	@Test
	public static  void adatinhotelBooking() throws InterruptedException, IOException {
		List<WebElement>location =hotelbooking.findElements(By.xpath("//select[contains(@id,'location')]/option"));
		for (WebElement selectlocation :location ) {
			if(selectlocation.getText().equals("London")) {
				selectlocation.click();
			}
		}
		List<WebElement>hotels =hotelbooking.findElements(By.xpath("//select[@id='hotels']/option"));
		for (WebElement selecthotels : hotels) {
			if(selecthotels.getText().equals("Hotel Sunshine")) {
				selecthotels.click();
			}
		}
		List<WebElement>roomType =hotelbooking.findElements(By.xpath("(//select[@class='search_combobox'])[3]/option"));
		for (int i=0;i<roomType.size();i++){
			if(roomType.get(i).getText().equals("Deluxe")) {
				roomType.get(i).click();
			}
		}
		List<WebElement>numberOfRooms =hotelbooking.findElements(By.xpath("//select[@name='room_nos']/option"));
		for (WebElement selectRoom : numberOfRooms) {
			if(selectRoom.getAttribute("value").equals("7")) {
				selectRoom.click();
			}
		}
		Thread.sleep(1000);
		WebElement checkInDate =hotelbooking.findElement(By.xpath("//input[contains(@id,'datepick_in')]"));		
		checkInDate.clear();
		checkInDate.sendKeys("14/11/2022");
		Thread.sleep(2000);
		WebElement checkOutDate =hotelbooking.findElement(By.xpath("//input[contains(@id,'datepick_out')]"));		
		checkOutDate.clear();
		checkOutDate.sendKeys("16/11/2022");
		Thread.sleep(2000);

		Select adultsPerRoom =new Select(hotelbooking.findElement(By.xpath("//select[@id='adult_room']")));
		adultsPerRoom.selectByValue("4");

		List<WebElement> childrenPerRoom =hotelbooking.findElements(By.xpath("//select[@id='child_room']/option"));
		for (int i=0;i<childrenPerRoom.size();i++){
			if(childrenPerRoom.get(i).getAttribute("value").equals("1")) {
				childrenPerRoom.get(i).click();
			}
		}
		screenShotMethod();
		hotelbooking.findElement(By.xpath("//input[@id='Submit']")).click();

		Thread.sleep(4000);
		System.out.println("Title of SelectHotel: " + hotelbooking.getTitle());

		WebElement selectHotel =hotelbooking.findElement(By.xpath("//*[@id='radiobutton_0']"));
		selectHotel.click();
		Thread.sleep(1000);
		screenShotMethod();
		if(selectHotel.isSelected()) {
			hotelbooking.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
		}

		Thread.sleep(2000);
		
		excutescriptMethod();
		
		Thread.sleep(1000);
		String finalBilledPrice = hotelbooking.findElement(By.xpath("//input[@id='final_price_dis']")).getAttribute("value");
		System.out.println("Total BilledPrice :" +finalBilledPrice) ;
		hotelbooking.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Thivakar");
		hotelbooking.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Deivendran");
		hotelbooking.findElement(By.xpath("//textarea[contains(@class,'txtarea')]")).sendKeys("Chennai");
		hotelbooking.findElement(By.xpath("//*[@id='cc_num']")).sendKeys("1234567899876543L");
		Thread.sleep(1000);
		List<WebElement> creditCardType = hotelbooking.findElements(By.xpath("//*[@id='cc_type']/option"));
		for(int i=0;i<creditCardType.size();i++) {
			if(creditCardType.get(i).getAttribute("value").equals("AMEX")) {
				creditCardType.get(i).click();
			}
		}
		Thread.sleep(1000);
		Select selectionMonth =new Select (hotelbooking.findElement(By.xpath("//select[@id='cc_exp_month']")));
		selectionMonth.selectByIndex(9);
		Thread.sleep(1000);
		List<WebElement> selectionYear = hotelbooking.findElements(By.xpath("//*[@id='cc_exp_year']/option"));
		for (WebElement year : selectionYear) {
			if(year.getText().equals("2022")) {
				year.click();
			}
		}
		hotelbooking.findElement(By.xpath("//input[contains(@id,'cc_cvv')]")).sendKeys("123");
		Thread.sleep(1000);
		screenShotMethod();
		hotelbooking.findElement(By.id("book_now")).click();

		WebElement processmessage = hotelbooking.findElement(By.xpath("//label[@id='process_span']"));
		WebDriverWait wait = new WebDriverWait(hotelbooking,30);
		wait.until(ExpectedConditions.invisibilityOf(processmessage));
		
		excutescriptMethod();
		
		Thread.sleep(2000);
		hotelbooking.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		Thread.sleep(2000);
		hotelbooking.findElement(By.xpath("//input[@name='ids[]'][@type='checkbox']")).click();
		Thread.sleep(1000);
		hotelbooking.findElement(By.xpath("//input[@name='cancelall']")).click();
		Thread.sleep(1000);
		Alert cancelSelection =hotelbooking.switchTo().alert();
		System.out.println("Alert Message : " + cancelSelection.getText());
		Thread.sleep(2000);
		cancelSelection.accept();
		Thread.sleep(2000);
		screenShotMethod();
	}
	@AfterMethod
	public static void adatinHotelLogout() throws InterruptedException {
		hotelbooking.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
	}
	@AfterTest
	public static void afterTestt() {
		hotelbooking.quit();
	}
	
	@AfterSuite
	public static void deleteAllCookies()	{
	hotelbooking.manage().deleteAllCookies();
	}
	
	static void screenShotMethod() throws IOException {
		TakesScreenshot picture = (TakesScreenshot) hotelbooking;
		File originfile =picture.getScreenshotAs(OutputType.FILE);
		String screenshotname = "Screenshot"+System.currentTimeMillis()+".png"; 
		File destinationfile= new File("D:\\User\\Document\\Eclipse_workspace\\IPT_TaskProgram\\ScreenShotFolder\\"+screenshotname);
		FileUtils.copyFile(originfile, destinationfile);
	}	
	static void excutescriptMethod() {
		JavascriptExecutor scriptexecution =(JavascriptExecutor) hotelbooking;
		scriptexecution.executeScript("window.scrollBy(0,500)", "");
	}
}
