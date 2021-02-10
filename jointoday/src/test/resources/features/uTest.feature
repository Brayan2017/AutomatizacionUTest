# autor:Brayan Herrera

@stories
Feature: U Test
  As a user I want to fill out a form to create a new user

  @scenario1
  Scenario: Search for the UTest page
    Given that brayan wants to create a new user for the Utest page
    When  he searches for jointoday on the UTest page
      | strName       | strLastName    | strEmail            | strMonth  | strDay | strYear | strCity  | strPostal | strPassword |
      | Brayan Camilo | Herrera Balbin | bramilo25@gmail.com | September | 17     | 1995    | Medellín | 054448    | TestTwo1234 |
    Then  he creates a new user on the UTest page
      | strComplete                  |
      | Complete Setup chevron_right |