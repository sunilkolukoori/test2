package com.bluenettech.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;
import com.bluenettech.frameworkRU.Reporters;


public class Orbit extends Actiondriver {

	@Test
	public void Orbit() throws Throwable {
		
			
			String stagingURL=TestData("orbit", "Orbit");
			
			System.out.println("Orbit Window");

			gf_launchUrl(stagingURL);

			Thread.sleep(6000);
			
			
			
			String Username=TestData("orbit", "Username");
			gf_Type(By.xpath(Username), "bluecloud", "Username");
			
			String Password=TestData("orbit", "Password");
			gf_Type(By.xpath(Password), "Bluecloud1", "Password");
			
			String Login=TestData("orbit", "Login");
			gf_Click(By.xpath(Login),"Login" );
			
			Thread.sleep(20000);
			
			String Report=TestData("orbit", "Report");
			gf_Click(By.xpath(Report), "Report Page");
			
	
			String Bussiness=TestData("orbit", "Bussiness");
			gf_Click(By.xpath(Bussiness), "Bussiness Page");
			
			
			//String User=TestData("orbit", "User");
			//gf_Click(By.xpath(User), "User page");
			
			
			//String Domin=TestData("orbit", "Domin");
			//gf_Click(By.xpath(User), "Domin page");
			
			
			//String Monitor=TestData("orbit", "Monitor");
			//gf_Click(By.xpath(Monitor), "Monitor Page");
			
			
			
			//String Collab=TestData("orbit", "Collab");
			//gf_Click(By.xpath(Collab), "Collabaration Page");
			
			
			//String System=TestData("orbit", "System");
			//gf_Click(By.xpath(System), "System Page");
			
			
			//String Units=TestData("orbit", "Units");
			//gf_Click(By.xpath(Units), "Units Page");
			
			//String Jobs=TestData("orbit", "Jobs");
			//gf_Click(By.xpath(Jobs), "Jobs Page");
			
			
			
			//String search=TestData("fast", "search");
			//gf_TypeAndVerify(By.xpath(search), "POCO M3", "search");
			
			//String click=TestData("fast", "click");
			//gf_Click(By.xpath(click), " Search Icon");
			
			//String select=TestData("fast","select");
			//gf_Click(By.xpath(select), "Select the product");
			
	

		}			
	
}