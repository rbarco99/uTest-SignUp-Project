# Autor: Ricardo Barco
@Stories
Feature: uTest user registration
  As a new user, I wan to to register in the uTest webpage
  @scenario1
  Scenario: A new user correctly register in uTest
    Given than the user is on the uTest singUp page
    When the user provides the required data in each step
    Then the welcome uTest page should display