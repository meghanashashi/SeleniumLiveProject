package com.guru99;

public abstract class ProductPage {

	public abstract boolean verifySortType(String string);

	public abstract void goTo();

	public abstract boolean verifyTitle();

	public abstract void sortBy(String string);

	public abstract String readCostOfProduct();

	public abstract Boolean verifyProductCost();

	public abstract void goToDetailsPage();

}
