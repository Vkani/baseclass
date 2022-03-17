package org.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class StepDef {
WebDriver driver;
@Given("user launch FB application on chrome browser")
public void user_launch_FB_application_on_chrome_browser() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
}

@When("user enter username and password on FB page")
public void user_enter_username_and_password_on_FB_page() {
   WebElement txtuserName = driver.findElement(By.id("email"));
   txtuserName.sendKeys("Nithya");
   WebElement txtPassword = driver.findElement(By.id("pass"));
   txtPassword.sendKeys("nithya@13");
 
}

@When("user click on login button")
public void user_click_on_login_button() {
	
	WebElement btnLogin = driver.findElement(By.xpath("//button[@name=\"login\"]"));
	btnLogin.click();
}

@Then("user validating home page is visible or not")
public void user_validating_home_page_is_visible_or_not() {
	WebElement element = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]"));
	String text = element.getText();
	System.out.println(text);
	Assert.assertEquals("The password that you've entered is incorrect. Forgotten password?", text);
	System.out.println("completed");


}



}
