#Author: JID@1020122

@Contacts
Feature: Contacts feature
Description: This feature explains the Contacts operation available for pickup and drop stops for carrier and employee personas

@DriverContactsOperation
Scenario: Carrier should be able to conatct the concern person of stop
Given Driver selects "83208" assignment in accepted tab
 When User selects stop one from stops tab
  And User opens location details from location link
  And User taps on contacts option
 Then Contacts popover should be generated
 When Driver selects sms option
 Then Driver should be navigated to messanger screen
 When Driver navigates back to stop overview screen from messanger 
  And User taps on contacts option
 Then Contacts popover should be generated
 When Driver selects call option
 Then Driver should be navigated to dialpad screen
 When Driver navigates back to stop overview screen from dialpad
  And User taps on contacts option
 Then Contacts popover should be generated
 When Driver selects email option
 Then Driver should be navigated to gmail screen
 When Driver navigates back to stop overview screen from gmail








