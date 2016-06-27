Given /^URL of a page$/ {
    def url = "http://hiring-tests.s3-website-eu-west-1.amazonaws.com/2015_Developer_Scrape/sainsburys-apricot-ripe---ready-320g.html"
}

When /^I visit the URL$/ {
    pending
}

Then /^Count the bytes of html in the page$/ {
    def bytes = webPageBytes(url)
    assert bytes != 0
}
