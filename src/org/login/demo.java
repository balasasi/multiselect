package org.login;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WELcOME\\eclipse-workspace\\selenium 1\\Driver\\chromedriver.exe" );
	  WebDriver driver =new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//select[@name='coffee2']"));
		Select s= new Select(findElement);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByIndex(2);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Total no of options is "+size);
		  for (int i = 0; i < options.size(); i++) {
			if (i%2==0) {
			WebElement ii = options.get(i);
				String text = ii.getText();
				System.out.println(text);
		
			
			} }	System.out.println("--------------------------------------------");
			
			 for (int j = 0; j < options.size(); j++) {
					if (j%2==1) {
					WebElement ii = options.get(j);
						String text = ii.getText();
						System.out.println(text);
					
					} } System.out.println("--------------------------------------------");
			
for (int k = 0; k <options.size(); k++) {
	  if ((k/4)/4==2) {
		
	
		  WebElement ii = options.get(k);
			String text = ii.getText();
			System.out.println(text);}
	  else if ((k/5)/5==1) {WebElement ii = options.get(k);
		String text = ii.getText();
		System.out.println(text);
		
	}	
	  
	  
	  System.out.println("-------------------------------------------------------------------------------------------------------");
	
for (int l = 4; l <7; l++) {
	WebElement ii = options.get(l);
	String text = ii.getText();
	System.out.println(text);}
	
}{ System.out.println("-----------------------------------------------------------------------------------------------------------");}
for (int i1 = 0; i1 < options.size(); i1++) {
	for (int i2 = 0; i2 < options.size(); i2++) {
		for (int i3 = 0; i3 < options.size(); i3++) {
			WebElement ii = options.get(i1);
			String text = ii.getText();
			System.out.println(text);}
			
			
			
		}
	}
}



		  






}