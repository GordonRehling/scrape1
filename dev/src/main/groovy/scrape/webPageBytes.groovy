package scrape.app

Integer webPageBytes(String url) {
    // Get the HTML content at the url
    def content = new URL(url).getText()
    // Return number of bytes in the content
    content.size()
}
