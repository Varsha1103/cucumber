@selTestNew
Feature: Makemytrip login feature


Scenario: Login feature functionality

Given user is on the home page
When user enters mobile number "999999999"
And user clicks on continue
Then otp is sent "123456"
And user is able to login

