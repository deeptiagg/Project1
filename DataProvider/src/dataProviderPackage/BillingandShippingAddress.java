package dataProviderPackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BillingandShippingAddress {
	
	@DataProvider(name="Staging Test Data")			
	
	public static Object[][] formFields(){			
		return new Object[][]{ {"staging@Staging.com","5625621","Staging","Staging","123 anywher st","artesia",
			"CA","90701"},{"staging@Staging.com","5625621","Staging","Staging","321 anywher st","norwalk",
				"CA","90703"}};		
				
				
	}			
				

	@Test(dataProvider="Staging Test Data" )
	  public void SubOrder(String uEmail,String uPhone,String uFirstName, String uLastName, String uAddress1,String uCity,String uState, String uZip) throws Exception {				
			
			
			
			System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver.exe");		
		    WebDriver chrome= new ChromeDriver();			
			// Open Sheercover site		
			chrome.get("http://www.sheercover.com/order");		
					
			//Click on Checkout  Button		
			chrome.findElement(By.xpath("//a[@class='buttons-next next-page section-checkout']")).click();		
			
			Thread.sleep(3000);		
					
			chrome.findElement(By.xpath("//input[@id='dwfrm_personinf_contact_email'] ")).sendKeys(uEmail);		
			chrome.findElement(By.xpath("//input[@id='dwfrm_personinf_contact_daytimephone']")).sendKeys(uPhone);		
					
					
					
			        // enter first name		

					
  
	   chrome.findElement(By.xpath(" //input[@id='dwfrm_personinf_billtoaddress_firstName']")).sendKeys(uFirstName);


	//enter last name

	chrome.findElement(By.xpath("//input[@id='dwfrm_personinf_billtoaddress_lastName']")).sendKeys( uLastName);

	//enter the aadress
	chrome.findElement(By.xpath("//input[@id='dwfrm_personinf_billtoaddress_address1']")).sendKeys(uAddress1);

	//enter the city
	chrome.findElement(By.xpath("//input[@id='dwfrm_personinf_billtoaddress_city']")).sendKeys(uCity);

	//enter state
	chrome.findElement(By.xpath("//select[@id='dwfrm_personinf_billtoaddress_states_state']")).sendKeys(uState);

	//enter the zip
	chrome.findElement(By.xpath("//input[@id='dwfrm_personinf_billtoaddress_zip']")).sendKeys(uZip);
	
	chrome.close();
	}
}







	 
 

