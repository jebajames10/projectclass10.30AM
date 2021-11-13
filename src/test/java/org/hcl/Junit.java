package org.hcl;



import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	
	public static void beforeclass() { 
		
	System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Jebarani\\eclipse-workspace\\Framework\\Driver\\chromedriver.exe");
		     driver  = new ChromeDriver();
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
			
 System.out.println("Launch Browser");

}
	@AfterClass
	public static void afterclass() {
		driver.quit();
		System.out.println("quit");

	}
	@Before
	public void before() {
		Date d =new Date();
 System.out.println(d);

	}
	@After
	public void after() {
		Date d = new Date();
		 System.out.println(d);
	}
	@Test
	public void test() { 
		WebElement Fname = driver.findElement(By.name("firstName"));
		Fname.sendKeys("jeba");
		WebElement Lname = driver.findElement(By.name("lastName"));
		Lname.sendKeys("james");
		WebElement USERname = driver.findElement(By.name("Username"));
		USERname.sendKeys("jeba.james.10");
		WebElement Passwd = driver.findElement(By.name("Passwd"));
		Passwd.sendKeys("123456");
		WebElement ConfirmPasswd = driver.findElement(By.name("ConfirmPasswd"));
		ConfirmPasswd.sendKeys("123456");
		WebElement btnlogin = driver.findElement(By.xpath("//button[@type=\"button\"]"));
		btnlogin.click();
		
	}
}
