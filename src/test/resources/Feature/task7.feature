@Task7
Feature: To Validate login funtionality Of Facebook Application

@Task71
Scenario: To validate valid email and Invalid password in the login functionality

Given To launch the firefix browser and hit the url

When To enter the Valid Email in emaild field

And To enter the Invalid password in password field

And To click the login button in the Login Button

@Task72
Scenario Outline: To Validate Valid EMail and Invalid password in the Login functionality

Given To launch the firefox browser and hit the url

When To enter the Valid eMail in emaild field

And To enter the invalid PassWord in password field

And To click the login button In the Login Button

Then Close the browser
