package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public void readdata() throws IOException
		// TODO Auto-generated method stub
	{
		File src = new File ("C:\\Users\\Training_c2a.05.01\\Desktop\\Selenium.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is: " +data0);
		wb.close();
	}

}
