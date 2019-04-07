Feature: FreeCRM Testing Feature

@First
Scenario: CRM Dealspage Scenarion
Given user is already in CRM loginpage
When user click newdeal
Then user enter deal
@Second
Scenario: CRM contacts Scenarion
Given user is already in CRM contacts
When user click contacts
