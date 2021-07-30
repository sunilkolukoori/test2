package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Amazon extends Actiondriver {
	
	@Test
	
	public void amazonstore() throws Throwable {
		
		String Amazon=TestData("fast", "Url");
		
		gf_launchUrl(Amazon);
		
		System.out.println("Amazon window");
		
		Thread.sleep(5000);
		
		String Title=TestData("fast", "Title");
		
		gf_VerifyTitle(Title);
		
		
		String Bestseller=TestData("fast", "Best");
		gf_Click(By.xpath(Bestseller), "Bestseller");
		
		Thread.sleep(3000);
		
		String Besttitle=TestData("fast", "Besttitle");
		
		gf_VerifyTitle(Besttitle);
		
		String Mobiles=TestData("fast", "Mobiles");
		gf_Click(By.xpath(Mobiles), "Mobiles");
		
		Thread.sleep(3000);
		
		String Mobilestitle=TestData("fast", "Mobilestitle");
		
		gf_VerifyTitle(Mobilestitle);
		
		Thread.sleep(3000);
		
		String Pay=TestData("fast", "Pay");
		gf_Click(By.xpath(Pay), "Amazon Pay");
		
		Thread.sleep(3000);
		
		String Fashion=TestData("fast", "Fashion");
		gf_Click(By.xpath(Fashion), "Fashion");
		
		String Electronics=TestData("fast", "Electronics");
		gf_Click(By.xpath(Electronics), "Electronics");
		
		Thread.sleep(3000);
		
		String Electronicstitle=TestData("fast", "Electronicstitle");
		
		gf_VerifyTitle(Electronicstitle);
		
		String Prime=TestData("fast", "Prime");
		gf_Click(By.xpath(Prime), "Prime");
		
		Thread.sleep(3000);
		
		String Primetitle=TestData("fast", "Primetitle");
		
		gf_VerifyTitle(Primetitle);
		
		String New=TestData("fast", "New");
		gf_Click(By.xpath(New), "New");
		
		Thread.sleep(3000);
		
		String Newtitle=TestData("fast", "Newtitle");
		
		gf_VerifyTitle(Newtitle);
		
		String Customer=TestData("fast", "Customer");
		gf_Click(By.xpath(Customer), "Customer");
		
		Thread.sleep(3000);
		
		String Customertitle=TestData("fast", "Customertitle");
		
		gf_VerifyTitle(Customertitle);
		
		String Computer=TestData("fast", "Computer");
		gf_Click(By.xpath(Computer), "Computer");
		
		Thread.sleep(3000);
		
		String Computertitle=TestData("fast", "Computertitle");
		
		gf_VerifyTitle(Computertitle);
		
		String Home=TestData("fast", "Home");
		gf_Click(By.xpath(Home), "Home");
		
		Thread.sleep(3000);
		
		String Hometitle=TestData("fast", "Hometitle");
		
		gf_VerifyTitle(Hometitle);
		
		String Search=TestData("fast", "Search");
		gf_Type(By.xpath(Search), "Redmi", "Search");
		
		String Submit=TestData("fast","Submit");
		gf_Click(By.xpath(Submit), "Submit");
		
		String Select=TestData("fast", "Select");
		gf_Click(By.xpath(Select), "Select");
		
		String parent=driver.getWindowHandle();
		for(String Subwindow:driver.getWindowHandles())
		{
			driver.switchTo().window(Subwindow);
		}
		
		String Buy=TestData("fast", "Buy");
		gf_Click(By.xpath(Buy), "Buy now");
		
		String Email=TestData("fast","Email");
		gf_Type(By.xpath(Email), "9704482087", "Number");
		
		String Click=TestData("fast", "Click");
		gf_Click(By.xpath(Click), "Click");
				
		String Password=TestData("fast","Password");
		gf_Type(By.xpath(Password), "As@061111", "Password");
		
		String Signin=TestData("fast", "Signin");
		gf_Click(By.xpath(Signin), "Click");
		
		
	}
	

}
