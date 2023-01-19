package IPT_SeleniumTaskProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Base_ClassProgram.BaseClass;

public class Data_Driven_Facebook {

	public static void main(String[] args) throws IOException {
		//readExcelFileValue();
		//writeExcelFileValue();
		loginFacebook();
	}
	public static void loginFacebook() throws IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(BaseClass.excelFileReadValue(1,1));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(BaseClass.excelFileReadValue(1,2));
		System.out.println("Username and password enter successfully");
	}
	public static void writeExcelFileValue()throws IOException{
		File file = new File("C:\\Users\\USER\\Desktop\\QA_Testing.xlsx");
		FileInputStream fileInputStreamData = new FileInputStream(file);
		Workbook excelWorkBook = new XSSFWorkbook(fileInputStreamData);
		Sheet workSheet = excelWorkBook.getSheet("Sheet2");
		workSheet.getRow(0).createCell(2).setCellValue("Status");
		System.out.println("Header create successfully");
		for (int i = 1; i <workSheet.getPhysicalNumberOfRows(); i++) {
			 workSheet.getRow(i).createCell(2).setCellValue("YES");
	}
		FileOutputStream fileOutputStreamData = new FileOutputStream(file);
		excelWorkBook.write(fileOutputStreamData);
		excelWorkBook.close();
		System.out.println("Status created successfully");
	}
	
	
	public static void readExcelFileValue() throws IOException {
		FileInputStream fileInputStreamData = new FileInputStream(new File("C:\\Users\\USER\\Desktop\\QA_Testing.xlsx"));
		Workbook excelWorkBook = new XSSFWorkbook(fileInputStreamData);
		Sheet workSheet = excelWorkBook.getSheet("Sheet2");
		for (int i = 1; i <workSheet.getPhysicalNumberOfRows(); i++) {
			Row rowValue = workSheet.getRow(i);
			String StringArrayValue[] = new String[workSheet.getPhysicalNumberOfRows()];
			double doubleArrayValue[] =new double[workSheet.getPhysicalNumberOfRows()] ;
			for (int j = 0; j <rowValue.getPhysicalNumberOfCells(); j++) {
				CellType cellType = rowValue.getCell(j).getCellType();
				if (cellType.equals(cellType.STRING)) {
					StringArrayValue[i] = rowValue.getCell(j).getStringCellValue();	
				} else if (cellType.equals(cellType.NUMERIC)) {
					doubleArrayValue[i] = rowValue.getCell(j).getNumericCellValue();	
				}
			}
			System.out.println("FirstName Value for " + StringArrayValue[i]);
			System.out.println("id Value for " + doubleArrayValue[i]);
		}
	}
	}
