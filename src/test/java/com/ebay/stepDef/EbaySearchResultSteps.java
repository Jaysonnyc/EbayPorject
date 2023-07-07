package com.ebay.stepDef;

import com.ebay.pageActions.EbaySearchResultActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbaySearchResultSteps {

	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyShoesItems();
		Thread.sleep(2000);
	}
	
	@Then("^Item list should have only Pants related products$")
	public void item_list_should_have_only_Pants_related_products() throws Throwable {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyPantsItems();
		Thread.sleep(2000); 
	}
	
	@Then("^Item list should have only Shirts related products$")
	public void item_list_should_have_only_Shirts_related_products() throws Throwable {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyShirtsItems();
		Thread.sleep(2000);
	}
	
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsObj.selectShirt();
	}
}