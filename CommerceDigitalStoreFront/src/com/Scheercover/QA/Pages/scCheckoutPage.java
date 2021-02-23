package com.Scheercover.QA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class scCheckoutPage {
	
	
//*******************dataMembers/ Global variables****************


	public WebDriver driver;


//**************************UI Elements / Billing  Locators**********************


	By billing_Email=By.xpath("//input[@id='dwfrm_personinf_contact_email']");
	By billing_Phone= By.xpath("//input[@id='dwfrm_personinf_contact_daytimephone']");
	By billing_firstName= By.xpath("//input[@id='dwfrm_personinf_billtoaddress_firstName']");
	By billing_lastName= By.xpath("//input[@id='dwfrm_personinf_billtoaddress_lastName']");
	By billing_address1= By.xpath("//input[@id='dwfrm_personinf_billtoaddress_address1']");
	By billing_city= By.xpath("//input[@id='dwfrm_personinf_billtoaddress_city']");
	By billing_state= By.xpath("//select[@id='dwfrm_personinf_billtoaddress_states_state']");
	By billing_zip= By.xpath("//input[@id='dwfrm_personinf_billtoaddress_zip']");

	
	
By shipTo_Billing_CheckBox=By.xpath("//input[@id='dwfrm_personinf_useAsBillingAddress']");
	
	//**************************UI Elements / Shipping  Locators**********************


	
	By Shipping_firstName= By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_firstName']");
	By Shipping_lastName= By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_lastName']");
	By Shipping_address1= By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_address1']");
	By Shipping_city= By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_city']");
	By Shipping_state= By.xpath("//select[@id='dwfrm_personinf_shipptoaddress_states_state']");
	By Shipping_zip= By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_zip']");

	//*******************************Constructor**************************************


	public   scCheckoutPage(WebDriver driver) {

		this.driver=driver;


	}





	//***************************Billing fields Methods***********************************************


	public void enter_Email(String emailId) {

		driver.findElement(billing_Email).sendKeys(emailId);
	}


	public void enter_Phone(String phoneNumber) {

		driver.findElement(billing_Phone).sendKeys(phoneNumber);


	}

	public void enter_firstName(String fName) {

		driver.findElement(billing_firstName).sendKeys(fName);



	}

	public void enter_lastName(String lName) {

		driver.findElement(billing_lastName).sendKeys(lName);

	}

	public void enter_Address1(String add1) {


		driver.findElement(billing_address1).sendKeys(add1);
	}



	public void enter_City(String city) {

		driver.findElement(billing_city).sendKeys(city);

	}


	public void select_State(String state) {

		driver.findElement(billing_state).sendKeys(state);
	}


	public void enter_zipcode(String zip) {

		driver.findElement(billing_zip).sendKeys(zip);
	}
	
	
	
	
	//***************************Shipping fields Methods***********************************************


		

		public void enter_Ship_firstName(String fName) {

			driver.findElement(Shipping_firstName).sendKeys(fName);



		}

		public void enter_Ship_lastName(String lName) {

			driver.findElement(Shipping_lastName).sendKeys(lName);

		}

		public void enter_Ship_Address1(String add1) {


			driver.findElement(Shipping_address1).sendKeys(add1);
		}



		public void enter_Ship_City(String city) {

			driver.findElement(Shipping_city).sendKeys(city);

		}


		public void select_Ship_State(String state) {

			driver.findElement(Shipping_state).sendKeys(state);
		}


		public void enter_Ship_zipcode(String zip) {

			driver.findElement(Shipping_zip).sendKeys(zip);
		}
		
		
		public void click_ShipTo_Billing_CheckBox() {
			
			driver.findElement(shipTo_Billing_CheckBox).click();
		}
	
	
	

}
