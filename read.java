package xx.xy;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class read {	
	
	@Test
	void excel() throws Exception
	{
		File src = new File("C:\\Users\\Ashish\\Documents\\readData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		String product = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(product);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-autoid-1-announce")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
	
		
//		File src = new File("C:\\Users\\Ashish\\Documents\\readData.xlsx");
//		
//		FileInputStream fis = new FileInputStream(src);
//		
//		XSSFWorkbook xsf = new XSSFWorkbook(fis);
//		
//		XSSFSheet sheet = xsf.getSheetAt(0);
//		
//		String data = sheet.getRow(0).getCell(0).getStringCellValue();
//		
//		System.out.println(data);
		
		
//		File src = new File("C:\\Users\\Ashish\\Documents\\readData.xlsx");
//		FileInputStream fis = new FileInputStream(src);
//		XSSFWorkbook xsf = new XSSFWorkbook(fis);
//		XSSFSheet sheet = xsf.getSheetAt(0);
//		String data = sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(data);
		
		
	}
}


