package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long Page_Loadout_Wait = 50;
	public static long Implicit_wait = 50;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static WebElement Iwait;
	private static XSSFRow row;
	public static String f;
	public static XSSFCell cell;
	public static FileOutputStream file;

	public void SwitchToFrame()

	{
		driver.switchTo().frame("mainpanel");
	}

	public Object[][] DataProvider(int sheetname)

	{

		try {
			File f = new File("H:\\CRMProDDF\\src\\main\\java\\com\\crm\\qa\\TestData\\CRMPRO_TestData.xlsx");

			FileInputStream file = new FileInputStream(f);

			book = new XSSFWorkbook(file);

			sheet = book.getSheetAt(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++)

			{

				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

			}

		}

		return data;

	}

	public static void WriteExcel(String username1, String username2, String username3, String username4,
			String username5, String username6, String username7, String username8) throws FileNotFoundException

	{
		File f = new File("H:\\CRMProDDF\\src\\main\\java\\com\\crm\\qa\\TestData\\ExcelWritee.xlsx");
		row = sheet.createRow(15);
		cell = row.createCell(0);

		cell.setCellValue(username1);
		cell.setCellValue(username2);
		cell.setCellValue(username3);
		cell.setCellValue(username4);
		cell.setCellValue(username5);
		cell.setCellValue(username6);
		cell.setCellValue(username7);
		cell.setCellValue(username8);

		System.out.println(cell.getStringCellValue());

		file = new FileOutputStream(f);

	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	public static void ImplicitWaitForSpecificElement(WebDriver driver, WebElement locator, int time)

	{

		Iwait = new WebDriverWait(driver, time).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();

	}

}
