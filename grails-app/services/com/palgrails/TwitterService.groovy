package com.palgrails

import grails.transaction.Transactional
import twitter4j.*

@Transactional
class TwitterService {

    List getHashTags(String handle) {
        Twitter twitter = TwitterFactory.singleton
        def statuses = twitter.getUserTimeline(handle, new Paging(1, 50)).collect { it.text }
        parseHashTags(statuses.join(' ')).unique()
    }

    List parseHashTags(String str) {
        if (!str) return []
        (str =~ /#(\w*)/).collect { it[1] }
    }
}
