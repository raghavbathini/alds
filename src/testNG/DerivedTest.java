package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DerivedTest extends BaseTest{
	
	@BeforeSuite
	void beforeSuiteDerived() {
		System.out.println("inside DerivedTest beforeSuite");
	}
	
	@BeforeTest
	void beforeTestDerived() {
		System.out.println("inside DerivedTest beforeTest");
	}
	
	@BeforeClass
	void beforeclassDerived() {
		System.out.println("inside DerivedTest beforeclass");
	}
	
	@BeforeMethod
	void beforeMethodDerived() {
		System.out.println("inside DerivedTest beforeMethod");
	}
	
	@Test
	void test() {
		System.out.println("inside DerivedTest actual Test");
	}
	
	
	@AfterSuite
	void afterSuiteDerived() {
		System.out.println("inside DerivedTest afterSuite");
	}
	
	@AfterTest
	void afterTestDerived() {
		System.out.println("inside DerivedTest afterTest");
	}
	
	@AfterClass
	void afterclassDerived() {
		System.out.println("inside DerivedTest afterclass");
	}
	
	@AfterMethod
	void afterMethodDerived() {
		System.out.println("inside DerivedTest afterMethod");
	}

}
