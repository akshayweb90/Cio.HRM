@HRM
Feature: Login page

  Background: 
    Given I am in backGround

  Scenario: Login to orangeHRM
    Given user is on login Page
    When User gives the credential
    Then user is on dashboard

  Scenario: Login to orangeHRM
    Given user is on login Page
    When User gives the credential
    Then user is on dashboard
