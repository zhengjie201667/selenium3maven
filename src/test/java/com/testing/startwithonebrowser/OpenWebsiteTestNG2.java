package com.testing.startwithonebrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class OpenWebsiteTestNG2 {
	
	public static WebDriver driver;


  
  @Test(groups={"smoking","regression"})
  public void openWebSite2() throws InterruptedException {
	  
	  //直接引用BasicClass中定义的共有类型的driver对象
	  driver=BasicClass.driver;
	  
	  //通过对象driver调用具体的get方法来打开网页
      driver.get("http://www.eteams.cn/");
     // Assert.assertEquals(driver.getTitle(), "泛微移动办公云OA(eteams)：一体化的团队协作移动办公云平台1");
      
      //最大化浏览器窗口
      driver.manage().window().maximize();
      
      Thread.sleep(3000);
  }



}
