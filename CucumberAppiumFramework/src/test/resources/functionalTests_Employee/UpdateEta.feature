#Author: JID@1020122

@UpdateEta
Feature: Update Eta feature
Description: This feature explains the ETA operation available for pickup and drop stops for carrier persona

@UpdateEtaForPickupStop
Scenario: Employee should be able to update the ETA for stop
Given Driver selects "83208" assignment in accepted tab
 When User selects stop one from stops tab
 	And User taps on update ETA option
 Then ETA popover should be generated
 When User should be able to select data and time
  And User should be able to select Traffic congestion reason code and submit
 