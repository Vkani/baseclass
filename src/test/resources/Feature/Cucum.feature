Feature: validating login functions of FB application
Scenario: validating by correct username and incorrect password
Given user launch FB application on chrome browser
When user enter username and password on FB page
And user click on login button
Then user validating home page is visible or not