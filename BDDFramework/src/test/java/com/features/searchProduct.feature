Feature: Search and Order a product

@OffersPage
##Scenario: Search product in both product page and offer page
Scenario Outline: Search product in both product page and offer page


Given User is on GreenCartLandingPage
When user searched shortname <Name> and extract actual name of product
Then user searched for <Name> shortname in offer page
And validate product name in offer page matches the landing page

Examples:
|Name|
|Tom|
|Straw|
|Beet|