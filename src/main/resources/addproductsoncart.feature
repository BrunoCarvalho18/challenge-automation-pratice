#Author: Bruno Carvalho

@general
Feature: Add Products
  I would like to add the products on cart

  @add-products
  Scenario: Add poduct on cart
    Given  I am on the home page
    When I put this on the cart
    Then I should see products on the cart