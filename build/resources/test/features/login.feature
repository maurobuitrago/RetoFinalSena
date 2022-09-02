Feature: Login
  i as services , i need login for see the products

  Scenario: Login Successful
    Given he user is on the page
    When he user enter credentials
    Then he could see the products

