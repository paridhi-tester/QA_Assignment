package com.mail.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
	protected WebDriver driver;

public void LaunchBrowser() {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		

		driver  = new ChromeDriver();
		driver.navigate().to("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);	
       
	}
	
public void enterUsername(String data) {
	
	driver.findElement(By.id("identifierNext")).clear();
	driver.findElement(By.id("identifierNext")).sendKeys(data);
	driver.findElement(By.cssSelector("div.VfPpkd-RLmnJb")).click();

}

public void enterPassword(String data) {
    
	//driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(data);
    driver.findElement(By.id("submit-button")).click();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
}


public void Logout() {
	
	driver.findElement(By.cssSelector("img.gb_Da gbii")).click();
	driver.findElement(By.xpath("//a[@id='gb_71']")).click();
	
}
}
