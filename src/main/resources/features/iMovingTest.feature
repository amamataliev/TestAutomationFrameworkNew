@iMoving
Feature: Confirmation Page functionality

  Background:
    Given User is on the "https://qa.imoving.com/"

  Scenario: Verify Moving Journey Button works
    Given user is on confirmation page
    Given User should navigate to moving journey button
    And User clicks on moving journey button
    Then pick up address should appear underneath

  Scenario: Verify Show on Map button in Moving Journey section works
    Given user is on confirmation page
    Given User should navigate to moving journey button
    And User clicks on moving journey button
    Then User clicks show on map button
    Then Map should appear underneath

  Scenario: Verify Addresses Restrictions button works
    Given user is on confirmation page
    Given User should navigate to addresses restrictions button
    And User clicks on addresses restrictions button
    Then Information chart should appear underneath

  Scenario: Verify Inventory-Items button works
    Given user is on confirmation page
    Given User should navigate to inventory items button
    And User clicks on inventory items button