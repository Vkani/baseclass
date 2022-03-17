package org.datatable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class StepDef2 {
	
		WebDriver driver;
		@Given("user launch Adaction application on chrome browser")
		public void user_launch_Adaction_application_on_chrome_browser() 
		{
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://adactinhotelapp.com/"); 
		
		}


	@When("user enter {string} and {string} on Adactin page")
	public void user_enter_and_on_Adactin_page(String string, String string2) {
		WebElement txtuserName = driver.findElement(By.id("username"));
		   txtuserName.sendKeys(string);
		   WebElement txtPassword = driver.findElement(By.id("password"));
		   txtPassword.sendKeys(string2);

	}

		@When("user click on login button")
		public void user_click_on_login_button() 
		{
		    WebElement btnLogin = driver.findElement(By.id("login"));
		    btnLogin.click();
		
		}
		
		@When("user enter {string},{string},{string},{string},{string},{string},{string},{string} on search hotel page")
		public void user_enter_on_search_hotel_page(String string, String string2, String string3, String string4, String string5, String string6,String string7,String string8)
		{
		 WebElement slctLocation = driver.findElement(By.id("location"));  
		 slctLocation.sendKeys(string);
		 WebElement slcthotels = driver.findElement(By.id("hotels"));
		 slcthotels.sendKeys(string2);
		 WebElement slctRoomtype = driver.findElement(By.id("room_type"));
		 slctRoomtype.sendKeys(string3);
		 WebElement slctRoomno = driver.findElement(By.id("room_nos"));
		 slctRoomno.sendKeys(string4);
		 WebElement slctDateIn = driver.findElement(By.id("datepick_in"));
		 slctDateIn.sendKeys(string5);
		 WebElement slctdateOut = driver.findElement(By.id("datepick_out"));
		 slctdateOut.sendKeys(string6);
		 WebElement slctAdult = driver.findElement(By.id("adult_room"));
		 slctAdult.sendKeys(string7);
		 WebElement slctChildren = driver.findElement(By.id("child_room"));
		 slctChildren.sendKeys(string8);
		 
		}
		
		@When("click on search button")
		public void click_on_search_button() {
		   WebElement btnSubmit = driver.findElement(By.id("Submit"));
		   btnSubmit.click();
		}
		@When("select hotel in select hotel page")
		public void select_hotel_in_select_hotel_page() {
		   WebElement slctRadibutton = driver.findElement(By.id("radiobutton_0"));
		   slctRadibutton.click();
		}

		@When("click submit button")
		public void click_submit_button() {
		    WebElement btnContinue = driver.findElement(By.id("continue"));
		    btnContinue.click();
		}

		@When("user enter {string},{string},{string},{string}, {string},{string},{string},{string} on booking page")
		public void user_enter_on_booking_page(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		    WebElement txtFirstName = driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
		    txtFirstName.sendKeys(string);
		    WebElement txtLastName = driver.findElement(By.xpath("//input[@name=\"last_name\"]"));
		    txtLastName.sendKeys(string2);
		    WebElement txtAddress = driver.findElement(By.id("address"));
		    txtAddress.sendKeys(string3);
		    WebElement txtCreditNo = driver.findElement(By.id("cc_num"));
		    txtCreditNo.sendKeys(string4);
		    WebElement slctCredittype = driver.findElement(By.id("cc_type"));
		    slctCredittype.sendKeys(string5);
		    WebElement txtCCExpmonth = driver.findElement(By.id("cc_exp_month"));
		    txtCCExpmonth.sendKeys(string6);
		    WebElement txtexpYear = driver.findElement(By.id("cc_exp_year"));
		    txtexpYear.sendKeys(string7);
		    WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
		    txtCvv.sendKeys(string8);
		}

		@When("click button booking")
		public void click_button_booking() throws InterruptedException {
		    WebElement btnBook = driver.findElement(By.id("book_now"));
		    btnBook.click();
		    Thread.sleep(5000);
		}
		
		@When("order id is generated get the value")
		
		public void order_id_is_generated_get_the_value() {
			WebElement OrderId = driver.findElement(By.id("order_no"));
			String text = OrderId.getText();
			System.out.println(text);
		    	}


		
		
	}
