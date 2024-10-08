package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Helper {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r; 
	
	public static void browserLaunch (String url) //change any browser we create so this string url 
	{  
	driver= new ChromeDriver();
	driver.get(url);
	
	}
	public static void maxmiz() {
		driver.manage().window().maximize();
	}
	
	
	public static void browserClose() {
		driver.close();
	}
	
	public static void browserQuit() {
		driver.quit();
	}
	
	public static String prntTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
		
	}
	public static void prntUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
		
	public static void fillText(WebElement WebRef,String sendValue) {
		WebRef.sendKeys(sendValue);
	}
	
	public static void btnClick(WebElement btnRef) {
		btnRef.click();
	}
	
	public static void dragDrop(WebElement dragRef, WebElement dropRef) {
		a=new Actions(driver);
		a.dragAndDrop(dragRef, dropRef).perform();
	}
	
	public static void getDateAndTime() {
		getDateAndTime();
	}
	
	
	public static void moveElement(WebElement moveEleRef) {
		a.moveToElement(moveEleRef).perform();
	}
	
	public static void doubleClick(WebElement doubleClick) {
		a.doubleClick(doubleClick);
	}
	
	public static void contextClick(WebElement conClick) {
		a.contextClick(conClick);
	}
	
	public static void keyUp(CharSequence keyUp) {
		a.keyUp(keyUp);
	}
	
	public static void keyDown(CharSequence keyDown) {
		a.keyDown(keyDown);
	}
	
	public static void keyPress(int press) throws AWTException {
		r=new Robot();
		r.keyPress(press);
	}
	
	public static void keyRelease(int release) {
		r.keyRelease(release);
	}
	
	public static void scrnShot(String scrn1) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File per = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenTest1\\ScrnShot\\"+scrn1+".png");
		FileUtils.copyDirectory(temp, per);
	}

	public static String dataDrivenRead(String workBook,String shName,int rowNo,int colNo) throws IOException {
		
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\MavenTest1\\Excel\\"+workBook+".xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(fin);
		
		Sheet sheet = book.getSheet(shName);
		
			Row row = sheet.getRow(rowNo);
			
			Cell c = row.getCell(colNo);
			
//			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {					
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					
				int Type = c.getCellType();
				
				String value="";
				
				if (Type==1) {
					value = c.getStringCellValue();
					System.out.println(value);
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					
					Date datevalue = c.getDateCellValue();
					//convert to string
					SimpleDateFormat sd=new SimpleDateFormat("dd,MMMM,yyyy");
					value = sd.format(datevalue);
					System.out.println(value);
				}
				else {
					double dole = c.getNumericCellValue();
					//convert double to long
					long l =(long) dole;
					//convert to long to string
					value = String.valueOf(l);
					System.out.println(value);
				
				}
				return value;
	}
}