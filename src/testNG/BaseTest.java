package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
	void beforeSuiteBase() {
		System.out.println("inside baseTest beforeSuite");
	}
	
	@BeforeTest
	void beforeTestBase() {
		System.out.println("inside baseTest beforeTest");
	}
	
	@BeforeClass
	void beforeclassBase() {
		System.out.println("inside baseTest beforeclass");
	}
	
	@BeforeMethod
	void beforeMethodBase() {
		System.out.println("inside baseTest beforeMethod");
	}
	
	
	@AfterSuite
	void afterSuiteBase() {
		System.out.println("inside baseTest afterSuite");
	}
	
	@AfterTest
	void afterTestBase() {
		System.out.println("inside baseTest afterTest");
	}
	
	@AfterClass
	void afterclassBase() {
		System.out.println("inside baseTest afterclass");
	}
	
	@AfterMethod
	void afterMethodBase() {
		System.out.println("inside baseTest afterMethod");
	}

}
