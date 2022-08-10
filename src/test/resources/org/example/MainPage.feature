Feature: Main Page Website
  These tests will verify the functionality of the main page website

  Scenario: Input a valid email address
    Given i am on the main page website
    When  i input for newsletter the email "testcase@testcase.com"
    Then  a pop-up appears with succesful subscribed for the newsletter

  Scenario: Input a invalid email address example 1
    Given i am on the main page website
    When  i input for newsletter the email "testcase-testcase.com"
    Then  email field border turns red

  Scenario: Input a invalid email address example 2
    Given  i am on the main page website
    Then   i input for newsletter the email "testcase@testcase"
    Then   email field border turns red

  Scenario: Verify the 'Start the Enrollment' button
    Given i am on the main page website
    When  i click the 'Start the Enrollment' button
    Then  i am taken to the 'Sign up' page

  Scenario: Verify 'What you will learn' button and fundamentals page
    Given  i am on the main page website
    When   i click the 'What you`ll learn' button
    Then   i am taken to 'Learn The Fundamentals' page
    And    i click the 'Read More' button
    Then   i am taken to the 'Fundamentals' page

  Scenario: Verify 'Question' button and page
     Given i am on the main page website
     When  i click on the 'Questions' button
     Then  i am taken to the 'Frequently Asked Questions' page
     And   i click on the all four questions accordion buttons

  Scenario: Verify 'Instructors' button and page
     Given i am on the main page website
     When  i click on the 'Instructors' button
     Then  i am taken to the to the 'Our Instructor' page

  Scenario: Verify social media links for 'John Doe' instructor
     Given i am on the main page website
     When  i click the 'Twitter' button
     Then  i am taken to the 'Twitter' page
     When  i click the 'Facebook' button
     Then  i am taken to the 'Facebook' page
     When  i click the 'Linkedin' button
     Then  i am taken to the 'Linkedin' page
     When  i click the 'Instagram' button
     Then  i am taken to the 'Instagram' page

  Scenario: Verify Sign up page - personal information section
    Given i am on the personal information page
    And   i input the first name 'Adrian'
    And   i input the last name 'Leonte'
    And   i input the username 'Drianu'
    And   i input the password 'testcase'
    And   i input the confirm password 'testcase'
    When  i click the next button for personal information page
    Then  i am taken to the 'Contact information' page

  Scenario: Verify Sign up page - contact information section
    Given i am on the 'Contact information' page
    And   i input the email 'testcase@testcase.com'
    And   i input the phone number '0743560452'
    And   i input the country 'Romania'
    And   i input the city 'Brasov'
    And   i input the postcode '500365'
    When  i click the next button on contact information page
    Then  i am taken to the 'Course options' page
