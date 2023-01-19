package IPT_SeleniumTaskProgram;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AmazonDynamicXpath {
	static WebDriver amazon; static int leastPrice;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
		amazon =new ChromeDriver();
		amazon.manage().window().maximize();
		amazon.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		amazon.get("https://www.amazon.in/");testAmazonMethod();
//		amazon.findElement(By.xpath("//a[text()='Mobiles']")).click();
//		amazon.findElement(By.xpath("//a[text()='Mobiles']//following-sibling::a[contains(text(),'Cou')]")).click();
		
	}
	
	public static void testAmazonMethod()
	{
		amazon.findElement(By.xpath("//a[text()='Fashion']")).click();
		Actions menCategory = new Actions(amazon);
		menCategory.moveToElement(amazon.findElement(By.xpath("(//span[@class='nav-a-content'])[3]")));
		menCategory.build().perform();
		menCategory.moveToElement(amazon.findElement(By.xpath("//a[text()='T-Shirts & Polos']"))).click();
		menCategory.build().perform();
		//div[@class='a-section octopus-pc-card-title']//span[contains(text(),'Recommended ')]
		List<WebElement> bestSellers = amazon.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(bestSellers.size()+ "Totals");
		int[] rate =new int[bestSellers.size()];
		for(int i=0;i<bestSellers.size();i++) {
			rate[i] = Integer.parseInt(bestSellers.get(i).getText());	
			Arrays.sort(rate);
			System.out.println(rate.toString());
			leastPrice= rate[0];
		}
		System.out.println("First value in the amazon Page :   " +leastPrice);
	}	
	

}
