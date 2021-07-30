package com.bluenettech.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;
import com.bluenettech.frameworkRU.Reporters;


public class Flipkart extends Actiondriver {

	@Test
	public void Flipkart() throws Throwable {
		
			
			String stagingURL=TestData("fast", "flipkart");
			
			System.out.println("Flipkart Window");

			gf_launchUrl(stagingURL);

			Thread.sleep(6000);
			
			String loginLocator=TestData("fast", "crossmark");
			gf_Click(By.xpath(loginLocator), "Cross Mark");
			
			String Verify=TestData("fast", "title");
			gf_VerifyTitle(Verify);
			
			String User=TestData("fast", "User");
			gf_Click(By.xpath(User), "User Login");
			
			String Email=TestData("fast", "Email");
			gf_Type(By.xpath(Email), "9704482087", "Email");
			
			String Password=TestData("fast", "Password");
			gf_Type(By.xpath(Password), "As@061111", "Password");
			
			String Login=TestData("fast","Login");
			gf_Click(By.xpath(Login), "Login");
			
			Thread.sleep(6000);
			String search=TestData("fast", "search");
			gf_Type(By.xpath(search), "POCO M3", "search");
			
			String click=TestData("fast", "click");
			gf_Click(By.xpath(click), " Search Icon");
			
			Thread.sleep(6000);
			
			String select=TestData("fast","select");
			gf_Click(By.xpath(select), "Select the product");
			
			Thread.sleep(3000);
			
			String parent=driver.getWindowHandle();
			for(String Subwindow:driver.getWindowHandles())
			{
				driver.switchTo().window(Subwindow);
			}
			Thread.sleep(3000);	
	String Buy=TestData("fast","Buy");
	gf_Click(By.xpath(Buy), "Buy");
	
	Thread.sleep(3000);
	String Location=TestData("fast","Location");
	gf_Click(By.xpath(Location), "Location");
	
	Thread.sleep(3000);
	//String Last=TestData("fast", "Last");
	//gf_Click(By.xpath(Last), "Continue");
	
	}			
	
}