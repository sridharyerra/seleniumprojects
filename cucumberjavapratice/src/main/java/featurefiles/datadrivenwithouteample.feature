#Data driven Without Examples Keyword
Feature: Yahoo Datadriven WithoutExample
#Scenario: Yahoo Signin without Exaple Scenario
#Given user is in yahoo page
#When yahoopage tile is yahoo
#Then user input "sridhar_yar" and "kitkat1$"
#And user clicks signin icon

# Data Driver with Example keyword and Scenario Outline
Scenario Outline: Yahoo Signin without Exaple Scenario
Given user is in yahoo page
When yahoopage tile is yahoo
Then user input "<username>" and "<password>"
And user clicks signin icon

Examples:
 | username    | password |
 | sridhar_yar | xxx1$ |
 | ravik       | xyz      | 
 