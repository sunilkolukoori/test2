package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class RTc extends Actiondriver{
	
	@Test
	public void tsrtc() throws Throwable {
		
		
		String URL=TestData("fast", "Url");
		gf_launchUrl(URL);
		
		
		Thread.sleep(3000);
		String Vajra=TestData("fast", "Vajra");
		gf_Click(By.xpath(Vajra), "Vajra Service");
		
		Thread.sleep(3000);
		String Link=TestData("fast", "Link");
		gf_Click(By.xpath(Link), "Link");
		
		Thread.sleep(3000);
		String Enquiry=TestData("fast", "Enquiry");
		gf_Click(By.xpath(Enquiry), "Enquiry Service");
		
		Thread.sleep(3000);
		String Canceltickets=TestData("fast", "Canceltickets");
		gf_Click(By.xpath(Canceltickets), "Canceltickets");
		
		Thread.sleep(3000);
		String Cancelled=TestData("fast", "Cancelled");
		gf_Click(By.xpath(Cancelled), "Cancelled Service");
		
		Thread.sleep(3000);
		String About=TestData("fast", "About");
		gf_Click(By.xpath(About), "About info");
		
		Thread.sleep(3000);
		String Driver=TestData("fast", "Driver");
		gf_Click(By.xpath(Driver), "Driver info");
		
		/*Thread.sleep(5000);
		String Home=TestData("fast", "Home");
		gf_Click(By.xpath(Home), "Home");
		
		Thread.sleep(3000);
		String From=TestData("fast", "From");
		gf_Type(By.xpath(From), "Karimnagar", "From place");
		
		Thread.sleep(3000);
		String To=TestData("fast", "To");
		gf_Type(By.xpath(To), "Hyderabad", "To place");
		
		Thread.sleep(3000);
		String Check=TestData("fast", "Check");
		gf_Click(By.xpath(Check), "Check Bus");*/
		
		
		
		
	}

}

