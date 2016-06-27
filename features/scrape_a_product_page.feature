Feature: Scrape product data from a page on Sainsburys grocery site

  As a developer
  I want to extract product item data from a web page
  So that I can make alternative use of the data

  Scenario: Create a JSON format list of product items on the page
    Given URL of the page containing Ripe Fruit products
    When I visit the URL
    Then Create a JSON representation of all product items that I find



