package scrape.app

// Grap HTTPBuilder from maven repo
@Grab(group='org.codehaus.groovy.modules.http-builder',
        module='http-builder',
        version='0.7.1')
// import of HttpBuilder related stuff
import groovyx.net.http.*

def webPageNodeElement(Object node, String domKey) {
    // Return a element text for DOM key within the node
    node."**".find { it.@class.toString().contains(domkey)}
}