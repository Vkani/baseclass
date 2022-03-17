package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class blazeDemo {
public static void main(String[] args) throws IOException {
	Baseclass baseClass = new Baseclass();
	baseClass.getDriver();
	baseClass.UrlLaunch("https://blazedemo.com/");
	WebElement findlocatorByName = baseClass.findlocatorByName("fromPort");
	String getdata1 = baseClass.getdata("Sheet2", 1, 0);
	baseClass.sendkeys(findlocatorByName, getdata1);
	WebElement findlocatorByName2 = baseClass.findlocatorByName("toPort");
	String getdata2 = baseClass.getdata("Sheet2", 1, 1);
	baseClass.sendkeys(findlocatorByName2, getdata2);
	WebElement findElementByXpath = baseClass.findElementByXpath("//input[@type='submit']");
	baseClass.click(findElementByXpath);
	WebElement findElementByXpath1 = baseClass.findElementByXpath("(//input[@type='submit'])[3]");
	baseClass.click(findElementByXpath1);
	WebElement txtName = baseClass.findElementById("inputName");
	String getdata3 = baseClass.getdata("Sheet2", 1, 2);
	baseClass.sendkeys(txtName, getdata3);
	WebElement txtAddress = baseClass.findElementById("address");
	String getdata4 = baseClass.getdata("Sheet2", 1, 3);
	baseClass.sendkeys(txtAddress, getdata4);
	WebElement txtCity = baseClass.findElementById("city");
	String getdata5 = baseClass.getdata("Sheet2", 1, 4);
	baseClass.sendkeys(txtCity, getdata5);
	WebElement txtState = baseClass.findElementById("state");
	String getdata6 = baseClass.getdata("Sheet2", 1, 5);
	baseClass.sendkeys(txtState, getdata6);
	WebElement txtZip = baseClass.findElementById("zipCode");
	String getdata7 = baseClass.getdata("Sheet2", 1, 6);
	baseClass.sendkeys(txtZip, getdata7);
	WebElement txttype = baseClass.findElementById("cardType");
	String getdata8 = baseClass.getdata("Sheet2", 1, 7);
	baseClass.sendkeys(txttype, getdata8);
	WebElement txtCreditnum = baseClass.findElementByXpath("(//input[@type='text'])[6]");
	String getdata9 = baseClass.getdata("Sheet2", 1, 8);
	baseClass.sendkeys(txtCreditnum, getdata9);
	WebElement txtMonth = baseClass.findElementByXpath("(//input[@type='text'])[7]");
	String getdata10 = baseClass.getdata("Sheet2", 1, 9);
	baseClass.sendkeys(txtMonth, getdata10);
	WebElement txtYear = baseClass.findElementByXpath("(//input[@type='text'])[8]");
	String getdata11 = baseClass.getdata("Sheet2", 1, 10);
	baseClass.sendkeys(txtYear, getdata11);
	WebElement txtCardName = baseClass.findElementByXpath("(//input[@type='text'])[9]");
	String getdata12 = baseClass.getdata("Sheet2", 1, 11);
	baseClass.sendkeys(txtCardName, getdata12);
	WebElement txtPurchase = baseClass.findElementByXpath("//input[@type='submit']");
	baseClass.click(txtPurchase);

    WebElement OrderIdtable = baseClass.findElementByClassName("table");
	List<WebElement> OrderRows = OrderIdtable.findElements(By.tagName("tr"));
	  for(int i=1; i< OrderRows.size()-6; i++) {
		WebElement element = OrderRows.get(i);
		String text = element.getText();
		System.out.println(text);
		File file=new File("C:\\Users\\vinot\\eclipse-workspace\\baseClass\\src\\test\\java\\Excel\\kani.xcel.xlsx");
		FileInputStream stream = new FileInputStream(file);
	Workbook w=new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Sheet2");
		Row row = sheet.getRow(1);
	Cell createCell = row.createCell(12);
		createCell.setCellValue(text);
		FileOutputStream out=new FileOutputStream(file);
		w.write(out);
	}
	
}
}
