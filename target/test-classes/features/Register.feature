#Author: auxiliarosely466@gmail.com

@SoftwareTestingApplication
Feature: Register page
 
      @register1
   Scenario: Verify whether user is able to register a customer
    Given I navigated to software testing web application 
     When I clicked on create an account link
    And I have entered new customer information
    And Clicked on Register button
    Then I validate customer registration
 
    
    
      

 
