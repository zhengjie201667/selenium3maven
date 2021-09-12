package com.testing.startwithonebrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginAndLogoutTestNG {
	
	public static WebDriver driver;
    
	
  @Test(groups= {"priority1","regression"})
  public void loginAndLogout() throws InterruptedException {
	  
	  driver = BasicClass.driver;
	  
		//打开网页
		driver.get("http://www.eteams.cn/");
		
		//检查点：验证标题是否一致
		Assert.assertEquals(driver.getTitle(), "泛微移动办公云OA(eteams)：一体化的团队协作移动办公云平台1");
	    
		//登录系统
		 driver.findElement(By.id("top-btn-login")).click();
		 driver.findElement(By.id("username")).click();
		 driver.findElement(By.id("username")).clear();
		 driver.findElement(By.id("username")).sendKeys("yoyotesta@163.com");
		 driver.findElement(By.id("password")).click();
		 driver.findElement(By.id("password")).clear();
		 driver.findElement(By.id("password")).sendKeys("123456");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 //关闭邀请同事的弹窗
		 driver.findElement(By.xpath("//div[@class='detail-actions']/ul/li/a[@class='close']")).click();
		 Thread.sleep(3000);
		 		 
		 //实例化Actions类的对象：actions
      Actions actions = new Actions(driver);
		 		 
		 	     	    
		 //鼠标指上右上角eteams图标
      WebElement eteams = driver.findElement(By.id("eteamsQuickMenu"));
      WebElement logout = driver.findElement(By.id("logout"));
      actions.moveToElement(eteams).perform();
      Thread.sleep(3000);
      actions.moveToElement(logout).click().perform();
      Thread.sleep(3000);
      driver.findElement(By.linkText("确认")).click();
	 
	  
  }



}
