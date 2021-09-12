package com.testing.startwithonebrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class OpenWebsiteTestNG {
	
	public static WebDriver driver;


  
  @Test(groups= {"smoking","regression"})
  public void openWebSite() throws InterruptedException {
	  
	  //直接引用BasicClass中定义的共有类型的driver对象
	  driver=BasicClass.driver;
	  
	  //通过对象driver调用具体的get方法来打开网页
      driver.get("http://www.eteams.cn/");
      
      //最大化浏览器窗口
      driver.manage().window().maximize();
      
      Thread.sleep(3000);
  }



}
