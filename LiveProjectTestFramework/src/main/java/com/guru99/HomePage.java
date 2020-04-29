package com.guru99;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how = How.ID, using = "search")
	private WebElement searchTextBox;
	
	static String url = "http://live.demoguru99.com/index.php/";
	
	static String title = "Home page";	

	public void goTo() {
		Browser.goTo(url);
		
	}
	public boolean verifyTitle() {
		System.out.println(Browser.title());
		return Browser.title().equals(title);
	}
	public void searchProduct(String productName) {
		searchTextBox.click();
		searchTextBox.sendKeys(productName);
		searchTextBox.submit();
	
		
		
	}

}

