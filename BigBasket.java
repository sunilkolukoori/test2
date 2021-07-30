package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class BigBasket extends Actiondriver {
	
	@Test
	public void BigBasket1() throws Throwable {
		
		String URL=TestData("fast", "Url");
		gf_launchUrl(URL);
		
		Thread.sleep(5000);
		
		String Title=TestData("fast", "Title");
		gf_VerifyTitle(Title);
		
		Thread.sleep(3000);
		
		String Search=TestData("fast", "Search");
		gf_Click(By.xpath(Search), "Select the Product");
		
		Thread.sleep(3000);
		//String Click=TestData("fast", "Click");
		//gf_Click(By.xpath(Click), "Click");
		String Title1=TestData("fast", "Title1");
		gf_VerifyTitle(Title1);
		
		Thread.sleep(3000);
		
		String Select=TestData("fast", "Select");
		gf_Click(By.xpath(Select), "buy");
		
		Thread.sleep(3000);
		
		String Buy=TestData("fast", "Buy");
		gf_Click(By.xpath(Buy), "buying the product");
		

		Thread.sleep(3000);
		
		String Cart=TestData("fast", "Cart");
		gf_Click(By.xpath(Cart), "Cart");
		

		Thread.sleep(3000);
		
		//String Final=TestData("fast", "Final");
		//gf_Click(By.xpath(Final), "Cart open");
		
		
	}

}
