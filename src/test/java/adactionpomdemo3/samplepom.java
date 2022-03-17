package adactionpomdemo3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Adactinpomdemo.pomBaseclass;
import adactionpomdemo2.Loginpom;
import adactionpomdemo2.booking;
import adactionpomdemo2.searchpom;
import adactionpomdemo2.selectpom;

public class samplepom extends pomBaseclass{
public static void main(String[] args) throws IOException {
	pomBaseclass base1=new pomBaseclass();
	base1.getDriver();
	base1.UrlLaunch("https://adactinhotelapp.com/");
	base1.maximize();
	
	Loginpom l=new Loginpom();
	WebElement txtUserName = l.getTxtUserName();
	base1.sendkeys(txtUserName, "naveen53");
	WebElement txtPassword = l.getTxtPassword();
	base1.sendkeys(txtPassword, "C1IZAU");
	WebElement btnlogin = l.getBtnlogin();
	base1.click(btnlogin);
	
	searchpom s=new searchpom();
	WebElement slctlocation = s.getSlctlocation();
	String loc = base1.getdata("Sheet1",0, 2);
	base1.sendkeys(slctlocation, loc);
	WebElement slcthotel = s.getSlcthotel();
	String hotel = base1.getdata("Sheet1",0, 3);
	base1.sendkeys(slcthotel, hotel);
	WebElement slctroom = s.getSlctroom();
	String room = base1.getdata("Sheet1",0, 4);
	base1.sendkeys(slctroom, room);
	WebElement slctroomno = s.getSlctroomno();
	String roomno = base1.getdata("Sheet1",0, 5);
	base1.sendkeys(slctroomno, roomno);
	WebElement txtCheckIn = s.getTxtCheckIn();
	String checkin = base1.getdata("Sheet1",0, 6);
	base1.sendkeys(txtCheckIn, checkin);
	WebElement txtCheckOut = s.getTxtCheckOut();
	String checkout = base1.getdata("Sheet1",0, 7);
	base1.sendkeys(txtCheckOut, checkout);
	WebElement txtAdultRoom = s.getTxtAdultRoom();
	String adult = base1.getdata("Sheet1",0, 8);
	base1.sendkeys(txtAdultRoom, adult);
	WebElement txtChildRoom = s.getTxtChildRoom();
	String child = base1.getdata("Sheet1",0, 9);
	base1.sendkeys(txtChildRoom, child);
	WebElement btnSearch = s.getBtnSearch();
	base1.click(btnSearch);
	
	selectpom radiobtn =new selectpom();
	WebElement rdButton = radiobtn.getRdButton();
	rdButton.click();
	
	WebElement btncontinue = radiobtn.getBtncontinue();
	btncontinue.click();
	
	
	booking book=new booking();
	WebElement txtFirst = book.getTxtFirst();
	base1.getdata("Sheet1",0, 11);
	WebElement txtlast = book.getTxtlast();
	base1.getdata("Sheet1",0, 12);
	WebElement txtaddress = book.getTxtaddress();
	base1.getdata("Sheet1",0, 13);
	WebElement txtCardNo = book.getTxtCardNo();
	base1.getdata("Sheet1",0, 14);
	WebElement txtCardType = book.getTxtCardType();
	base1.getdata("Sheet1",0, 15);
	
	
	
	
	
	
	
	
}
}
