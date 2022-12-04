@Hooks
Feature: Explaining Hooks
Scenario: This is to login to hrm and edit the my info.
Given user is on the logged page
When the user is trying to logging through username and password
And the user logged in and clicked the my info
Then user edit the and saved the details
