package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Olx extends Actiondriver {
	
	@Test
	public void Oxlonline() throws Throwable {
		
		String URL=TestData("fast", "Url");
		gf_launchUrl(URL);
		
		Thread.sleep(5000);
		
		String Title=TestData("fast", "Title");
		gf_VerifyTitle(Title);
		
		Thread.sleep(3000);
		
		String Search=TestData("fast", "Search");
		gf_Type(By.xpath(Search), "Pulser 150", "Search");
		
		Thread.sleep(3000);
		String Click=TestData("fast", "Click");
		gf_Click(By.xpath(Click), "Search");
		
		Thread.sleep(3000);
		String Bike=TestData("fast", "Bike");
		gf_Click(By.xpath(Bike), "Bike");
		
		Thread.sleep(5000);
		String Chat=TestData("fast", "Chat");
		gf_Click(By.xpath(Chat), "Chat");
		
		
		
			}
	
	}

