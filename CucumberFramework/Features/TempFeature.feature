Feature: This is a sample feature
Scenario Outline: This is a user registration test with valid details
Description: In this scenario, we provide valid details to create a new user with “Pay My Client Bill” module enabled to use “Labcorp Link” application
	Given navigate to the Labcorp application login page 
	When User clicks on Create An Account button to register a new user with Pay My Client Bill module enabled
	And User enters “<Email>” and “<Title>” and “<FirstName>” and “<MIOption>” and “<LastName>” and “<LabcorpAccNum>” and “<ZipCode>” details as below
	And User selects Pay My Client Bill check box and Captcha and clicks on Create Account button
	Then User enters into a Token ID verification page
	When User enters Token ID received by above registered email address
	And Enters “<Password>”  sPassword  and Confirm Password
	And Click on submit button
Examples:
|		Email		|	Title	|	FirstName	|	MIOption|	LastName|	LabcorpAccNum	|	ZipCode		|	Password	|
|abc999@yopmail.com	|	Mr		|	First		|	MIO		|	Last	|	123457			|	271253		|	Password123!|

   