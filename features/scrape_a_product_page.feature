Feature: Scrape product data from a page on Sainsburys grocery site

  As a developer
  I want to extract product item data from a web page
  So that I can make alternative use of the data

  Scenario: Create a JSON format list of product items on the page
    Given URL of the page containing Ripe Fruit products
    When I visit the URL
    Then Create a JSON representation of all product items that I find

  Scenario: Get a list of Nodes that match a DOM key
    Given URL of a page and a DOM key
    When I visit the URL and specify the DOM key
    Then Return a list of Nodes that match the DOM key

  Scenario: Get the text content that matches the DOM key within a supplied DOM node
    Given A DOM node and a DOM key
    When I search the DOM node for the DOM key specified
    Then Return the text for the DOM key

  Scenario: Get the size of a web page excluding assets
    Given URL of a page
    When I visit the URL
    Then Count the bytes of html in the page


