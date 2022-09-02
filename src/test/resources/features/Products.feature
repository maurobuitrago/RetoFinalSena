Feature: Products

  Scenario: add a products to list
    Given he user is on the page
    When he user add product
    Then he user could see the product in the product list
