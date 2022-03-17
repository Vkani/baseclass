package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderDemo extends Baseclass {

	WebDriver driver;
		
    @BeforeClass
    private void launch()
    {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
    }


	@Test(dataProvider="data")
	private void login(String userName, String password) 
	{
		
		WebElement txtuserName = driver.findElement(By.id("username"));
		txtuserName.sendKeys(userName);
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(password);
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}
	
	
	@DataProvider(name="data")
	private Object[][] getdata()
	{
		return new Object[][] 
		  {
			{"Nithyasundari","sfi4"},
			{"qfasg","13dg"},
			{"Nithyasundari","Madhudeva@123"},
	      };
	}
		

}
