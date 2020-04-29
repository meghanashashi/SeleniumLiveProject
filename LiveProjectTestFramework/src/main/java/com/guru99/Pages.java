package com.guru99;

import org.openqa.selenium.support.PageFactory;

public class Pages {

	public static HomePage homePage() {
		HomePage homePage = new HomePage();
		PageFactory.initElements(Browser.driver, homePage);
		return homePage; 
	}

	public static ProductPages productPages() {
		ProductPages productPages = new ProductPages();
		return productPages;
	}

	public static ProductPage mobilePage() {
		ProductPage mobilePage = new MobilePage();
		PageFactory.initElements(Browser.driver, mobilePage);
		return mobilePage;
	}

	

}
