#Author: JID@1020122

@AttachDocument
Feature: Attach Document feature
Description: This feature explains the attach document operations available at loads and stops for driver persona

@AttachDocumentFromGallery
Scenario: Driver should be able to attach the document from gallery option at load and stop
Given Driver selects "83208" assignment in accepted tab
When  Driver taps on attach document option in load kebab menu
Then  Attach Document options popover should be generated
When  Driver should be able to open gallery from gallery option
And   Driver should be able to select image from gallery
And 	  Driver selects image and taps on Attach Document button
Then  Gallery document should be uploaded successfully 
When  Driver taps on attach document option in stop kebab menu
Then  Attach Document options popover should be generated
When  Driver should be able to open gallery from gallery option
And   Driver should be able to select image from gallery
And 	  Driver selects image and taps on Attach Document button
Then  Gallery document should be uploaded successfully

@RetrieveAttachedDocument
Scenario: Driver should be able to retrieve the attached document from load and stop
Given Driver selects "83208" assignment in accepted tab
When Driver opens Load Documents tab from Documents tab
And  Driver taps on attached document link
Then Document should be visible
When Driver opens Stop Documents tab from Documents tab
And  Driver taps on attached document link
Then Document should be visible

@RemoveAttachedDocument
Scenario: Driver should be able to remove the attached document from load and stop
Given Driver selects "83208" assignment in accepted tab
When Driver opens Load Documents tab from Documents tab
And  Driver taps on delete icon of the attachment
Then confirm Delete popover should be generated
When Driver deletes attachment by tap on delete button of confirmation popover
Then Document should be deleted successfully
When Driver opens Stop Documents tab from Documents tab
And  Driver taps on delete icon of the attachment
Then confirm Delete popover should be generated
When Driver deletes attachment by tap on delete button of confirmation popover
Then Document should be deleted successfully







