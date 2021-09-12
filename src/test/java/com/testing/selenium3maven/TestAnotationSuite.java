package com.testing.selenium3maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestAnotationSuite {
 @BeforeSuite
 public void beforeSuite() {
	 System.out.println("@BeforeSuite");
 }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("@AfterTest");
  }
  
  @Test
  public void testMethod3() {
	  System.out.println("@Test - TestMethod3");
  }



}
