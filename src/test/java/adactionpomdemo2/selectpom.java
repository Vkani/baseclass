package adactionpomdemo2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Adactinpomdemo.pomBaseclass;

public class selectpom {
	public selectpom() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="radiobutton_1")
	private WebElement rdButton;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getRdButton() {
		return rdButton;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
}
