@Amazon4
Feature: To validate login Functionality of Amazon application

@Task4
Scenario: To Validate invalid email and valid Password

Given To Launch The chrome browser and hit the url

When To Click signin in Amazon application

And To Enter invalid emailid in email field

And To Click continue button

And To enter valid pswd

And To click signIn in the button

Then To close Chrome Browser


@Task44
Scenario: To valid valid phonenum and invalid pswd

Given To Launch chrome browser and hit url

When To click SignIn button

And To enter valid phonenum

And To click thre Continue button

And To enter Invalid pswd

And To Click the sign button
	
Then To cLose the browser