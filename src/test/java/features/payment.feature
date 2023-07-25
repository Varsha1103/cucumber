Feature: Validity payment functionality

@tag1 @tag3
Scenario: Comment selection one is working
Given user is logged in
When user enters comment
Then comment must be posted

@tag1
Scenario: Comment selection two is working
Given user is logged in
When user enters comment
Then comment must be posted