package pages

import geb.Page

class IntelHomePage extends Page {
    static at = { title.startsWith("Intel") }
    static content = {
        headings { $('h2') }
        firstHeading { headings[0] }
        documentationLink(to: BookOfGebPage) { $( text: 'Sign In') }
    }
}
