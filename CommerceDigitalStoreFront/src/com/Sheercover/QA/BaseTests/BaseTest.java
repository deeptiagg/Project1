package com.Sheercover.QA.BaseTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseTest {
	
	public static File file;
	public static Properties prop;
	public static FileInputStream fp;
	
	
	public static WebDriver driver;
	
	public BaseTest()  {
	try {
	file = new File("C:\\core java scrips\\CommerceDigitalStoreFront\\Propertyfile.property");
	fp = new FileInputStream(file);
	prop = new Properties();
	prop.load(fp);
	
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	
	public static void initialization() {
		 String browserName = prop.getProperty("browser");
		 if(browserName.equals("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 
			driver.get(prop.getProperty("url"));
		 }
	}
		 
		 public static void closeBrowser() {
			 driver.quit();;
	}
		 
		 public static void verifyHomepageTitle() {
			 String title = driver.getTitle();
			 System.out.println(title);
			 
		 }
		 
		 public static void takeScreenShot(String path) throws Exception {
			 try {
			 File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(screenshotFile1, new File(path));
			 }catch (WebDriverException e) {
				 e.printStackTrace();
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
			 
		 }

			
			 
			 
}

	
	
	
	
	
	


