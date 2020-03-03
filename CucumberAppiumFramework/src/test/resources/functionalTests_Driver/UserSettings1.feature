#Author: JID@1020122

@UserSettings
Feature: UserSettings feature
Description: This feature explains the driver functions in user settings page
	
 @UpdateDriverProfileDetails
 Scenario: Driver should be able to update the fiels in user settings page
 Given Driver navigates to user settings page
 When Driver long press on License number field and enter "LIC12345"
 And Driver long press on DOT ID field and enter "DOT12345"
 And Driver long press on tractor number field and enter "TN12345"
 And Driver saves those canges by tap on save button
 Then success popup message should be generated