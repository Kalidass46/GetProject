@Task8
Feature: To validate amozon sigin functionality

Scenario Outline: To validate the email no and password
    Given To launch chrome browser
    When To click the button of signin button
    And To enter the valid "<phone number>" in email or phone num field
    And To click thr continue button of button filed
    And To enter the valid "<password>" in password filed
    And To click the signIn button of the filed
   
    Examples: 
      | phone number   |password|
     	|	7094706010 		 |123432232|
      | 7695849959	   |ghjhg2345|
			| 7094706010   	|765432456|