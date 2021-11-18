# Autor: Ricardo Barco
@Stories
Feature: uTest user registration
  As a new user, I want to register in the uTest webpage
  @scenario1
  Scenario: A new user correctly register in uTest
    Given that the user is on the uTest singUp page
    When the user provides the required personal information in each step
      | strFirstName  | strLastName       | strEmail       | strBirthMonth | strBirthDay | strBirthYear | strCity | strZip | strCountry | strComputerOs | strOsVersion | strOsLanguage | strMobileBrand | strMobileModel | strMobileOs | strPassword      |
      | *random name* | *random lastname* | *random email* | June          | 14          | 1999         | Neiva   | 140414 | Colombia   | Windows       | Windows 10   | Spanish       | Apple          | Iphone X       | iOS 12.0    | <random password>|
    Then the welcome uTest page should display
      | strWelcomeText                                                          |
      | Welcome to the world's largest community of freelance software testers! |