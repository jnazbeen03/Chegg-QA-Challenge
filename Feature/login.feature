@login
Feature: Login to Chegg homepage.
Scenario Outline:Login
Given I am on Chegg homepage
When I put "<username>", "<password>" and click login
Then I successfully login 
Examples:
|username                    | password|
|jessifer.nazbeen@outlook.com| JN@45678|
|testuser+wh2ls8@example.com |testwh2ls8|
 
