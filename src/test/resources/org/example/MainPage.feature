Feature: Main Page Website
  These tests will verify the functionality of the main page website

  Scenario: Input a valid email address
    Given i am on the main page website
    When  i input the email "testcase@testcase.com"
    Then  a pop-up appears with succesful subscribed for the newsletter

  Scenario: Input a invalid email address example 1
    Given i am on the main page website
    When  i input the email "testcase-testcase.com"
    Then  email field border turns red

  Scenario: Input a invalid email address example 2
    Given  i am on the main page website
    Then   i input the email "testcase@testcase"
    Then   email field border turns red

  Scenario: Verify the 'Start the Enrollment' button
    Given i am on the main page website
    When  i click the 'Start the Enrollment' button
    Then  i am taken to the 'Sign up' page

  Scenario: Verify 'What you will learn' button and fundamentals page
    Given  i am on the main page website
    When   i click the 'What you`ll learn' button
    And    i click the 'Read More' button
    Then   i am taken to the 'Fundamentals' page