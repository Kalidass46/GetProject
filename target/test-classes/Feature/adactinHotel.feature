@HotelAdactin
Feature: To Validate the Login Functionality of adactin page

@login
Scenario: To Validate username and password

Given To launch Chorome Browser & hit the url

When To Enter the username in username field

And To enter the Password in pswd field

And To Click The Login button in this page

@SearchHotel
Scenario: To validate Search hotel

When To Select the location

And To select the hotels

And To select the room type

And To select the number of rooms

And To select checkin Date

And To select the checkout date

And To select the adult per room

And To click the Search button 

@SelectHotel
Scenario:To select the valid hotel 

When To select the radio button for select

And To click the Continue button

@BookHotel
Scenario: To book a valid hotel

When To enter the first name

And To enter the last name

And To enter the biling address

And To enter credit card number

And To select Credit card type

And To select expiry date month and year

And To enter ccv number

And To click the book now button

@Bookingconfirm

Scenario: To confirm the booking

When To click the my iteranary button

@BookedIternary
Scenario: To select one ordered hotel cancel

When To select the one cancelled oreder

And To click the cancel

And To click Logout button

Then To close The Browser
