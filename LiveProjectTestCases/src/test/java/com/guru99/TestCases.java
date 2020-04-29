package com.guru99;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class TestCases {

	@Test
	public void verifySortByNameInMobilePage() throws IOException {
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().verifyTitle());
		ProductPage productPage = Pages.productPages().getProductPage("Mobile");
		productPage.goTo();
		Assert.assertTrue(productPage.verifyTitle());
		productPage.sortBy("Name");
		Assert.assertTrue(productPage.verifySortType("Name"));
		Browser.takescreenshots("verifySortByNameInMobilePage");
	}
	
	@Test
	public void verifyCostInListAndDetailsPage()
	{
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().verifyTitle());
		
		ProductPage productPage = Pages.productPages().getProductPage("Mobile");
		productPage.goTo();
		Assert.assertTrue(productPage.verifyTitle());
		
		Pages.homePage().searchProduct("Sony Xperia");
				
		Assert.assertTrue(productPage.verifyProductCost());
		
		
	}

	@AfterClass
	public static void closeBrowser() {
		Browser.close();
	}
}
