package com.guru99;

public class ProductPages {

	public ProductPage getProductPage(String product) {
		switch (product) {
		case "Mobile":
			return Pages.mobilePage();
		}
		return null;
	}
	
	

}
