#Author: JID@1020122

@DockCommitment
Feature: UserSettings feature
Description: This feature explains the driver functions in user settings page
	
@UploadUserProfilePictureUsingGallery
Scenario: Upload driver profile picture using gallery option
Given Driver navigates to user settings page
 When Driver chooses gallery by tap on camera icon
 And Driver selects photos option to open stored images
 And Driver selects photo and saved
 Then success popup message should be generated
 
 @UploadUserProfilePictureUsingCamera
 Scenario: Upload driver profile picture using camera option
 Given Driver navigates to user settings page
 When Driver chooses camera by tap on camera icon
 And Driver captures image and selected
 And Driver saves selected image
 Then success popup message should be generated
 
 @UpdateDriverProfileDetails
 Scenario: Driver should be able to update the fiels in user settings page
 Given Driver navigates to user settings page
 When Driver long press on License number field and enter "LIC12345"
 And Driver long press on DOT ID field and enter "DOT12345"
 And Driver long press on tractor number field and enter "TN12345"
 And Driver saves those canges by tap on save button
 Then success popup message should be generated
 
 