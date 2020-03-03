#Author: JID@1020122

@UpdateEta
Feature: Update Eta feature
Description: This feature explains the ETA operation available for pickup and drop stops for driver persona

@DriverUpdateEtaForPickupStop
Scenario: Driver should be able to update the ETA for stop
Given Driver selects "83208" assignment in accepted tab
When  User taps on Update ETA option in stop kebab menu
Then  ETA popover should be generated
When  User should be able to select data and time
And   User should be able to select Traffic congestion reason code and submit
Then  Confirmed ETA field should be updated successfully





