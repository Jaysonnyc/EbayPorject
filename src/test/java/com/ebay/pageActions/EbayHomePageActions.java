package com.ebay.pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.ebay.pageElements.EbayHomePageLocators;
import com.ebay.utilities.SetupDrivers;


public class EbayHomePageActions {

	EbayHomePageLocators EbayHomePageLocatorsObj;

	public EbayHomePageActions(){
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}

	public void searchShoes() throws Exception{
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomePageLocatorsObj.btnSearch.click();
		Thread.sleep(2000);
	}

	public void searchShirts() throws Exception{
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shirts");
		EbayHomePageLocatorsObj.btnSearch.click();
		Thread.sleep(2000);
	}

	public void searchPants() throws Exception{
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Pants");
		EbayHomePageLocatorsObj.btnSearch.click();
		Thread.sleep(2000);
	}

	public void searchItems(String items){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(items);
		EbayHomePageLocatorsObj.btnSearch.click();
		//	EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
	}

	public void mouseHoverMyEbay() throws Exception{

		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsObj.linkMyEbay);
		actions.perform();
		Thread.sleep(2000);
	}

	public void clickSummary() throws Exception{
		EbayHomePageLocatorsObj.linkSummary.isEnabled();
		EbayHomePageLocatorsObj.linkSummary.click();
		Thread.sleep(2000);
	}
	//testing


}