package org.emp;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class realApi {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader reader=new FileReader("C:\\Users\\vinot\\eclipse-workspace\\baseClass\\src\\test\\resources\\JsonFile\\greensAPI.json");
		JSONParser jsonparser=new JSONParser();
		Object obj = jsonparser.parse(reader);
		JSONObject j= (JSONObject)obj;
		
		Object Objdata = j.get("data");
		System.out.println(Objdata);
		
		JSONObject jdata =(JSONObject) Objdata;
		
		Object objid=jdata.get("id");
		System.out.println();
		
		Object objemail=jdata.get("email");
		System.out.println(objemail);
		
		Object objfirstname=jdata.get("first_name");
		System.out.println(objfirstname);
		
		Object objlastname=jdata.get("last_name");
		System.out.println(objlastname);
		
		Object objavatar = jdata.get("avatar");
		System.out.println(objavatar);
		
		Object objsupport = j.get("support");
		System.out.println(objsupport);
		
		JSONObject jsup=(JSONObject) objsupport;
		
		Object objurl = jsup.get("url");
		System.out.println(objurl);
		
		Object objtext = jsup.get("text");
		System.out.println(objtext);
		
		
		
		
		
}
}
