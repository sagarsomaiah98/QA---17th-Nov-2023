Feature: Login Functionality
Scenario: Valid Login Functionality

Given I launch the chrome browser and I navigate to the url "https://saucedemo.com"
When I enter the username "standard_user" and enter the password "secret_sauce"
And I click on login
Then I am logged in Successfully

Scenario: InValid Login Functionality

Given I launch the chrome browser and I navigate to the url "https://saucedemo.com"
When I enter the username "username1" and enter the password "password1"
And I click on login
Then error message is displayed