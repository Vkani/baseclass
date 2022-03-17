package baseClass;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class brokenlinkdemo {

	public static void main(String[] args) throws IOException {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			 
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int size = links.size();
			System.out.println(size);
			int brokencount=0;
			for(int i=0;i<links.size();i++) {
				WebElement webElement = links.get(i);
				String text = webElement.getAttribute("href");
				URL url=new URL(text);
				URLConnection Connection = url.openConnection();
				HttpURLConnection httpCon = (HttpURLConnection)Connection;
				int responseCode = httpCon.getResponseCode();
				if(responseCode!=200) {
					System.out.println(text);
				    brokencount++;
					
				}
				
				}
			
			System.out.println(brokencount);
}
	
	
	
	
	
	
	
}