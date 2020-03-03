@RegistratioFeature
Feature: Register New User for Pay my client bill module
Description: This feature validates the registration of new user with “Pay My Client Bill” module enabled

@RegisterNewUser_PMCB
Scenario Outline: This is a user registration test with valid details
Description: In this scenario, we provide valid details to create a new user with “Pay My Client Bill” module enabled to use “Labcorp” application

Given User opens Labcorp application
When User clicks on Create An Account button to register a new user with “Pay My Client Bill” module enabled
And User enters “<Email>” and “<Title>” and “<FirstName>” and “<MIOption>” and “<LastName>” and “<LabcorpAccNum>” and “<ZipCode>” details as below
And User selects Pay My Client Bill check box and Captcha and clicks on Create Account button
Then User enters into a Token ID verification page
When User enters Token ID received by above registered email address
And Enters Password  and Confirm Password as “<Password>” 
And Click on submit button
Then User must be login into Labcorp application with this registered account “<Email>” and “<Password>” details
#And Verify that Pay My Client Bill card should be available to this user
Examples:
|		Email		|	Title	|	FirstName	|	MIOption|	LastName|	LabcorpAccNum	|	ZipCodde	|	Password	|
|abc999@yopmail.com	|	Mr		|	First		|	MIO		|	Last	|	123457			|	271253		|	Password123!|

