package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Snapdeal extends Actiondriver {

	
	
	
	@Test
	
	public void Shop() throws Throwable {
		
		
		String Snapdeal=TestData("fast", "Site");
		
		gf_launchUrl(Snapdeal);
		
		String Popup=TestData("fast", "Popup");
		gf_Click(By.xpath(Popup), "Popup");
		
		String Serach=TestData("fast","Search");
		
		gf_Type(By.xpath(Serach), "POWER BANK", "Searching the power bank");
		
	Thread.sleep(5000);
		
		String Click=TestData("fast", "Click");
		gf_Click(By.xpath(Click), "Click");
		
		Thread.sleep(5000);
		String Pin=TestData("fast", "Pin");
		gf_Type(By.xpath(Pin), "505466", "Pin");
		
		Thread.sleep(2000);
		
		String Check=TestData("fast","Check");
		gf_Click(By.xpath(Check), "Check");
		
		Thread.sleep(2000);
		
		String Select=TestData("fast","Select");
		gf_Click(By.xpath(Select), "Select");
		
		
		String parent=driver.getWindowHandle();
		for(String Subwindow:driver.getWindowHandles())
		{
			driver.switchTo().window(Subwindow);
		}
		

		//driver.switchTo().window("Philips DLP9001NB 10000 -mAh Li-Polymer Power Bank Black");
	
		Thread.sleep(10000);
		
		String Buy=TestData("fast", "Buy");
		gf_Click(By.xpath(Buy), "Buy");
		
		String User=TestData("fast","User");
		gf_Type(By.xpath(User), "9704482088", "User");
		
		String Login=TestData("fast", "Login");
		gf_Click(By.xpath(Login), "Continue");
		
		String Email=TestData("fast","Email");
		gf_Type(By.xpath(Email), "kolukoorisunil11@yahoo.com", "Email");
		
		String Name=TestData("fast","Name");
		gf_Type(By.xpath(Name), "Sunil", "User name");
		
		String Password=TestData("fast","Password");
		gf_Type(By.xpath(Password), "12345678A", "Password");
		
		String Continue=TestData("fast","Continue");
		gf_Click(By.xpath(Continue), "Continue");
		
	
		

	}
}
