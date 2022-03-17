package adactionpomdemo2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Adactinpomdemo.pomBaseclass;

public class orderidpom extends pomBaseclass {
	public orderidpom() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(name ="order_no")
	private WebElement OrderNo;

	public WebElement getOrderNo() {
		return OrderNo;
	}
	
}






