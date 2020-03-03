#Author: JID@1020122

@Contacts
Feature: Contacts feature
Description: This feature explains the Contacts operation available for pickup and drop stops for driver persona

@DriverContactsOperation
Scenario: Driver should be able to conatct the concern person of stop
Given Driver selects "83208" assignment in accepted tab
When Driver taps on Contacts option in stop kebab menu
Then Contacts popover should be generated
When Driver selects sms option
Then Driver should be navigated to messanger screen
When Driver navigates back to stop overview screen from messanger 
And  Driver taps on Contacts option in stop kebab menu
Then Contacts popover should be generated
When Driver selects call option
Then Driver should be navigated to dialpad screen
When Driver navigates back to stop overview screen from dialpad
And  Driver taps on Contacts option in stop kebab menu
Then Contacts popover should be generated
When Driver selects email option
Then Driver should be navigated to gmail screen
When Driver navigates back to stop overview screen from gmail








