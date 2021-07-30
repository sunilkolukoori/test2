package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Redbus extends Actiondriver {

	
	@Test
	
	public void bus() throws Throwable {
		
		String URL=TestData("fast", "Url");
		gf_launchUrl(URL);
		
		Thread.sleep(5000);
		
		String Title=TestData("fast", "Title");
		gf_VerifyTitle(Title);
		
		String Drop=TestData("fast", "Drop");
		gf_Click(By.xpath(Drop), "Drop down");
		
		String INR=TestData("fast", "INR");
		gf_SelectByVisibleText(By.xpath(INR), "Indian Rupees", "Currency");
		
	}
	
	
	
}
