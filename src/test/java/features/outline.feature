@outlineTest
Feature: Validating Login Functionality

Scenario Outline: Test Successful login case
Given User is on the login screen outline
When user provides correct username outline=<username>
And user provides correct password outline=<password>
Then user must login outline


Examples:
|username|password|
|"userA"|"passA"|
|"userB"|"userB"|