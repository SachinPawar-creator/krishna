package Practise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class apractise {

	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String f;
	public static int num = 0;
	public static FileOutputStream file1;
	
	
	public static void main(String arg[]) throws IOException

	{
		File f = new File("H:\\bhjbjhbjb.xlsx");

		book = new XSSFWorkbook();
		sheet = book.createSheet("Data");
		

		sheet.createRow(15);

		row.createCell(0);
		cell.setCellValue("1534hjgy");

		System.out.println(cell.getStringCellValue());
		
		file1 = new FileOutputStream(f);
		book.write(file1);
		file1.flush();
		file1.close();
		System.out.println("done");

	}
}
