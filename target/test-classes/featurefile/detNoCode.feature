@detego4
Feature: user has to create New Account on Detego Provider Portal

Background:
Given user have to launch detego health prov portal using chrome browser1

Scenario: user have to create new account in provider page

When user have to click the provider button and click create an account button1
Then click being registered button00

And user have to enter mailId and click continue
|email|
|joy@gmail.com|

Then user have to click code menu and click not received it function

Then user have to fill registration help and click submit 
|joy|
|123456789|
|7894628910|
|for testing purpose|
|12345678|

Then user have to close the chrome