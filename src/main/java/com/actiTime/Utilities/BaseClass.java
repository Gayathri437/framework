package com.actiTime.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;



public class BaseClass {
	public static ChromeDriver driver;
	
	public static Logger log;
		@BeforeTest
		public static void OpenBrowser() {
			log = Logger.getLogger(BaseClass.class);
			PropertyConfigurator.configure("log4j.properties");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/DRIVERS/chromedriver.exe");
			driver=new ChromeDriver();
			log.info("------------Google Chrome Browser opened---------");
			driver.get("http://127.0.0.1/login.do");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		@AfterTest
		public static void CloseBrowser() {
			driver.close();
			log.info("------------Google Chrome Browser closed----------");	
		}
		
		@BeforeClass
		public void login()  {
			
			driver.get("http://dell-pc/login.do");
			log.info("-------------actitimePage login------------");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//input[@valign='absmiddle']")).click();
			log.info("------------login opened----------");
		}
		
		@AfterClass
		public void logout() {
			driver.findElement(By.className("logoutImg")).click();
			log.info("------------login closed----------");

		}
	}







