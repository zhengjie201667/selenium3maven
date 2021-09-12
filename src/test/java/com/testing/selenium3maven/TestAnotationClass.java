package com.testing.selenium3maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterClass;

public class TestAnotationClass {

	
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("@BeforeClass");
  }
  
  @Test
  public void testMethod1() {
	  
	  System.out.println("@Test - testMethod1");
  }
  
  @Test(groups="group1")
  public void testMethod2() {
	  
	  System.out.println("@Test - testMethod2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }
  
  @BeforeGroups("group1")
  public void beforeGroups() {
	  System.out.println("@BeforeGroups");
  }
  
  @AfterGroups("group1")
  public void afterGroups() {
	  System.out.println("@AfterGroups");
  }
  
   



  
  
}
