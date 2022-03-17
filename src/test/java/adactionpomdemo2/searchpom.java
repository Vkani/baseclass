package adactionpomdemo2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Adactinpomdemo.pomBaseclass;

public class searchpom {
	public searchpom() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(name="location")
	private WebElement slctlocation;
	
	@FindBy(name="hotels")
	private WebElement slcthotel;
	
	@FindBy(name="room_type")
	private WebElement slctroom;

	@FindBy(name="room_nos")
	private WebElement slctroomno;
	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement txtCheckIn;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement txtCheckOut;
	
	@FindBy(name="adult_room")
	private WebElement txtAdultRoom;
	
	@FindBy(name="child_room")
	private WebElement txtChildRoom;
	
	@FindBy(xpath = "(//input[@type='submit'])")
	private WebElement btnSearch;

	public WebElement getSlctlocation() {
		return slctlocation;
	}

	public WebElement getSlcthotel() {
		return slcthotel;
	}

	public WebElement getSlctroom() {
		return slctroom;
	}

	public WebElement getSlctroomno() {
		return slctroomno;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getTxtAdultRoom() {
		return txtAdultRoom;
	}

	public WebElement getTxtChildRoom() {
		return txtChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}



	
	
	
	

}
	
	
	
	

