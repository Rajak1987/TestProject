@RegistrationFeature
Feature: Login feature
Description: This feature has registration functionality scenarios

@SuccessfulRegistration
Scenario Outline: Create a new user 
Description:this scenario validates the successfull registration

Given user is on homepage
When click Join us to create a new user account
Then Signup page should be opened
When enter "<UserName>" and "<Email>" and "<Password>" and "<ConfirmPassword>" and submit
Then user is created successfully
Examples:
|	UserName		|	Email		|	Password		|	ConfirmPassword		|
|	UserName1		|	Email1		|	 Password1		|	ConfirmPassword1	|
|	UserName2		|	Email2		|	 Password2		|	ConfirmPassword2	|

@LoginTest
Scenario Outline: New user must be login into app

Given user is on homepage
Then Login page should be displayed
When enter valid "<Email>" and "<Password>" and click login
Examples:
|		Email		|		Password	|
|		Email1		|		Password1	|
|		Email2		|		Password2	|