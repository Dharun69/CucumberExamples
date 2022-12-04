Feature: This is to verify the login feature for OrangeHRM
Scenario: This is the login scenorio
Given user is on the login page
When the user enters the valid credentials "Admin" and "admin123"
And the user clicks on the login button
Then should see the homepage 

