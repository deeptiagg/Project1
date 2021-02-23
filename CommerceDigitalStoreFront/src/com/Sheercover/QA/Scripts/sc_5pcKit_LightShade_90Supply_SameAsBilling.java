package com.Sheercover.QA.Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Scheercover.QA.Pages.scCheckoutPage;
import com.Scheercover.QA.Pages.scOrderPage;
import com.Sheercover.QA.BaseTests.BaseTest;
import com.Sheercover.QA.utilityPackage.submitOrder;



public class sc_5pcKit_LightShade_90Supply_SameAsBilling extends BaseTest{




	// TODO Auto-generated constructor stub


	@Test(priority = 1)
	public void verifyPlaceAnOrder_5PcKit_LightShade_90Supply_SameAsBilling() throws Exception{ 

		scOrderPage op = new scOrderPage(driver);
		Thread.sleep(1000);
		op.click_5PcMineralMakeupKit();

		//select lightShade
		op.click_LightShade();

		Thread.sleep(4000);

		//select 90 supply
		op.click_90Day_Supply();
		Thread.sleep(4000);

		//click on checkout
		op.click_checkout();

		//verify 5pc kit with light shade and 90 day supply offercode
		op.verifyOfferCode();

		//verify 5pc kit with light shade and 90 day supply suntotal
		op.verifySubTotalPrice();
	}

	@Test(priority = 2)

	public void enter_sameAs_Billing() throws Exception {
		submitOrder.setFile("C:\\core java scrips\\EcommerceDigitalStoreFront\\com.sheercover.QA.utility\\utilityPackage\\testExcelSheet.xlsx","Sheet1");
		System.out.println("Excelfile Loaded");
		int lastRow = submitOrder.lastRow();
		System.out.println("Number of Rows in Excel:"+lastRow);


		for (int i=1;i<= lastRow;i++) {
			System.out.println("entered loop");


			scCheckoutPage shp = new scCheckoutPage(driver);
			//Enter Email
			shp.enter_Email(submitOrder.getCellData(i,0));
			System.out.println(submitOrder.getCellData(i,0));
			shp.enter_Phone(submitOrder.getCellData(i,2));
			shp.enter_firstName(submitOrder.getCellData(i,3));
			shp.enter_lastName(submitOrder.getCellData(i, 4));
			shp.enter_Address1(submitOrder.getCellData(i, 5));
			shp.enter_City(submitOrder.getCellData(i, 6));
			shp.select_State(submitOrder.getCellData(i, 7));
			shp.enter_zipcode(submitOrder.getCellData(i, 9));


		}
	}

	@BeforeMethod
	public void verifyPageTitle() {
		verifyHomepageTitle();

	}
	@AfterMethod
	public void takescreenShot() throws Exception  {
		takeScreenShot("C:\\core java scrips\\CommerceDigitalStoreFront\\src\\com\\Sheercover\\QA\\screenShotspackage\\90daysupply.png");
	}

	@BeforeClass
	public void Open_Site_Page() {
		System.out.println("TestNG is going to start:");
		initialization();

	}

	@AfterClass

	public void afterTest() {
		try {
			submitOrder.closeWrokBook();
			System.out.println("Excel workbook is closed");
			closeBrowser();
			System.out.println("TestNG has finished,took around"+(System.currentTimeMillis()));

		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}














