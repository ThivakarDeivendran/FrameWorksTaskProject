package Base_ClassProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {

	public static String excelFileReadValue(int rowNumber, int cellNumber) throws IOException {
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
		return null;
	}

}
