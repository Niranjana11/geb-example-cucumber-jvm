package pages

import geb.Page

class BookOfGebPage extends Page {

    static at = { title.contains("Intel") }

}
