@DataDriven
Feature: DataDriven with example
Scenario Outline:: This is the login page
Given Proceed to login page
When user enters "<Username>" and password "<Password>"
And Clicked sumbit
Examples:
|Username | Password|
|Admin    |admin123 |
