Feature: Login and Logout Test

	Scenario: Login Test
		Given the browser launch and navigate to url
		When Enter username and password
		And click on login
		Then welcome admin message dispalyed
		
	Scenario: Logout
		When the tester clicks on welcome admin link
		And also clicks on logout
		Then display the login page 	