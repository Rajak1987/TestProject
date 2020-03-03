#Author: JID@1020122

@ConfirmStopOperations
Feature: Confirm Stop feature
Description: This feature explains the confirm stop operations available for pickup and drop stops for driver persona

@ConfirmPickupStop
Scenario: Driver should be able to confirm the pickup stop
Given Driver selects "87201" assignment in offered tab
 When Driver accepts the assignment by tap on accept button
 Then Assignment status should be changed to Accepted
 When Driver taps on ON DUTY button
 Then Assignment status should be chaged to ON DUTY
 When Driver taps on process pickup button
 Then Driver should be navigated to review Items page
 When Driver should be able to launch confirm stop popover
  And Driver selects reported date and time and completes confirm stop operation by tap on Done button
 Then Stop Status should be changed to Pickup complete
 
 @ConfirmDropStopByAttachPODWithCaptureOption
Scenario: Driver should be able to confirm the drop stop by attaching hardcopy of POD document from camera capture ooption
Given Driver selects "87201" assignment in ON DUTY card
When Driver taps on process delivery button
Then delivery options popover should be generated
When Driver chooses Attach POD option and proceed to process delivery page
And Driver taps on plus icon
Then Attach Document options popover should be generated
When Driver should be able to open camera from cature option
And Driver should be able to capture photo
And Driver selects captured image and taps on Attach POD button
Then Captured document should be uploaded successfully 
When Driver should be able to launch confirm stop popover from submit button
And Driver selects reported date and time and completes confirm stop operation by tap on Done button
Then Stop Status should be changed to delivery complete

@ConfirmDropStopByAttachPODWithGalleryOption
Scenario: Driver should be able to confirm the drop stop by attaching hardcopy of POD document from gallery ooption
Given Driver selects "87201" assignment in ON DUTY card
When Driver taps on process delivery button
Then delivery options popover should be generated
When Driver chooses Attach POD option and proceed to process delivery page
And Driver taps on plus icon
Then Attach Document options popover should be generated
When Driver should be able to open gallery from gallery option
And Driver should be able to select image from gallery
And Driver selects gallery image and taps on Attach POD button
Then Gallery document should be uploaded successfully 
When Driver should be able to launch confirm stop popover from submit button
And Driver selects reported date and time and completes confirm stop operation by tap on Done button
Then Stop Status should be changed to delivery complete

@ConfirmDropStopByConfirmStopOperation
Scenario: Driver should be able to confirm the drop stop by performing confirm stop operation
Given Driver selects "87201" assignment in ON DUTY card
When Driver taps on process delivery button
Then delivery options popover should be generated
When Driver chooses Confirm Stop option 
Then Driver should be navigated to review Items page
When Driver should be able to launch confirm stop popover
And Driver selects reported date and time and completes confirm stop operation by tap on Done button
Then Stop Status should be changed to delivery complete

#@ConfirmDropStopBySigOnGlassFeature
#Scenario: Driver should be able to confirm the drop stop by performing sign on glass feature
#Given Driver selects "83209" assignment in accepted tab
#When Driver taps on process delivery tab
#Then delivery options popover should be generated
#When Driver chooses digital signature option and proceed to process delivery step 1 of 2 page
#And Driver edits Pallets as "2"  and weight as "2020" by tap on edit icon
#And Driver proceeds to process delivery step 2 of 2 page by tap on next button
#And Driver provide Signature Name as "TMU Mobile" and Notes as "Delivered Over" and tap on Tap to Sign button
#And Driver should be able to sign as "TMU Mobile" and confirm the stop by tap on save button
#Then Control should be navigated to stop overview page and stop status should be updated as Dropped






