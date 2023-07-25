@parallelTest
Feature: testing parallel

Scenario Outline: Parralel execution using testng

Given user on the site to test parallel
When url is launched <url> to test parallel
Then close the site to test parallel

Examples:
|url|
|"https://www.amazon.in/"|
|"https://www.flipkart.com/"|
