Feature: Search by email

  Background:
    Given admin is logged into supplier pages

  Scenario Outline: Supplier admin search for customer by email
    When admin performs search by <email>
    Then admin redirected to Customer details page

    Examples:
      | email   |
      | "n2@fake.com" |