package Practise;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingExcel {

	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileOutputStream file;
	public static String f;

	public static int num = 0;

	public static void WriteExcel(String username1, String username2, String username3, String username4,
			String username5, String username6, String username7, String username8) throws IOException

	{

		book = new XSSFWorkbook();
		File f = new File("H:\\CRMProDDF\\src\\main\\java\\com\\crm\\qa\\TestData\\ExcelWritee1.xlsx");
		sheet = book.createSheet("Data");

		sheet.createRow(0).createCell(0).setCellValue("dffvsd");
		sheet.createRow(1).createCell(0).setCellValue("fef");

		sheet.createRow(2).createCell(0).setCellValue("");

		sheet.createRow(3).createCell(0).setCellValue("");

		sheet.createRow(4).createCell(0).setCellValue("");
		sheet.createRow(5).createCell(0).setCellValue("");
		sheet.createRow(6).createCell(0).setCellValue("");
		sheet.createRow(7).createCell(0).setCellValue("");

		System.out.println(cell.getStringCellValue());

		file = new FileOutputStream(f);
		book.write(file);

	}

}
