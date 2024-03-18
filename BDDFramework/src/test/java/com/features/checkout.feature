Feature: Place Order a product

@PlaceOrder
##Scenario: Search product in both product page and offer page
Scenario Outline: Search product in both product page and offer page


Given User is on GreenCartLandingPage
When user searched shortname <Name> and extract actual name of product
And added "3" items of selected product to the cart
Then user proceeds to Checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
|Name|
|Tom|
|Straw|
|Beet|