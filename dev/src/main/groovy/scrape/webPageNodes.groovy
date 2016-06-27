package scrape.app

// Grap HTTPBuilder from maven repo
@Grab(group='org.codehaus.groovy.modules.http-builder',
        module='http-builder',
        version='0.7.1')
// import of HttpBuilder related stuff
import groovyx.net.http.*

def webPageNodes(String url, String domKey) {
    // Set up
    def http = new HTTPBuilder(url)
    // Pull the DOM
    def html = http.get([:])
    // Return a list of NodeChilds that have class containing the DOM key
    html."**".findAll { it.@class.toString().contains(domkey)}
}
