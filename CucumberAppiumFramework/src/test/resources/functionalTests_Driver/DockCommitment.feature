#Author: JID@1020122

@DockCommitment
Feature: Dock commitment feature
Description: This feature explains the dock commitment functionality with create, update and delete operations
	
@CreateDockCommitment
Scenario: create new dock commitment by providing data in define dock slot criteria screen
Given Driver selects "83208" assignment in accepted tab
	And Driver navigates to dock commitments page from docks tab
 When 	Driver navigates to create new dock commitment page from create icon
 And  Selecte stop Hanford store and provide Start Time as eight am and Duration as zero
 Then Duration should not be zero popup should be generated
 When Provide Duration as two hours and also Duartion Flexible By two hours
 Then Duration Flexibility should be less than Duration popup should be generated
 When Provide start time as five am and duration as ten hours and duration flexible by zero hours and flexible on start time as ON and click on Next button
 Then No dock slots available please relax your criteria popup should be genearated
 When Provide start time as five pm
 Then Duration should fall in the same day popup should be generated
 When Provide start time as eight am and duration as two hours and flexible on start time as ON and duration flexible by zero hour and proceed to select time slot screen from next button
 Then Found both exact and closed match
 When select exact match and proceed to dock confirmation screen from next button
 And Confirm the dock commitment from submit button
 Then success popup message should be generated
 When control should be navigated to docks tab screen from popup OK button
 
@UpdateDockCommitment
Scenario: update already created dock commitment
Description: Driver can update any dock commitment which was created by any other user or himself
Given Driver selects "83208" assignment in accepted tab
	And Driver navigates to dock commitments page from docks tab
When Select stop US Coast Fremont by tap on stop type icon and click on update icon
Then control should be navigated to update dock commitment page 
When update start date as current date and time
Then verify that the end date should be auto updated as start date plus duration
When click on submit button
Then control should be navigated to docks page

@ValidateBookedWhenClosedViolation
Scenario: Verify that the system should prevent Booked when closed violation during dock commitment creation
Given Driver selects "83208" assignment in accepted tab
	And Driver navigates to dock commitments page from docks tab
When Select stop US Coast Fremont and Start time as eight am and duration as two hours and flexible on start time ON and duration flexible by zero
Then No dock slots available please relax your criteria popup should be genearated

@ValidateOvercommitedAndInboundOutboundViolation
Scenario: Verify that the system should prevent Over commited and Inbound outbound violations durong dock commitment creation
Given Driver selects "83208" assignment in accepted tab
	And Driver navigates to dock commitments page from docks tab
When Select stop Milipitas store and Start time as eight am and duration as three hours and flexible on start time off and duration flexible by zero
Then No dock slots available please relax your criteria popup should be genearated
When Select stop Redwood store and Start time as eleven hours thirty six minutes am and duration as three hours and flexible on start time ON and duration flexible by zero
Then No dock slots available please relax your criteria popup should be genearated

@DeleteDockCommitment
Scenario: Delete already created dock commitment by the same user
Description: Driver can delete only those commitments which were created by the same drver
Given Driver selects "83208" assignment in accepted tab
	And Driver navigates to new dock commitment page from docks tab
When Select stop Hanford store by tap on stop type icon and verify delete icon should be displayed
And click on delete icon
Then confirm delete popup should be generated 
When click on delete button of popup
Then success message should be generated
When click on ok button of success popup
Then control should be navigated to docks page and dock commitment does not exists status should be displayed for the stop

