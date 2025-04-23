Feature: Login test

Scenario: successful login with valid credentials
Given User Launch Chrome Browser
When user open URL "https://admin-demo.nopcommerce.com/login"
And User enter Email as "admin@yourstore.com" and Password as "admin"
And Click on Login  
Then Page Title should be "DashBoard / nopCommerce administration"
When user click on the log out link
Then Page title should be "Your store. Login"
And Close brower 
