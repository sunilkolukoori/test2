package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Crickbuzz extends Actiondriver {
	
	@Test
	
	public void cricket() throws Throwable {
		
		
		String URL=TestData("fast", "Url");
		gf_launchUrl(URL);
		Thread.sleep(3000);
		
		String Live=TestData("fast","Live");
		gf_Click(By.xpath(Live), "Live Score");
		Thread.sleep(3000);
		
		String Schedule=TestData("fast","Schedule");
		gf_Click(By.xpath(Schedule), "Schedule");
		Thread.sleep(3000);
		
		String Archives=TestData("fast","Archives");
		gf_Click(By.xpath(Archives), "Archives");
		Thread.sleep(3000);
		
		String News=TestData("fast","News");
		gf_Click(By.xpath(News), "News");
		
		Thread.sleep(3000);
		String Series=TestData("fast","Series");
		gf_Click(By.xpath(Series), "Series");
		
		Thread.sleep(3000);
		String Teams=TestData("fast","Teams");
		gf_Click(By.xpath(Teams), "Teams");
		
		Thread.sleep(3000);
		String Videos=TestData("fast","Videos");
		gf_Click(By.xpath(Videos), "Videos");
		
		Thread.sleep(3000);
		String Rank=TestData("fast","Rank");
		gf_Click(By.xpath(Rank), "Rank");
		
		
		
	}

}
