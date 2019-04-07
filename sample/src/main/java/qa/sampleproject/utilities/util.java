package qa.sampleproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class util {
 public static long page_load_wait=30;
 public static long implicit_wait=20;
 public static String Testdata_Sheet_Path="";
 static Workbook book;
 static WebDriver driver;
 
static org.apache.poi.ss.usermodel.Sheet sheet;
public static void takesScreenshotAtEndofTest() throws IOException{
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//String currentDir=System.getProperty("user.dir");
	//System.out.println(currentDir);
	FileUtils.copyFile(src, new File("./Screenshots/"+ System.currentTimeMillis() +".png"));
	
}
 public static Object[][] getTestData(String sheetname){
	 FileInputStream file=null;
	try{
		file=new FileInputStream(Testdata_Sheet_Path);
	} catch(FileNotFoundException e){
		e.printStackTrace();
	}
	try{
		book=WorkbookFactory.create(file);
	} catch(InvalidFormatException e){
		e.printStackTrace();
	} catch(IOException e){
		e.printStackTrace();
	}
	sheet= book.getSheet(sheetname);
	Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	for(int i=0;i<sheet.getLastRowNum();i++){
		for(int k=0;k< sheet.getRow(0).getLastCellNum();k++){
			data[i][k]=sheet.getRow(i+1).getCell(k).toString();
		}
	}
	return data;
 }
}
