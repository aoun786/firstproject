import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class filehandling {

	public static void main(String[] args) throws IOException {
		
		File xlfile = new File ("D:\\QA CLASS\\java.xlsx\\");
		//File xlfile = new File ("D:\\QA CLASS\\muhammad.xls");
		
		FileInputStream xLFIS = new FileInputStream(xlfile);
		
		//file type xls=HSSF and xlsx=XSSF
		
		XSSFWorkbook xlbook = new  XSSFWorkbook(xLFIS);
		XSSFSheet xlsheet = xlbook.getSheet("test");
		//Read & Write multiple data set
		//created object for cell and row
		XSSFRow objrow;
		XSSFCell objcell;
		//trying finding last row number
		
		System.out.println(xlsheet.getLastRowNum());
		//loop from first row to last row
		for (int j=0;j<=xlsheet.getLastRowNum();j++)
		{
			//
			objrow=xlsheet.getRow(j);
			objcell=objrow.getCell(0);
			System.out.println(objcell.getStringCellValue());
			objcell=objrow.getCell(1);
			System.out.println(objcell.getStringCellValue());
			objcell=objrow.createCell(2);
			objcell.setCellValue("passed");
			
		}
		FileOutputStream xFIOS = new FileOutputStream(xlfile);
		xlbook.write(xFIOS);
		xFIOS.close();
		xLFIS.close();
		
		
	/*	XSSFRow xlrow = xlsheet.getRow(1);
		XSSFCell xlcell = xlrow.getCell(1);
		System.out.println(xlcell.getStringCellValue());
		xlcell = xlrow.getCell(0);
		System.out.println(xlcell.getStringCellValue());
	
		FileOutputStream xFIOS = new FileOutputStream(xlfile);
		xlrow.createCell(2).setCellValue("OK GOOD BYE");
		xlbook.write(xFIOS);
		*/
	}

}
