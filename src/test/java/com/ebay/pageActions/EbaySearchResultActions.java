package com.ebay.pageActions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ebay.pageElements.EbaySearchResultLocators;
import com.ebay.utilities.SetupDrivers;

public class EbaySearchResultActions {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}
	
	public void verifyPantsItems(){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
	}
	
	public void verifyShirtsItems(){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	}
	
	public void selectShirt() throws Exception{
		Thread.sleep(2000);
		EbaySearchResultLocatorsObj.linkShirtItems.click();
		Thread.sleep(2000);
	}
}
