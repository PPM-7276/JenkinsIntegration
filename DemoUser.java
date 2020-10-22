package com.jbk.test;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoUser {
	WebDriver driver;
		int i=0;
		
	@Test
	public void checkheaders()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///F:/Offline%20website/pages/examples/operators.html");
		driver.manage().window().maximize();
	
		ArrayList<String> expheader=new ArrayList<>();
		expheader.add("ID");
		expheader.add("Person");
		expheader.add("For");
		expheader.add("Prefered Way to Connect");
		expheader.add("Contact");
		expheader.add("Timings");
		System.out.println("expheader>>>>"+expheader);
		
		List<WebElement> actheaderlist=driver.findElements(By.xpath("//tr/th"));
		ArrayList<String> actheader=new ArrayList<>();
		
		for(WebElement we:actheaderlist)
		{
			actheader.add(we.getText());
		}
		System.out.println("actheader>>>>>>"+actheader);
		Assert.assertEquals(actheader, expheader);
	}
}
