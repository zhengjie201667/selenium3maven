package com.testing.selenium3maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class OpenWebsiteTestNG {
	
	public WebDriver driver;

  @BeforeClass
  public void setUp() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
	    
		//去掉chrome正受到自动测试软件控制信息栏显示
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
								
		//实例化webdriver的对象，启动谷歌浏览器
		driver = new ChromeDriver(options);	
  }
  
  @Test
  public void openWebSite() throws InterruptedException {
	  
	  //通过对象driver调用具体的get方法来打开网页
      driver.get("http://www.eteams.cn/");
      
  	//Assert.assertEquals(driver.getTitle(), "泛微移动办公云OA(eteams)：一体化的团队协作移动办公云平台1");
      
      //最大化浏览器窗口
      driver.manage().window().maximize();
      
      
      Thread.sleep(3000);
  }

  @AfterClass
  public void tearDown() {
	  
	  //退出浏览器
      driver.quit();
  }

}
