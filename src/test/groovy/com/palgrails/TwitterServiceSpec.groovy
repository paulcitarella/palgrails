package com.palgrails

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(TwitterService)
class TwitterServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Parse hashtags from a string"() {
        expect: "hashtags are returned"
            service.parseHashTags(str) == tags

        where:
            str                                             | tags
            null                                            | []
            ""                                              | []
            "lkajsdf jaslkj"                                | []
            "#one"                                          | ['one']
            "asdf #one oijasdlfij #two lkjdflj"             | ['one', 'two']
            "asdf #one #two #three lkjdflj"                 | ['one', 'two', 'three']
            "asdf #one#two#three lkjdflj"                   | ['one', 'two', 'three']
            "asdf lkjdflj #four #five"                      | ['four', 'five']
            "asdf lkjdflj #same #same"                      | ['same', 'same']
    }
}
