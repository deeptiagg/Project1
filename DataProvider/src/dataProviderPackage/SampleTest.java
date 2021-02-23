package dataProviderPackage;


	


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.checkoutPage;

public class SampleTest {
public static WebDriver driver;
	
	
	@DataProvider(name="Staging Different Billing")
	public static Object[][] formSubmit(){
		
		return new Object[][]{{"C://Selenium//chromedriver.exe","staging@Staging.com","5625625621","Staging","Staging","123 anywher st","artesia","CA","90701","Staging","Staging","321 anywher st","cerritos","CA","90703"},
			{"C://Selenium//geckodriver.exe","staging@Staging.com","5625625621","Staging","Staging","123 anywher st","artesia","CA","90701","Staging","Staging","321 anywher st","cerritos","CA","90703"}
		,{"C://Selenium//MicrosoftWebDriver.exe","staging@Staging.com","5625625621","Staging","Staging","123 anywher st","artesia","CA","90701","Staging","Staging","321 anywher st","cerritos","CA","90703"}
		};
	}
	
	
	


	
	
	@Test(dataProvider="Staging Different Billing")
	public static void Sc_DifferentBilling(String driverPath,String billingEmail,String billingPhone,String billingFirstName,String billingLastName, String billingAddress1,String billingCity,String billingState, String billingZip,String shippingFirstName,String shippingLastName,String shippingAddress1,String shippingCity,String shippingState,String shippingZip) throws Exception {
		
	if (driverPath=="C://Selenium//chromedriver.exe") {
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		
			driver=new ChromeDriver();
		driver.get("https://www.sheercover.com/order");	
		
		
		
		
		checkoutPage cp = new checkoutPage(driver);
		
		cp.orderPage_Checkout();
		
		Thread.sleep(3000);
		
		cp.enter_Billing_Email(billingEmail);
		cp.enter_Billing_Phone(billingPhone);
		cp.enter_Billing_FirstName(billingFirstName);
		cp.enter_Billing_LastName(billingLastName);
		cp.enter_Billing_Addres1(billingAddress1);
		cp.enter_Billing_City(billingCity);
		cp.enter_Billing_State(billingState);
		cp.enter_Billing_zipCode(billingZip);
		
		cp.Ship_to_billing_address_CheckBox();
		
		
		cp.enter_Shipping_FirstName(shippingFirstName);
		cp.enter_Shipping_LastName(shippingLastName);
		cp.enter_Shipping_Addres1(shippingAddress1);
		cp.enter_Shipping_City(shippingCity);
		cp.enter_Shipping_State(shippingState);
		cp.enter_Shipping_zipCode(shippingZip);
		
		
		
			
	}
	
	
	/*else if (driverPath=="C://Selenium//geckodriver.exe") {
		
		System.setProperty("webdriver.gecko.driver",driverPath);
		
		driver=new FirefoxDriver();
	driver.get("https://www.sheercover.com/order");	
	
	checkoutPage cp = new checkoutPage(driver);
	
	cp.orderPage_Checkout();
	Thread.sleep(3000);
	
	cp.enter_Billing_Email(billingEmail);
	cp.enter_Billing_Phone(billingPhone);
	cp.enter_Billing_FirstName(billingFirstName);
	cp.enter_Billing_LastName(billingLastName);
	cp.enter_Billing_Addres1(billingAddress1);
	cp.enter_Billing_City(billingCity);
	cp.enter_Billing_State(billingState);
	cp.enter_Billing_zipCode(billingZip);
	
	cp.Ship_to_billing_address_CheckBox();
	
	
	cp.enter_Shipping_FirstName(shippingFirstName);
	cp.enter_Shipping_LastName(shippingLastName);
	cp.enter_Shipping_Addres1(shippingAddress1);
	cp.enter_Shipping_City(shippingCity);
	cp.enter_Shipping_State(shippingState);
	cp.enter_Shipping_zipCode(shippingZip);
	
		
		
		
	}*/
	
	else if (driverPath=="C://Selenium//MicrosoftWebDriver.exe"){
		

		System.setProperty("webdriver.edge.driver",driverPath);
		
		driver=new EdgeDriver();
		driver.manage().deleteAllCookies();
	driver.get("https://www.sheercover.com/order");	
	driver.manage().window().maximize();
	
	checkoutPage cp = new checkoutPage(driver);
	
	cp.orderPage_Checkout();
	Thread.sleep(3000);
	
	cp.enter_Billing_Email(billingEmail);
	cp.enter_Billing_Phone(billingPhone);
	cp.enter_Billing_FirstName(billingFirstName);
	cp.enter_Billing_LastName(billingLastName);
	cp.enter_Billing_Addres1(billingAddress1);
	cp.enter_Billing_City(billingCity);
	cp.enter_Billing_State(billingState);
	cp.enter_Billing_zipCode(billingZip);
	
	cp.Ship_to_billing_address_CheckBox();
	
	
	cp.enter_Shipping_FirstName(shippingFirstName);
	cp.enter_Shipping_LastName(shippingLastName);
	cp.enter_Shipping_Addres1(shippingAddress1);
	cp.enter_Shipping_City(shippingCity);
	cp.enter_Shipping_State(shippingState);
	cp.enter_Shipping_zipCode(shippingZip);
	
	
		
	}
	
	
	
	
	else {
		
		System.out.println("Test Failed");
	}
		driver.quit();
	}
	
}