package com.Scheercover.QA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scOrderPage {
	
	//*******************dataMembers/ Global variables****************
	
	
		public WebDriver driver;
		public WebElement oCode;
		public WebElement subTotal;
			
			
			
			
			//**************************UI Elements / Page Locators**********************
		By order_5pcmineralmakeup=By.xpath("//*[@id=\"kit\"]/div[3]/div[2]/div[1]/div/div[2]/div/div/div[2]/div[2]");
		 By order_LightShade=By.xpath("//div[contains(text(),'Light')]");
		    By _90DaySuplly= By.xpath("//*[@id=\"supply\"]/div[2]/div[2]/div[1]/div/div[2]/div/div/div[2]/div[2]");
		    By checkout = By.xpath("//a[@class='buttons-next next-page section-checkout']");	
			
		    //Checkout Page
		    
		    By offerCode = By.xpath("//div[@class='offerCodeID']");
		    By cartPrice=By.xpath("//div[@id='subTotal']");
			
			//*******************************Constructor**************************************
			
			
			public  scOrderPage(WebDriver driver) {
				
				this.driver=driver;
				
				
			}
			
			
			
			
			
			//***************************Methods***********************************************
			
			public  void click_5PcMineralMakeupKit() {
				
				
				driver.findElement(order_5pcmineralmakeup).click();
			}
			
			
			
			public void click_LightShade() {
				
				driver.findElement(order_LightShade).click();
				
			}
			
			
			public void click_90Day_Supply() {
				
				driver.findElement(_90DaySuplly).click();
			}
			
			public void click_checkout() {
				
				driver.findElement(checkout).click();
				
			}
			
			public String  verifyOfferCode() {
				
				oCode=driver.findElement(offerCode);
				String value=oCode.getText();
				System.out.println(value);
				return value;
			
			}
			
			public String verifySubTotalPrice() {
				
				subTotal=driver.findElement(cartPrice);
				String price=subTotal.getText();
				return price;
			}
			
			
	}

	
	
	
	
	
	
	
	
	
	
	
	
	


