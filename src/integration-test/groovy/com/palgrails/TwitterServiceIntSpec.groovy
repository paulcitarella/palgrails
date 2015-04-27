package com.palgrails


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class TwitterServiceIntSpec extends Specification {

    @Autowired
    TwitterService twitterService

    def setup() {
    }

    def cleanup() {
    }

    void "Get twitter hashtags"() {
        expect: "a list is hashtags is returned"
            twitterService.getHashTags("HubSpot").size() > 1
    }
}
