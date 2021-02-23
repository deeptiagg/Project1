package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {


		WebDriver driver;

		By billing_Email=By.xpath("//input[@id='dwfrm_personinf_contact_email']");

		By billing_phone=By.xpath("//input[@id='dwfrm_personinf_contact_daytimephone']");
		By billing_FirstName=By.xpath("//input[@id='dwfrm_personinf_billtoaddress_firstName']");
		By billing_LastName=By.xpath("//input[@id='dwfrm_personinf_billtoaddress_lastName']");
		By billing_Address1=By.xpath("//input[@id='dwfrm_personinf_billtoaddress_address1']");
		By billing_City=By.xpath("//input[@id='dwfrm_personinf_billtoaddress_city']");
		By billing_State=By.xpath("//select[@id='dwfrm_personinf_billtoaddress_states_state']");
		By billing_zip=By.xpath("//input[@id='dwfrm_personinf_billtoaddress_zip']");

	    By orderpage_Checkout=By.xpath("//a[@class='buttons-next next-page section-checkout']");
		By checkbox =By.xpath("//input[@id='dwfrm_personinf_useAsBillingAddress']");


		By shipping_FirstName=By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_firstName']");
		By shipping_LastName=By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_lastName']");
		By shipping_Address1=By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_address1']");
		By shipping_City=By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_city']");
		By shipping_State=By.xpath("//select[@id='dwfrm_personinf_shipptoaddress_states_state']");
		By shipping_zip=By.xpath("//input[@id='dwfrm_personinf_shipptoaddress_zip']");


		public checkoutPage(WebDriver driver) {

			this.driver=driver;
		}




		public void enter_Billing_Email(String emailAddress) {

			driver.findElement(billing_Email).sendKeys(emailAddress);

		}

		public void enter_Billing_Phone(String phoneNumber) {

			driver.findElement(billing_phone).sendKeys(phoneNumber);
		}


		public void enter_Billing_FirstName(String billFirstNamer) {

			driver.findElement(billing_FirstName).sendKeys(billFirstNamer);
		}

		public void enter_Billing_LastName(String billlastNamer) {

			driver.findElement(billing_LastName).sendKeys(billlastNamer);
		}

		public void enter_Billing_Addres1(String billAddress1) {

			driver.findElement(billing_Address1).sendKeys(billAddress1);
		}
		
		
		public void enter_Billing_City(String billCity) {

			driver.findElement(billing_City).sendKeys(billCity);
		}
		
		
		public void enter_Billing_State(String billState) {

			driver.findElement(billing_State).sendKeys(billState);
		}

		
		public void enter_Billing_zipCode(String billlZipCode) {

			driver.findElement(billing_zip).sendKeys(billlZipCode);
		}
		//**************************************************************************************
		
		
		
		public void enter_Shipping_FirstName(String shipFirstNamer) {

			driver.findElement(shipping_FirstName).sendKeys(shipFirstNamer);
		}

		public void enter_Shipping_LastName(String shiplastNamer) {

			driver.findElement(shipping_LastName).sendKeys(shiplastNamer);
		}

		public void enter_Shipping_Addres1(String shipAddress1) {

			driver.findElement(shipping_Address1).sendKeys(shipAddress1);
		}
		
		
		public void enter_Shipping_City(String shipCity) {

			driver.findElement(shipping_City).sendKeys(shipCity);
		}
		
		
		public void enter_Shipping_State(String shipState) {

			driver.findElement( shipping_State).sendKeys(shipState);
		}

		
		public void enter_Shipping_zipCode(String shipZipCode) {

			driver.findElement(shipping_zip).sendKeys(shipZipCode);
		}
		
		
		
		public void Ship_to_billing_address_CheckBox() {
			
			driver.findElement(checkbox).click();
		}
		
		
		public void orderPage_Checkout() {
			
			driver.findElement(orderpage_Checkout).click();
		}
	}



