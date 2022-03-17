package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmpTest
{
	@Parameters({"username","password"})
	@Test
	
private void login(String name,String pass) 
	{	
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.get("https://adactinhotelapp.com/");
  driver.manage().window().maximize();
  WebElement txtuserName = driver.findElement(By.id("username"));
  txtuserName.sendKeys(name);
  WebElement txtPassword = driver.findElement(By.id("password"));
  txtPassword.sendKeys(pass);
    }

}
