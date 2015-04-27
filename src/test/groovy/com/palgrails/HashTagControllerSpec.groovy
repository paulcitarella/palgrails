package com.palgrails

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HashTagController)
class HashTagControllerSpec extends Specification {

    def twitterServiceMock = Mock(TwitterService)

    def setup() {
        controller.twitterService = twitterServiceMock
    }

    def cleanup() { }

    void "Index returns a list of hashtags for a given Twitter handle"() {
        given: "a Twitter response is setup"
            twitterServiceMock.getHashTags(_) >> ['HashTag', 'AnotherHashTag', 'YetAnotherHashTag']

        when: "index is requested"
            controller.index("SomeHandle")

        then: "a JSON response is returned"
            controller.response.json.size() == 3
            def tag1 = controller.response.json[0]
            tag1.tag == 'HashTag'
            tag1.count == 625
            def tag2 = controller.response.json[1]
            tag2.tag == 'AnotherHashTag'
            tag2.count == 4782969
            def tag3 = controller.response.json[2]
            tag3.tag == 'YetAnotherHashTag'
            tag3.count == 1000000000
    }

    void "Palindrome counts"() {
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
