package adactionpomdemo2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Adactinpomdemo.pomBaseclass;

public class Loginpom extends pomBaseclass {

		
		

	public Loginpom() {
		
		PageFactory.initElements(driver, this);
		
		
	}
		
		public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

		@FindBy(id="username")
		private WebElement txtUserName;
		
		@FindBy(id="password")
		private WebElement txtPassword;
		
		@FindBy(id="login")
		private WebElement btnlogin;
}
