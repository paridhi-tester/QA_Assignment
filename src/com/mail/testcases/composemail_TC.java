package com.mail.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mail.base.Base;
import com.mail.pages.Composemail_page;
import com.mail.utilities.ReadTestData;



public class composemail_TC extends  Base{
	
	ReadTestData objReadTestData;
	Composemail_page objComposemailpage;
	
	@BeforeClass
	public void setup() throws IOException {
		
		
		objReadTestData = new ReadTestData();
		ArrayList<String> userDetails = objReadTestData.getDataFromExcelSheet("InputData.xlsx", "LoginData");
		String username = userDetails.get(0);
		String password = userDetails.get(1);
		System.out.println(username +  password);
		LaunchBrowser();
		
		enterUsername(username );
		enterPassword(password);
	}
    
	
	@Test
	public void createEmail() throws IOException {
		
		objReadTestData = new ReadTestData();
		objComposemailpage = new Composemail_page(driver);
		
		ArrayList<String> emaildetails = objReadTestData.getDataFromExcelSheet
				("InputData.xlsx", "LoginData");
		
		String enterrecipnt = emaildetails.get(2);
		String sub = emaildetails.get(3);
		String mailbdy = emaildetails.get(4);
		
		objComposemailpage.composemail_actions(enterrecipnt);
		objComposemailpage.composemail_actions(sub);
		objComposemailpage.composemail_actions(mailbdy);
		
		
	}
	

	/*
	 * @AfterClass public void logout() { Logout(); driver.quit; }
	 */
}
