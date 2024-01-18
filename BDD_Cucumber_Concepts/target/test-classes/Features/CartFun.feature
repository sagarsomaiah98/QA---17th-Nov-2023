Feature: Cart Functionality
Scenario: Add the items to cart

Given I launch the chrome browser and I navigate to the url "https://saucedemo.com"
When I enter the username "standard_user" and enter the password "secret_sauce"
And I click on login
And I add the items to the cart
Then I verify items is added to the cart