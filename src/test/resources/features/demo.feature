#language: en
Feature: Demo Testing with Serenity BDD

  Background:


  Scenario: Login page
    Given enter to page "https://www.demoblaze.com/index.html"
    When type login credentials
    Then validate correct access