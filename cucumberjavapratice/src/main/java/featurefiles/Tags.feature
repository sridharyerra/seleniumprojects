Feature: FreeCRM Testing Feature
@SmokeTest @RegressionTest
Scenario: CRM Signin Scaenario
Given user is already in CRM loginpage
@SmokeTest
Scenario: CRM contacts Scaenario
Given user is already in CRM contactspage
@SmokeTest @E2ETest
Scenario: CRM deals Scaenario
Given user is already in CRM dealspage
@SmokeTest @RegressionTest
Scenario: CRM opp Scaenario
Given user is already in CRM opppage

Scenario: CRM home Scaenario
Given user is already in CRM homepage
@RegressionTest @E2ETest
Scenario: CRM leads Scaenario
Given user is already in CRM leadspage

Scenario: CRM signout Scaenario
Given user is already in CRM signout
