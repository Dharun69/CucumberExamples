@OpenGoogle
Feature: This is to test google search
Scenario: Google search scenario
  Given user is entering google.com
  When user is typing the search term "Bikes"
  And enters the return key.
  Then the user should see the search results