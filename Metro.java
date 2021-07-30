package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Metro extends Actiondriver {
	
	@Test
	
	public void Metroshopping() throws Throwable {
		
		String URL=TestData("fast", "Url");
		gf_launchUrl(URL);
		
		Thread.sleep(10000);
		
		String About=TestData("fast", "About");
		gf_Click(By.xpath(About), "About");
		

		Thread.sleep(3000);
		
		String Media=TestData("fast", "Media");
		gf_Click(By.xpath(Media), "Media");
		
 
		Thread.sleep(3000);
		
		String Pro=TestData("fast", "Pro");
		gf_Click(By.xpath(Pro), "Production");
		

		Thread.sleep(3000);
		
		String Product=TestData("fast", "Product");
		gf_Click(By.xpath(Product), "Product");
		

		Thread.sleep(3000);
		
		String Customer=TestData("fast", "Customer");
		gf_Click(By.xpath(Customer), "Customer");
		

		Thread.sleep(3000);
		
		String Outlet=TestData("fast", "Outlet");
		gf_Click(By.xpath(Outlet), "Outlet");
		

		Thread.sleep(3000);
		
		String Time=TestData("fast", "Time");
		gf_Click(By.xpath(Time), "Time");
		

		Thread.sleep(3000);
		
		String Apply=TestData("fast", "Apply");
		gf_Click(By.xpath(Apply), "Apply");
		

		Thread.sleep(3000);
		
		String New=TestData("fast", "New");
		gf_Click(By.xpath(New), "New");
		
		Thread.sleep(3000);
		//String Title1=TestData("fast", "Title1");
		//gf_VerifyTitle(Title1);
		String Search=TestData("fast", "Search");
		gf_Type(By.xpath(Search), "Sun flower oil", "Search");
		
		Thread.sleep(3000);
		String Click=TestData("fast", "Click");
		gf_Click(By.xpath(Click), "Click");
		
		Thread.sleep(3000);
		String Select=TestData("fast", "Select");
		gf_Click(By.xpath(Select), "Select");
		
		
		
		
	}

}
