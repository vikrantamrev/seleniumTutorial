package com.demoaut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	// Priority Not working as expected.

	public String baseurl = "http://www.newtours.demoaut.com";
	public WebDriver driver;


	
	
	@BeforeSuite()
	public void BeforeSuiteMethod(){
		
		System.out.println("Before suite method......");
		
	}
	
	@AfterSuite()
	public void AfterSuiteMethod(){
		
		System.out.println("After suite method......");
		
	}
	
	@BeforeTest()
	public void BeforeClass() {
		driver = new FirefoxDriver();
		driver.get(baseurl);
		System.out.println("Before class method is called...");
	}

	@BeforeTest(enabled = false)
	public void setBaseURL() {
		driver = new FirefoxDriver();
		driver.get(baseurl);

	}

	
	
	@Test()
	public void verifyHomePageTitle() {

		String expectedTitle = driver.getTitle();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test()
	public void Login() {

		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");

	}

	@Test()
	public void SignIn() {

		driver.findElement(By.name("login")).click();

	}

	@AfterTest
	public void endSession() {
		driver.manage().window().maximize();
		driver.close();

	}

}
