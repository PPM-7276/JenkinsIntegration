package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {
	WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///F:/Offline%20website/index.html");
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("kiran@gmail.com");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
}
