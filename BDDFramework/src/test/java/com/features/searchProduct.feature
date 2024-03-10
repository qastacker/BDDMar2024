Feature: Search and Order a product

Scenario: Search product in both product page and offer page

Given User is on GreenCartLandingPage
When user searched shortname "Tom" and extract actual name of product
Then user searched for "Tom" shortname in offer page
And validate product name in offer page matches the landing page