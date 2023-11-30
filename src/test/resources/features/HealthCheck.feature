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
And user click to Contact us button
Then user validate to the Contact us page with title as "Automation Exercise - Contact Us"



@HomePageSubscription
Scenario: user navigate to the url and verify the subscription 
Given user scroll down the home page
When user verify the text "SUBSCRIPTION"
Then user enter email address "manalipatil796@gmail.com"
And user click on arrow button
Then displayed success message "You have been successfully subscribed!" is visible
