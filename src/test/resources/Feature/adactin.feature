Feature: validating login functions of Adactin application
Scenario Outline: validating by correct username and correct password
Given user launch Adaction application on chrome browser
When user enter "<username>" and "<password>" on Adactin page
And user click on login button
And user enter "<location>","<hotels>","<Roomtype>","<no of room>","<checkin>","<checkout>","<adults>","<child>" on search hotel page
And click on search button
And select hotel in select hotel page
And click submit button
When user enter "<first name>","<last name>","<address>","<cc no>", "<cc type>","<expiry no>","<exp year>","<cvv>" on booking page
And click button booking
When order id is generated get the value


Examples:
|username     |password|location|hotels        |Roomtype|no of room|checkin		|checkout		|adults  |child   |first name|last name|address|cc no|cc type|expiry no|exp year|cvv|
|Nithyasundari|VE0W90  |London  |Hotel Sunshine|Delux   |1 - One   |12/03/2022|	13/03/2022|	2 - Two |1 - One |vk|kani|chennai|1234567890123456|VISA|May|2012|233|
