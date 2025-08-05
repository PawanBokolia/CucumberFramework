Feature: customer

  Background: 
    Given user launch chrome browser
    When user open URL : "http://admin-demo.nopcommerce.com/login"
    And user enter email as "admin@yourstore.com" and password as "admin"
    And click on the login
    Then user can view Dashboard

  Scenario: Add New Customer
    When user click on customers menu
    And click on customer Menu Item
    And click on add new button
    Then user can view add new customer page
    When user enter customer info
    And click on the save button
    Then user can view confirmation message "The new customer has been added successfully."
    And close browser

  Scenario: Search Customer by Email
    When user click on customer menu
    And click on customer Menu Item
    And click on customer email
    When click ob search button
    Then User should found Email in the search table
    And close browser

  @regression
  Scenario: Search Customer by Email
    When User click on customers Menu
    And click on customers Menu Item
    And Enter customer EMail
    When Click on search button
    Then User should found Email in the Search table
    And close browser

  @sanity
  Scenario: Search Customer by Name
    When User click on customers Menu
    And click on customers Menu Item
    And Enter customer FirstName
    And Enter customer LastName
    When Click on search button
    Then User should found Name in the Search table
    And close browser
