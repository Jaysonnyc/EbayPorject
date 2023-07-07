@regression @smoke
Feature: Ebay Cart Functionality

Background: 
		Given Open Ebay Homepage
	
	Scenario: Ebay cart functionality
		Given Search for Big Tall Cotton Tee
		When Select the shirt on item list
		And Select Size
		And Select Men Size
		And Select Shade
		And Select Quantity
		Then Add to shopping cart