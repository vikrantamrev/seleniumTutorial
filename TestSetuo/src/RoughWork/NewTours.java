package RoughWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;

public class NewTours {

	public static void main(String[] args) {

		String baseurl = "http://www.newtours.demoaut.com";
		WebDriver driver;

		driver = new FirefoxDriver();
		driver.get(baseurl);

		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		throw new SkipException("This stpe is skipped...");
		

	}

}
