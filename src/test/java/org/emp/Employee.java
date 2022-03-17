package org.emp;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Employee {
public static void main(String[] args) throws IOException, ParseException {
	
	FileReader reader=new FileReader("C:\\Users\\vinot\\eclipse-workspace\\baseClass\\src\\test\\resources\\greenscart\\greensCart.json");
	JSONParser jsonparser=new JSONParser();
	Object obj = jsonparser.parse(reader);
	JSONObject j= (JSONObject)obj;
	
	Object firstname=j.get("firstname");
	System.out.println(firstname);
	
	
	Object lastname=j.get("lastname");
	System.out.println(lastname);
	
	
	Object email=j.get("email");
	System.out.println(email);
	Object phone=j.get("phone");
	System.out.println(phone);
	
	Object objPass = j.get("password");
	System.out.println(objPass);
	Object confirmPass= j.get("confirmpass");
	System.out.println(confirmPass);
	Object DOB = j.get("DOB");
	System.out.println(DOB);
	Object Gender = j.get("gender");
	System.out.println(Gender);
	
	
	
	
	
	
	
}
}
