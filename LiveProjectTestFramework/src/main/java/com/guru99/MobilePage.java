package com.guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MobilePage extends ProductPage {

	@FindBy(how=How.CSS, using = "a.level0")
	private WebElement Product;
	
	@FindBy(how=How.XPATH, using = "//select[@title=\"Sort By\"]")
	private List<WebElement> SortList;
	
	@FindBy(how=How.CLASS_NAME, using = "price")
	private WebElement Item;
	
	@FindBy(how=How.CLASS_NAME, using = "product-name")
	private WebElement ItemHeader;
	
	
	static String listPrice;
	static String detailPrice;

	static String title = "Mobile";
	
	WebElement sortMenu;
	Select select;

	@Override
	public void goTo() {
		// Browser.driver.findElements(By.linkText("Mobile")).get(0).click();
		//Browser.driver.findElement(By.cssSelector("a.level0")).click();
		Product.click();
			
	}

	@Override
	public boolean verifyTitle() {
		return Browser.title().equals(title);
	}

	@Override
	public void sortBy(String sortType) {
		switch (sortType) {
		case "Name":
			//Browser.driver.findElements(By.xpath("//select[@title=\"Sort By\"]")).get(0);
			sortMenu = SortList.get(0);
			select = new Select(sortMenu);
			select.selectByVisibleText(sortType);
			
		}

	}
	
	@Override
	public boolean verifySortType(String sortType) {
		WebElement Options = SortList.get(0);
		Select selectFirstOption = new Select(Options);
		return selectFirstOption.getFirstSelectedOption().getText().equals(sortType);
	}

	@Override
	public String readCostOfProduct() {
		return Item.getText();
		
	}

	@Override
	public Boolean verifyProductCost() {
		listPrice = readCostOfProduct();
		goToDetailsPage();
		detailPrice = readCostOfProduct();
		return (listPrice.equals(detailPrice));
	}

	@Override
	public void goToDetailsPage() {
		ItemHeader.findElement(By.tagName("a")).click();
		
	}

}
