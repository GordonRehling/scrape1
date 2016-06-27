package scrape.app

import scrape.webPageNodes
import scrape.webPageNodeElement
import scrape.webPageBytes

// Use BigDecimal for accuracy as it's money
def BigDecimal parseForNumber( String input ) {
    input.find( /-?\d+\.\d*|-?\d*\.\d+|-?\d+/ ).toBigDecimal()
}


def mainPage = "http://hiring-tests.s3-website-eu-west-1.amazonaws.com/2015_Developer_Scrape/5_products.html"

// Money so use BigDecimal for accuracy
def BigDecimal total = 0.0

def productsOnPage = []

def nodes = webPageNodes(mainPage, "product ")
nodes.each {
    def nodeProduct = it

    def title = webPageNodeElement(nodeProduct, 'productInfo')
    def unitPriceText = webPageNodeElement(nodeProduct, 'pricePerunit')
    def unitPrice = parseForNumber(unitPriceText.toString())

    def link = 'todo'
    def description = 'todo'

    // Create a Map of above data and add to productsOnPage list
}

// Money so use BigDecimal for accuracy
def BigDecimal total = 0.0

productsOnPage.each {
        total += it.unitPrice
}

// Create the JSON string
// TODO