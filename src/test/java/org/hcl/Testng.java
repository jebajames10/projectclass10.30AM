package org.hcl;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testng {
	@BeforeClass
	private void beforeClass() {
	System.out.println("Launch Browser");
	}
	@AfterClass
	private void afterClass() {
		System.out.println("quit browseer");
	}
	@AfterMethod
	 private void afterMethod() {
		System.out.println("end time");
}
	@Test
	 private void test() {
		System.out.println("test");
}
	@BeforeMethod
	 private void beforeMethod() {
		System.out.println("start time");
}
	 

}
