@ui @healthcheck
Feature: E-commerce Project Website Health Checkup

Background: Open the Url of the application
Given user navigate to the home applicatoon URL "https://automationexercise.com/"
Then user verify the home page is visible with title as "Automation Exercise"

@ValidateElementOnWebPage
Scenario: user navigate to the url and validate the element over the webpage
Given user click to product button
When user verify to the product page with title as "Automation Exercise - All Products"
Then user click to cart button
And user verify to the cart page with title as "Automation Exercise - Checkout"
And user click to signup/login button
Then user verify to the signup/login page with title as "Automation Exercise - Signup / Login"
And user click to Test Cases button
Then user verify to the Test Cases page with title as "Automation Practice Website for UI Testing - Test Cases"
And user click to API Testing button
Then user verify to the API Testing page with title as "Automation Practice for API Testing"
#And user click to video tutorials button
#Then user verify to the video tutorials page with url as "https://www.youtube.com/c/AutomationExercise" 
#Then url for the video tutorial page contains the "AutomationExercise" as keyword
And user click to Contact us button
Then user validate to the Contact us page with title as "Automation Exercise - Contact Us"


@HomePageSubscription
Scenario: user navigate to the url and verify the subscription 
Given user scroll down the home page
When user verify the text "SUBSCRIPTION"
Then user enter email address "ciwika1748@frandin.com"
And user click on arrow button
Then displayed success message "You have been successfully subscribed!" is visible


@InvalidateEmailPassForSighup/Login
Scenario Outline: user open the home page url and verify email id and password is Invalid and able to see the error message
Given click to signup/login button
When user redirected to login page with title as "Automation Exercise - Signup / Login"
Then user able to see the text "Login to your account"
And user enters email id as "<Email_Id>"
And user enters password as "<Password>"
Then user click to Login button
And EmailId and Password is not validate the user able to see the error message "Your email or password is incorrect!" is visisble
Examples:
|Email_Id                     |Password|
|mnalipatil@gmail.com         |Abc     |
|mnalipatil31@gmail.com       |ABC     |
|mnalipatil2233@gmail.com     |abc		 |


@validateEmailPassForSighup/Login
Scenario Outline: user open the home page url and verify email id and password is valid 
Given Yser click to signup/login button
When User redirected to login page with title as "Automation Exercise - Signup / Login"
Then User able to see the text "Login to your account"
And User enters email id as "<Email_Id>"
And User enters password as "<Password>"
Then User click to Login button 
Then after login user able to see "Logout" button at top header of application
And user is able to see "Delete Account" button at top header section of application
And with "<Logged_In_As>" as user name just after Logged in as button
Examples:
|Email_Id                   |Password  |Logged_In_As |
|ciwika1748@frandin.com     |123456.Abc|Ryan Wick    |
|ciwika1744@frandin.com     |123456.Abc|James Richard|