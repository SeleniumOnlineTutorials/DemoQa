Feature: Insurance Regestration

Scenario: Regestration Form Filling for Insurance

Given User navigates to Insurance Page
And User Clicks on Register button
Then Verify User is on Regestration page
And User enters the required fields 
|usertitle|fname   |sname   |phone     |dateOfBirth|full|licensePeriod|occupation|address   |city     |county|posatlCode|email                             |password|
|Mrs      |Vyshnavi|Dakarapu|1234567890|1990-1-23  |Full|5            |Doctor    |Plot: 1234|Hyderabad|India |53000081  |selenium.onlinetutorials@gmail.com|test123 |
