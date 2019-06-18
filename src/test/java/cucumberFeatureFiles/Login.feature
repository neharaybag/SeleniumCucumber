Feature: Login into account 
	Existing strava user should be able to login with correct credentials
	
Scenario: Login into account with correct details
	Given User navigates to Strava
	And user clicks on login button
	And user enters username as ""
	And user enters password as ""
	When user login to strava
    Then user should be naviageted to home page
	