/**
 * Example of writing custom application-specific steps
 */

import pages.*

import static cucumber.api.groovy.EN.*

Given(~/I am on the Intel home page/) { ->
	to IntelHomePage
}

When(~/I click the Sign In Link/) { ->
	page.documentationLink.click()
}

/* Then(~/I end up at The Book of Geb/) { ->
	at BookOfGebPage
} */

