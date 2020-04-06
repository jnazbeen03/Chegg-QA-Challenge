@setting
Feature: Verify login Chegg homepage.
Scenario Outline:Login page
Given I am able to go Chegg homepage
When I put username and password as "<username>", "<password>" and click login
Then I successfully login homepage
When I am able to click Settings button
When I click on Password
And I Verify Password 
And verify Displayname
And I check on Save Changes

Examples:
|username                    | password|
#|jessifer.nazbeen@outlook.com| JN@45678|
|testuser+wh2ls8@example.com |testwh2ls8|
 