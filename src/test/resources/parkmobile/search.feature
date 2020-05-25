Feature: Search by email

  Background:
    Given admin is logged into supplier pages

  Scenario Outline: supplier admin search for customer by email
    When admin performs search by <email>
    Then admin redirected to customer details page
    And products tab displayed
    When admin switches to customer tab
    Then customer email is <email>

    Examples:
      | email   |
      | "n2@fake.com" |