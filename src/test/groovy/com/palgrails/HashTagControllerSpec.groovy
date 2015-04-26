package com.palgrails

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HashTagController)
class HashTagControllerSpec extends Specification {

    def setup() { }

    def cleanup() { }

    void "Index returns a list of hashtags for a given Twitter handle"() {
        expect: "a list"
            controller.getPalCount(str) == count

        where:
            str                                             | count
            null                                            | 0
            ''                                              | 0
            '#*&$#^'                                        | 0
            'a'                                             | 1
            '#asdf'                                         | 16
            'asdf'                                          | 16
            'tag with spaces'                               | 10000000
            'tagwithspaces'                                 | 10000000
            'tag_with_spaces'                               | 214358881
            'LongerTagWithMixedCase'                        | 17592186044416
            'LongerTagWithMixedCaseLongerTagWithMixedCase'  | 9223372036854775807
    }

    void "Palindrom counts"() {
        expect: "correct palindrom counts are returned"
            controller.getPalCount(str) == count

        where:
            str                                             | count
            null                                            | 0
            ''                                              | 0
            '#*&$#^'                                        | 0
            'a'                                             | 1
            '#asdf'                                         | 16
            'asdf'                                          | 16
            'tag with spaces'                               | 10000000
            'tagwithspaces'                                 | 10000000
            'tag_with_spaces'                               | 214358881
            'LongerTagWithMixedCase'                        | 17592186044416
            'LongerTagWithMixedCaseLongerTagWithMixedCase'  | 9223372036854775807
    }
}
