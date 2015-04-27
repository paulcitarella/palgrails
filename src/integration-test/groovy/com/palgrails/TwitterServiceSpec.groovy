package com.palgrails


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class TwitterServiceSpec extends Specification {

    @Autowired
    TwitterService twitterService

    def setup() {
    }

    def cleanup() {
    }

    void "Get twitter hashtags"() {
        expect: "an empty list is returned"
            twitterService.getHashTags("asdf") == []
    }
}
