package com.testing.startwithonebrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class BasicClass {

 public static WebDriver driver;
  @BeforeSuite(alwaysRun = true)
  public void beforeSuite() {
		 //定义gecko driver的获取地址
      System.setProperty("webdriver.gecko.driver", "D:\\BrowserDriver\\chromedriver.exe");
		
     //创建一个叫driver的对象，启动火狐浏览器  
     driver = new FirefoxDriver();
  }

  @AfterSuite(alwaysRun = true)
  public void afterSuite() {
	  //退出浏览器
      driver.quit();
  }

}
