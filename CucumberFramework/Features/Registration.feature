@RegistrationFeature
Feature: Login feature
Description: This feature has registration functionality scenarios

@SuccessfulRegistration
Scenario: Create a new user 
Description:this scenario validates the successfull registration

Given user is on homepage
When click Join us to create a new user account
Then Signup page should be opened
When enter valid user details and submit
|	UserName	|	email				|	password		|	confirmPassword	|
|	rajak		|	rajak.123@gmail.com	|	 abc123			|	abc123			|
Then user is created successfully
And Get value from db