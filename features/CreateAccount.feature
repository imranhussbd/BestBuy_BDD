@account
Feature: Create Account Validation

@stepsToAccount
Scenario: Create a Account
Given  user is in HomePage
When user clicks on account
And user clicks on create a account
Then user will be in Page Title Create a Account 

@createAccount
Scenario Outline: 
Given  user is in HomePage
When user clicks on account
And user clicks on create a account
Then user will be in Page <Title> Create a Account
And user input <First Name> in first name
And user input <Last Name> in last name
And user input <email> in email
And user input <password> in password
And user input <confirm password> in confirm password
And user will see password <match> text
And user input <phone number> in phone number
Examples: 
|Title																 		   |First Name|Last Name |email                     |password             |confirm password  |match                           |phone number|
|"Best Buy: Create an Account"|"Aniki"      |"Bankai"	   |"test1@testng.com" |"classname123"   |"classname123"    |"Your passwords match!"|2125558989   |
|"Best Buy: Create an Account"|"John"			  |"Wick"	     |"test2@testng.com" |"bleachname123" |"bleachname123"  |"Your passwords match!"|2125558977 	 |
|"Best Buy: Create an Account"|"Kratos"	  |"War"				 |"test3@testng.com" |"wutangname123"|"wutangname123"|"Your passwords match!"|2125558923   |