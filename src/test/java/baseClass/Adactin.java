package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	public static void main(String[] args) throws IOException, InterruptedException {

		Baseclass baseClass = new Baseclass();

		baseClass.getDriver();

		baseClass.UrlLaunch("https://adactinhotelapp.com/");

		baseClass.maximize();

		WebElement txtUser = baseClass.findElementById("username");
		String name = baseClass.getdata("Sheet1", name, 1, 0);
		baseClass.sendkeys(txtUser, name);

		WebElement txtpass = baseClass.findElementById("password");
		String pass = baseClass.getdata("Sheet1", pass, 1, 1);
		baseClass.sendkeys(txtpass, pass);

		WebElement btnlogin = baseClass.findElementById("login");
		baseClass.click(btnlogin);

		WebElement dDnlocation = baseClass.findElementById("location");
		baseClass.click(dDnlocation);
		baseClass.selectOptionByIndex(dDnlocation, 1);

		WebElement dDnhotel = baseClass.findElementById("hotels");
		baseClass.click(dDnhotel);
		baseClass.selectOptionByIndex(dDnhotel, 1);

		WebElement dDnroom = baseClass.findElementById("room_type");
		baseClass.click(dDnroom);
		baseClass.selectOptionByIndex(dDnroom, 1);

		WebElement dDnsubmit = baseClass.findElementById("Submit");
		baseClass.click(dDnsubmit);

		WebElement dDnSelec = baseClass.findElementById("//input[@type='radio']");
		baseClass.click(dDnSelec);

		WebElement dDnContinue = baseClass.findElementById("continue");
		baseClass.click(dDnContinue);

		WebElement txtFirst = baseClass.findElementById("first_name");
		String fname = baseClass.getdata("Sheet1", fname, 1, 2);
		baseClass.sendkeys(txtFirst, fname);

		WebElement txtLast = baseClass.findElementById("last_name");
		String lname = baseClass.getdata("Sheet1", lname, 1, 3);
		baseClass.sendkeys(txtLast, lname);

		WebElement txtAddress = baseClass.findElementById("address");
		String address = baseClass.getdata("Sheet1", address, 1, 4);
		baseClass.sendkeys(txtAddress, address);

		WebElement txtcard = baseClass.findElementById("cc_num");
		String card = Baseclass.getdata("Sheet1", card, 1, 5);
		baseClass.sendkeys(txtcard, card);

		WebElement Ddncc = baseClass.findElementById("cc_type");
		baseClass.click(Ddncc);
		baseClass.selectOptionByIndex(Ddncc, 1);

		WebElement Ddnmonth = baseClass.findElementById("cc_exp_month");
		baseClass.click(Ddnmonth);
		baseClass.selectOptionByIndex(Ddnmonth, 3);

		WebElement Ddnyear = baseClass.findElementById("cc_exp_year");
		baseClass.click(Ddnyear);
		baseClass.selectOptionByIndex(Ddnyear, 12);

		WebElement txtcvv = baseClass.findElementById("cc_cvv");
		String cvv = baseClass.getdata("Sheet1", cvv, 1, 6);
		baseClass.sendkeys(txtcvv, cvv);

		WebElement Ddnbook = baseClass.findElementById("book_now");
		baseClass.click(Ddnbook);

		baseClass.implicitWait(300);

		WebElement dDnorder = baseClass.findElementById("order_no");
		String attribute = baseClass.getAttribute(dDnorder);
		baseClass.WriteData("Sheet1", 1, 7, attribute);

	}
}
