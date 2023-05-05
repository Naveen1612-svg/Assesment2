Feature: To validate recently viewed careers module 

Scenario:
To verify the list of recently viewed careers and reversed when refreshed 
	And The user should login the application with valid credentials 
	When The user should Click on any 3 career paths as per his/her inspiration 
	And The user should store the recently viewed careers in collections 
	And The user go back on home page and refresh 
	Then The user verifies the list is reversed when compared to recently viewed careers list 
 