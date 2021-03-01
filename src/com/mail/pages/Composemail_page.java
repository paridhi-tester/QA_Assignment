package com.mail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Composemail_page {
		
	WebDriver driver;
		
		@FindBy(css = "div.T-I T-I-KE L3") //div[@class='T-I T-I-KE L3']
		@CacheLookup protected WebElement composebtn;
		
		@FindBy(id=":18h")
		@CacheLookup protected WebElement enterrecipnt;
		
		
		@FindBy(css = "input#:17z")
		@CacheLookup protected WebElement  sub;
		
		@FindBy(xpath = "//div[@id=':194']")
		@CacheLookup protected WebElement mailbdy;
		
		
		@FindBy(xpath = "//div[@id=':17p']")
		@CacheLookup protected WebElement Sendbtn;
		
		public Composemail_page(WebDriver driver) {
		this.driver=  driver;
		PageFactory.initElements(driver,this);
		}

		
		public void composemail_actions(String data) {
			
			composebtn.click();
			
			enterrecipnt.sendKeys(data);
			sub.sendKeys(data);
			mailbdy.sendKeys(data);
			Sendbtn.click();
		}
		
		
}

