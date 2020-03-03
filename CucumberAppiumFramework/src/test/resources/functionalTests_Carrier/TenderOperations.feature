#Author: JID@1020122

@CarrierTenderOperations
Feature: Respond to tender feature for carrier
Description: This feature explains the tedner operations available for a load for carrier users

@TenderReject
Scenario: User should be able to reject the tender
Given User selects "61970" load 
 When User taps on respond to tender operation
 Then Respond to tender popover should be generated
 When User chooses reject option and submit
 Then Load not available to carrier and status changed as tender rejected for employee
 
 @TenderAccept
 Scenario: User should be able accept the tender
 Given User selects "61974" load
  When User taps on respond to tender operation
  Then Respond to tender popover should be generated
  When User chooses accept option and submit
  Then the load status should be updated as tender accepted
   