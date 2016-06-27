Given /^URL of a page$/ {
    def url = "http://hiring-tests.s3-website-eu-west-1.amazonaws.com/2015_Developer_Scrape/5_products.html"
    def domKey = "product "
}

When /^I visit the URL$/ {
    pending
}

Then /^Return a list of Nodes that match the DOM key$/ {
    def nodes = webPageNodes(url, domKey)
    assert nodes.size() == 7
}