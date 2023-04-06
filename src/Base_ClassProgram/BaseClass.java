package Base_ClassProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public   class BaseClass {
	
	public static  WebDriver driverBaseClassReference;
	
	public static WebDriver launchBrowserMethod(String browser) {
		/*try {
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driverBaseClassReference = new ChromeDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driverBaseClassReference = new EdgeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driverBaseClassReference = new FirefoxDriver();
			break;
		default:
			System.out.println("browser not installed in your system");
		}
		}catch(Exception e) {
			
		}
		return driverBaseClassReference;
	}*/
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driverBaseClassReference = new ChromeDriver();
				return driverBaseClassReference;
				
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driverBaseClassReference = new FirefoxDriver();
				return driverBaseClassReference;
				
			} else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driverBaseClassReference = new EdgeDriver();
				return driverBaseClassReference;
			}
		} catch (Exception e) {

		}
		return driverBaseClassReference;
	}

	public static String excelFileReadValue(int rowNumber, int cellNumber) throws IOException {
		try {
		FileInputStream fileInputStreamData = new FileInputStream(
				new File("C:\\Users\\USER\\Desktop\\QA_Testing.xlsx"));
		Workbook excelWorkBook = new XSSFWorkbook(fileInputStreamData);
		Sheet workSheet = excelWorkBook.getSheet("Sheet1");
		Row rowValue = workSheet.getRow(rowNumber);
		CellType cellType = rowValue.getCell(cellNumber).getCellType();
		if (cellType.equals(cellType.STRING)) {
			String cellStringValue = rowValue.getCell(cellNumber).getStringCellValue();
			return cellStringValue;
		} else if (cellType.equals(cellType.NUMERIC)) {
			double cellDoubleValue = rowValue.getCell(cellNumber).getNumericCellValue();
			String valueOfNumericCell = String.valueOf(cellDoubleValue);
			return valueOfNumericCell;
		 		}
		}catch (Exception e) {
			
		}
		return null;
	}
	
	@DataProvider(name="saucedemo")
	@Test
	public Object[][] testData(){
		return  new Object[][] {{"username1","password1"},{"username2","password2"}};
}
	
}
